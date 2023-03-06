package ec.edu.espe.sortapp.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.InputMismatchException;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class MongoController {
    public static void saveData(String data, String sortedData, int length, String sortAlgorithm){
        String uri = "mongodb+srv://casalazar22:oop@cluster0.k8k6u34.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                Document dataAdded = new Document();
                
                dataAdded.append("unsorted", data)
                        .append("size",length)
                        .append("sort algorithm", sortAlgorithm)
                        .append("sorted",sortedData);

                MongoCollection collection = database.getCollection("dataSort");
                
                collection.insertOne(dataAdded);
                
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
}
