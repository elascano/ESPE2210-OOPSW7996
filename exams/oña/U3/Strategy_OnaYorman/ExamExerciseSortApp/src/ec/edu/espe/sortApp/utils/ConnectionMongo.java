
package ec.edu.espe.sortApp.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class ConnectionMongo {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://yona:oop22@cluster0.ppsjulz.mongodb.net/test";
        String db = "ExamExercise3P";
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
