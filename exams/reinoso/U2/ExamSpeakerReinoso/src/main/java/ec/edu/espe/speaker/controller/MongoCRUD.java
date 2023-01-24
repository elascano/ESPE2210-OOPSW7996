package ec.edu.espe.speaker.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class MongoCRUD {

    private static final String uri = "mongodb+srv://JerlyReinoso:R1RNC@jerlyreinoso.vwcbpz1.mongodb.net/test";
    private static final Scanner scan = new Scanner(System.in);
    private static final String collection = "Speaker";
    private static final String databaseName = "exam";

    public static void addToMongo(Document product, String collection) {

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase(databaseName);
            try {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection(collection);

                productCollection.insertOne(product);

                System.out.println("New Product has been added: " + product.get("name"));

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void readMongo(int id, String collection) {

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase(databaseName);
            try {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection(collection);

                Bson filter = Filters.eq("id", id);

                try {
                    Document query = productCollection.find(Filters.and(filter)).first();

                    System.out.println("Product --> " + query.toJson());

                } catch (Exception e) {
                    System.out.println("Product not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }


}
