package ec.edu.espe.fashionStore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.fashionstore.model.Order;
import java.util.ArrayList;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class ControllerCalendar {

    public static void SearchNearOrders() {
        String[] orders = new String[5];
        String document = "";
        ArrayList<String> orderDates = new ArrayList<>();
        Gson gson = new Gson();

        String uri = "mongodb+srv://17POO:password555@fashionstore.nh5mcou.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("FashionStore");
            try {
                //Conection with database server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                MongoCollection<Document> collection = database.getCollection("Orders");
                Bson filter1 = Filters.eq("month", "February");
                Bson filter2 = Filters.eq("year", "2023");
                Document query = collection.find(Filters.and(filter1, filter2)).first();
                MongoCursor<Document> cursor = collection.find(Filters.and(filter1, filter2)).iterator();
                document = query.toJson();

                TypeToken<Order> type = new TypeToken<Order>() {
                };
            } catch (MongoException me) {
                System.err.println("An error ocurred while attempting to connect: " + me);
            }
        }
    }
}
