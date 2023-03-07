
package ec.edu.espe.ecomarket.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Connection {

    public static MongoDatabase mongodb = null;

    private Connection() {

    }

    public static MongoDatabase connectionDataBase() {

        if (mongodb == null) {
            String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
            String db = "PACSTORE";

            MongoClient mongoClient = MongoClients.create(uri);

            Connection.mongodb = mongoClient.getDatabase(db);
        }

        return Connection.mongodb;

    }
}
