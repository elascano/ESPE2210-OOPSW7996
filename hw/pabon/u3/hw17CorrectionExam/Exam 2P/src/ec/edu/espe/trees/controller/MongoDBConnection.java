package ec.edu.espe.trees.controller;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class MongoDBConnection {
    
    public static MongoDatabase database = null;
    
    public MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://eapabon:2002123@database.sdflumv.mongodb.net/test";
            String db = "Trees";

            MongoClient mongoClient = MongoClients.create(uri);

            MongoDBConnection.database = mongoClient.getDatabase(db);
        }
        
        
        return MongoDBConnection.database;
    }
    
    public com.mongodb.MongoClient conectionMongo(){
        String uri="mongodb+srv://eapabon:2002123@database.sdflumv.mongodb.net/test";
        MongoClientURI clientURI;
        com.mongodb.MongoClient client;
       
        clientURI= new MongoClientURI(uri);
        client = new com.mongodb.MongoClient(clientURI);
        return client;
      }

    
}
