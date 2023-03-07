
package ec.edu.espe.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 *@author Karla Ansatuña,Scriptal, DCCO_ESPE
 */
public class ConnectionMongo {

    public static MongoDatabase mongodb = null;

    static {
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";
        String db = "AnsatuñaKarlaExam3P";
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
