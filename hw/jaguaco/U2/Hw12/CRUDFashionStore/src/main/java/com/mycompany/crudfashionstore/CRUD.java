package com.mycompany.crudfashionstore;

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
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class CRUD {
    public static void main(String[] args) {
        String uri = "mongodb+srv://JonathanJaguaco:20030706@cluster0.1mcsniu.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("JonathanJaguaco");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
                MongoCollection collection = database.getCollection("UserInformation");
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
 
        }


        System.out.println("Complete the new Document"); 
        System.out.println("1.Insert a new Client");
        System.out.println("2.Update a some Client");
        System.out.println("3.Find a some Client");
        System.out.println("4.Delete a some Client");
    }    
}
