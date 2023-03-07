package ec.edu.espe.fashionStore.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.fashionstore.model.Measurement;
import ec.edu.espe.fashionstore.model.Order;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class ControllerOrder {

    public static void CreateOrder(Order order) {
        String uri = "mongodb+srv://17POO:password555@fashionstore.nh5mcou.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FashionStore");

            try {
                //Conection with database server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                Measurement measurement = new Measurement();

                Controller.insertDocumentMongo(database, order);
            } catch (MongoException me) {
                System.err.println("An error ocurred while attempting to connect: " + me);
            }
        }

    }
}
