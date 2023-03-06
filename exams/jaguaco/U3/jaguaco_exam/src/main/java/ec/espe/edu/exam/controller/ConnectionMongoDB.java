package ec.espe.edu.exam.controller;

import com.mongodb.MongoException;
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
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class ConnectionMongoDB {

    public static MongoCollection<Document> getCollection(String arrayJonathan){
        return null;
    }

    String uri = "mongodb+srv://JonathanJaguaco:20030706@cluster0.1mcsniu.mongodb.net/?retryWrites=true&w=majority";

    public void connectToDatabase() {
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("arrayJonathan");

            // Check the connection
            Bson command = new BsonDocument("ping", new BsonInt64(1));
            org.bson.Document commandResult = database.runCommand(command);
            System.out.println("Connected successfully to server.");

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
    }

}
