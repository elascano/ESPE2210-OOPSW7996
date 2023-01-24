/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.keyboardStore.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.keyboardStore.model.Keyboard;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class KeyboardDbController {
    
    private static MongoClient conectDB(){
        String irl = "mongodb+srv://JoshSy01:060903@cluster0.2sziitx.mongodb.net/test";
        MongoClient mongoClient = MongoClients.create(irl);
        return mongoClient;
    }
    
    public static void addKeyboard(Keyboard keyboard){
        MongoClient mongoClient = conectDB();
        MongoDatabase database = mongoClient.getDatabase("KeyboardStore");
        String status = "done";
        MongoCollection<Document> collection = database.getCollection("Keyboards");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", keyboard.getId())
                .append("name", keyboard.getName())
                .append("mechanicOrMembrane", keyboard.getMechanicOrMembrane())
                .append("price", keyboard.getPrice())
                .append("status", status);

        collection.insertOne(inspection);
    }
}
