package ec.edu.espe.movie.controller;

import com.mongodb.ErrorCategory;
import com.mongodb.MongoException;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.movie.model.Movie;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class DataController {
    public static void saveInformation(Movie movie,String collection){
        
        String uri = "mongodb+srv://oop:oop2003@cluster0.orrbl25.mongodb.net/test";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("examns");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
                MongoCollection collectionDb = database.getCollection(collection);
                
                Document movieAdded = new Document();
                movieAdded.append("_id", movie.getId())
                        .append("name", movie.getNombre())
                        .append("age", movie.getAge());
                try {
                collectionDb.insertOne(movieAdded);
                System.out.println("successfully inserted movie. \n");
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

