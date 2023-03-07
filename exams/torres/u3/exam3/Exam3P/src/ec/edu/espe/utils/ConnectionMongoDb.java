package ec.edu.espe.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ConnectionMongoDb {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://OOP:OOP@clusteroop.htwlkgc.mongodb.net/test";
        String db = "Exam3";
        try {
            MongoClient mongoClient = MongoClients.create(uri);
            mongodb = mongoClient.getDatabase(db);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static MongoDatabase getConnection() {
        return mongodb;
    }

}
