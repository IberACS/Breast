/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;
import java.awt.event.ItemEvent;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;

/**
 *
 * @author conde
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          // Creating a Mongo client 
              JavaMongodbList javaMongodbList = new JavaMongodbList();

        javaMongodbList.connectDatabase();

        // List all the BRCA (Mostramos todos los Datos).

        javaMongodbList.listBRCA();

        // List the BRCA with "GDC" cuisine  (Mostramos los Datos con cuisine igual a "GDC").

        javaMongodbList.listBRCAByCuisine("BRCA");
        
        System.out.println(1 + 1);
   }
        
    }
    
