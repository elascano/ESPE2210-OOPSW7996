package ec.edu.espe.Food.model;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class MongoDBConnection {
    
public static MongoDatabase database = null;
    
    public MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://yona:oop22@cluster0.ppsjulz.mongodb.net/test";
            String db = "FoodSystem";

            com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri);

            MongoDBConnection.database = mongoClient.getDatabase(db);
        }
        return MongoDBConnection.database;
    }
}

