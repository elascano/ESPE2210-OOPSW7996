package ec.edu.espe.robotsystem.utils;

import com.mongodb.ErrorCategory;
import com.mongodb.MongoException;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class MongoController {
    
    public static void addToCollection(Document documentAdded, String collectionName){
        
        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://casalazar22:oop@cluster0.k8k6u34.mongodb.net/?retryWrites=true&w=majority")) {
            
            MongoDatabase database = mongoClient.getDatabase("oop");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
                MongoCollection collection = database.getCollection(collectionName);
                try {
                    collection.insertOne(documentAdded);
                    System.out.println("Successfully inserted robot.");
                } catch (MongoWriteException mwe) {
                    if (mwe.getError().getCategory().equals(ErrorCategory.DUPLICATE_KEY)) {
                        System.out.println("Document with that id already exists");
                    }
                }
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }
    
}
