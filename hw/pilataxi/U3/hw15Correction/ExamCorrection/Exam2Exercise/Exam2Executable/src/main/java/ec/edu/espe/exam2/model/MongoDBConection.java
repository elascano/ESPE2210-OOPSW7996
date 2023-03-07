
package ec.edu.espe.exam2.model;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class MongoDBConection {
    public static MongoDatabase database = null;
    
    public MongoDatabase connectDatabase(){
        
        if (database == null) {
            String uri = "mongodb+srv://diegop:diegop@cluster0.skonea2.mongodb.net/test";
            String db = "ExamUnit2";

            com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri);

            MongoDBConection.database = mongoClient.getDatabase(db);
        }
        return MongoDBConection.database;
    }
}
