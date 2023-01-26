
package ec.edu.espe.q61_70.model;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class MongoConnection {
public static MongoDatabase database = null;
        public MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://avpanchi:allan2003@cluster0.pbnwbgy.mongodb.net/test";
            String db = "Exam2";

            com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri);

            MongoConnection.database = mongoClient.getDatabase(db);
        }
        return MongoConnection.database;
    }
}
