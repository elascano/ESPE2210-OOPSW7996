package com.mycompany.ec.edu.espe.ws27;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import javax.swing.text.Document;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class EcEduEspeWs27 {

    public static void main(String[] args) {
        String uri = "mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));

                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                MongoCollection collection = database.getCollection("Customer");

                Bson filter = Filters.and(Filters.gt("age", 25));
                System.out.println("---> " + collection.find(filter).first());

                //to print some documents, I must use a loop: for, for each, while
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }

    }
}