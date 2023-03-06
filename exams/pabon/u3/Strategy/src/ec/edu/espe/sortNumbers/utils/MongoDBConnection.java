package ec.edu.espe.sortNumbers.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class MongoDBConnection {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://eapabon:2002123@database.sdflumv.mongodb.net/test";
        String db = "strategyPabon";
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
