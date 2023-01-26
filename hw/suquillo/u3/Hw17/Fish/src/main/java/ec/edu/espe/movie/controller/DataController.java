package ec.edu.espe.movie.controller;

import com.mongodb.ErrorCategory;
import com.mongodb.MongoException;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.movie.model.Fish;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class DataController {
    public static void saveInformation(Fish fish,String collection){
        
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
                MongoCollection collectionDb = database.getCollection(collection);
                
                Document fishAdded = new Document();
                fishAdded.append("id", fish.getId())
                        .append("name", fish.getName())
                        .append("age", fish.getAge());
                try {
                collectionDb.insertOne(fishAdded);
                System.out.println("successfully inserted fish. \n");
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

