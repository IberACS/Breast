/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author conde
 */
public class JavaMongodbList {

    private MongoClient mongoClient;    // Java MongoDB client (Cliente Java MongoDB)

    private MongoDatabase mongodb;      // Database object (Objeto base de datos)

    /**

     * We establish the connection with the database <b>test</b>.

     * Establecemos la conexión con la base de datos <b>test</b>.

     */

    public void connectDatabase(){

        setMongoClient(new MongoClient("localhost", 27017));

        setMongodb(getMongoClient().getDatabase("GDC"));

    }

    /**

     * Get the list of all the restaurants (each is a document) in the database

     * and shown on screen.

     * Obtenemos la lista de todos los BRCA (cada uno es un documento)

     * de la base de datos y los mostramos por pantalla.

     */

    public void listBRCA(){

        // To return all documents in a collection, call the find method without a criteria document.

        // Para devolver todos los documentos en una colección, llamamos al método find sin ningún documento <b>criteria</b>

        FindIterable<Document> iterable = getMongodb().getCollection("BRCA").find();

        // Iterate the results and apply a block to each resulting document.

        // Iteramos los resultados y aplicacimos un bloque para cada documento.

        iterable.forEach(new Block<Document>() {

            @Override

            public void apply(final Document document) {

                System.out.println(document);

            }

        });

    }

    /**

     * Obtenemos la lista de todos los BRCA de la base de datos filtrando

     * por el tipo de cocina con el paso del parámetro <b>cuisine</b> y los mostramos por pantalla.

     * @param cuisine <code>String</code> data value to filter (valor para filtrar)

     */

    public void listBRCAByCuisine(String cuisine){

        // We return documents with the find method by setting a <b>criteria</ b> element equal to the cuisine.

        // Devolvemos los documentos con el método find estableciendo un <b>criteria</b> igual para el elemento cuisine.

        FindIterable<Document> iterable = getMongodb().getCollection("BRCA").find(new Document("cuisine", cuisine));

        // Iterate the results and apply a block to each resulting document.

        // Iteramos los resultados y aplicacimos un bloque para cada documento.

        iterable.forEach(new Block<Document>() {

            @Override

            public void apply(final Document document) {

                System.out.println(document);

 

            }

        });

    }

 

 

    public MongoClient getMongoClient() {

        return mongoClient;

    }

 

    public void setMongoClient(MongoClient mongoClient) {

        this.mongoClient = mongoClient;

    }

 

    public MongoDatabase getMongodb() {

        return mongodb;

    }

 

    public void setMongodb(MongoDatabase mongodb) {

        this.mongodb = mongodb;

    }
}

    /**

     * We execute methods to display restaurants.

     * Ejecutamos los métodos para mostrar los restaurantes.

     * @param args 

     */
