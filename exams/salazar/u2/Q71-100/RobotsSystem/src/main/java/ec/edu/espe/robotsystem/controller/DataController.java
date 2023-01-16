/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.robotsystem.controller;

import com.mongodb.ErrorCategory;
import com.mongodb.MongoException;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.robotsystem.model.Robot;
import org.bson.Document;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class DataController {
    
    public static void saveInformation(Robot robot,String collection){
        
        String uri = "mongodb+srv://casalazar22:oop@cluster0.k8k6u34.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
                MongoCollection collectionDb = database.getCollection(collection);
                
                Document robotAdded = new Document();
                robotAdded.append("_id", robot.getId())
                        .append("funtion", robot.getFuntion())
                        .append("age", robot.getAge());
                try {
                collectionDb.insertOne(robotAdded);
                System.out.println("Successfully inserted robot. \n");
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
