package ec.edu.espe.restaurant.controller;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class MongoDBConnection {
    
public static MongoDatabase database = null;
    private MongoDBConnection(){}
    public static MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://poo:poo1@cluster0.jfzncfw.mongodb.net/test";
            String db = "Restaurant";

            com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri);

            MongoDBConnection.database = mongoClient.getDatabase(db);
        }
        return MongoDBConnection.database;
    }
}

