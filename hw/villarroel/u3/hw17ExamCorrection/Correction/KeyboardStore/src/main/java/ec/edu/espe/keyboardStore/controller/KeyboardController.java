/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.keyboardStore.controller;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.keyboardStore.model.Keyboard;
import ec.edu.espe.keyboardStore.utils.MongoDBManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class KeyboardController {

    static public void createKeyboardMdb(Keyboard keyboard) {
        MongoClient mongoClient = MongoDBManager.conectionDB();
        MongoDatabase database = mongoClient.getDatabase("KeyboardStore");
        String status = "done";
        MongoCollection<Document> collection = database.getCollection("Keyboard");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", keyboard.getId())
                .append("tradeMark", keyboard.getTradeMark())
                .append("keyboardType", keyboard.getKeyboardType())
                .append("price", keyboard.getPrice())
                .append("status", status);

        collection.insertOne(inspection);
    }

    public static ArrayList<Keyboard> loadFromDatabase(ArrayList<Keyboard> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson();
        MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<Document> result = objectsCollection.find(Filters.gt("id", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), Keyboard.class)));
        return objects;
    }

    public static Keyboard findKeyboardMdb(Keyboard keyboard, int idFinder) {
        MongoClient mongoClient = MongoDBManager.conectionDB();
        MongoDatabase database = mongoClient.getDatabase("KeyboardStore");
        MongoCollection<Document> collection = database.getCollection("Keyboard");
        Bson filter = Filters.and(Filters.all("id", idFinder));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if (collection.find(filter).first() != null) {
            Document document = collection.find(filter).first();
            keyboard.setTradeMark(document.getString("tradeMark"));
            keyboard.setKeyboardType(document.getString("keyboardType"));
            keyboard.setPrice(Float.valueOf(Double.toString(document.getDouble("price"))));
            keyboard.setId((int) document.get("id"));
        } else if (keyboard.getPrice() == 0) {
            JOptionPane.showMessageDialog(null, "Id not found");
            return keyboard;
        }
        return keyboard;
    }
}
