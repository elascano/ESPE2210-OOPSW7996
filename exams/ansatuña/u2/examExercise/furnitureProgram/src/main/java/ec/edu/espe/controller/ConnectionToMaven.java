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
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.model.Furniture;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Karla Ansatuña
 */
public class ConnectionToMaven {

    public static void insertFurniture(Furniture furniture) {
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("ex");
            try {
                System.out.println("Connected successfully to the server.");
                MongoCollection<Document> collectionResident = database.getCollection("Furniture");

                Document events = new Document("_id", new ObjectId())
                        .append("name", furniture.getName())
                        .append("id", furniture.getId())
                        .append("date", furniture.getDate())
                        .append("description", furniture.getDescription());

                collectionResident.insertOne(events);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static Furniture findFurniture(Furniture furniture) {

        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ex");
            try {
                MongoCollection<Document> collectionFurniture = database.getCollection("Furniture");

                Bson filter = Filters.eq("id", furniture.getId());
                try {
                    Document doc = collectionFurniture.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<Furniture> type = new TypeToken<Furniture>() {
                    };
                    furniture = gson.fromJson(Data, type.getType());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return furniture;
    }

}
