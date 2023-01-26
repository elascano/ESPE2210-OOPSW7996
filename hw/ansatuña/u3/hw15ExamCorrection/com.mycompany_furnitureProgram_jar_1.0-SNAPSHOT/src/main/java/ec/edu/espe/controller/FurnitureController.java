/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.model.Furniture;
import ec.edu.espe.utils.MongoDbConnection;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Karla Ansatuña
 */
public class FurnitureController {
 private static final Scanner sc = new Scanner(System.in);

    public static void insertFurniture(String id, String name, String date, String description) {
        MongoCollection<Document> collectionFurniture = MongoDbConnection.getConnection("Furniture");

        Document furniture = new Document("_id", new ObjectId())
                .append("name", name)
                .append("id", id)
                .append("date", date)
                .append("description", description);

        collectionFurniture.insertOne(furniture);
    }
    public static Furniture findFurniture(String id) {

        Gson gson = new Gson();
        MongoCollection<Document> collection = MongoDbConnection.getConnection("Furniture");
        Bson filter = Filters.eq("id", id);
        MongoCursor<Document> cursor = collection.find(filter).limit(1).iterator();

        if (cursor.hasNext()) {
            Document doc = collection.find(filter).first();
            String eventDoc = doc.toJson();
            Furniture furniture = gson.fromJson(eventDoc, Furniture.class);
            return furniture;
        }
        return new Furniture("", "", "", "");
    }
}
