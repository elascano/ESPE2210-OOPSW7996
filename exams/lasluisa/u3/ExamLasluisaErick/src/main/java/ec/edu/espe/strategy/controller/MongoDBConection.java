package ec.edu.espe.strategy.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class MongoDBConection {
    private static final Scanner sc = new Scanner(System.in);
    public static void insertDocumentMongo(MongoDatabase database, String item) {

        MongoCollection<Document> collection = database.getCollection("arrayErick");
        Document inspection = new Document("_id", new ObjectId())
                .append("item", item);

        collection.insertOne(inspection);

    }

}
