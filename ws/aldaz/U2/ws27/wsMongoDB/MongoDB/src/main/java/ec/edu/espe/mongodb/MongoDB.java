package ec.edu.espe.mongodb;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */

public class MongoDB {

    public static void main(String[] args) {

        String uri = "mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/?retryWrites=true&w=majority";
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                MongoCollection collection = database.getCollection("Customer");

                Bson filter = Filters.and(Filters.gt("age", 5));
                MongoCursor<Document> cursor = collection.find(filter).iterator();
                
                try {
                    while (cursor.hasNext()) {
                        System.out.println(cursor.next().toJson());                        
                    }
                } finally {
                    cursor.close();
                }                                
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
}
