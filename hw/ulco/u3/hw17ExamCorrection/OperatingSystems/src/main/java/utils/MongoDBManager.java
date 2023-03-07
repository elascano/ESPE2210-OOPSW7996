/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.operatingSystems.model.OperatingSystem;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class MongoDBManager {
     public static void Create(OperatingSystem operatingSystem) {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("OperatingSystems");
            try {
                System.out.println("Connected successfully to server.");
             
                MongoCollection<Document> collection = database.getCollection("OperatingSystem");
                
                Document operatingSystems = new Document("_id", new ObjectId())
                        .append("id", operatingSystem.getId())
                        .append("name", operatingSystem.getName())
                        .append("year",operatingSystem.getYear());

                collection.insertOne(operatingSystems);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
      
     public static void Read(MongoDatabase database, String collectionName, ArrayList<OperatingSystem> objects) {
        Gson gson = new Gson();
        MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<Document> result = objectsCollection.find(Filters.gt("id", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), OperatingSystem.class)));
    }
  
}
