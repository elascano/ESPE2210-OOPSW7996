package com.mycompany.mongoconection;

import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.*;
import org.bson.conversions.Bson;
import org.bson.*;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class MongoConection {

    public static void main(String[] args) {

        String uri = "mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                MongoCollection collection = database.getCollection("Customer");

                Bson filter = Filters.and(Filters.gt("age", 7));
                System.out.println("---> " + collection.find(filter).first());
                
                //to print some documents, I must use a loop: for, for each, while
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }

    }
}
