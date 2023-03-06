
package ec.edu.espe.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ConnectionMongo {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://avpanchi:allan2003@cluster0.pbnwbgy.mongodb.net/test";
        String db = "strategyPanchi";
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
