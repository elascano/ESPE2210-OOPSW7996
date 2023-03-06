
package ec.edu.espe.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Rivera Joel DDCO-ESPE
 */
public class ConnectionMongo {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://JoelRivera:1234@cluster0.nn7qeip.mongodb.net/?retryWrites=true&w=majority";
        String db = "Sort";
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
