package ec.edu.espe.ws28.model;

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
            String uri = "mongodb+srv://stevenpozo12:stevenpozo12@cluster0.zjzsk9i.mongodb.net/?retryWrites=true&w=majority";
            String db = "LeatherFlowerSystem";

            com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri);

            MongoDBConnection.database = mongoClient.getDatabase(db);
        }
        return MongoDBConnection.database;
    }
    
}
