/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.SingletonInGUI.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.DeleteResult;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class CRUDinMongoDB {

    final String uri = "mongodb+srv://pinza:153@pinzadatabase.yy2byr4.mongodb.net/?retryWrites=true&w=majority";
    Scanner scan = new Scanner(System.in);

    private static CRUDinMongoDB instance;

    private CRUDinMongoDB() {

    }

    public static CRUDinMongoDB getInstance() {
        if (instance == null) {
            instance = new CRUDinMongoDB();
        }
        return instance;
    }

    public void ConnectionWithDB() {

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Test");
            MongoCollection<Document> collection = database.getCollection("Taxes");
            Document doc = collection.find(eq("name", "Pola")).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
    }

    public void DeleteObjectFromDB(int parameter) {
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Test");
            MongoCollection<Document> collection = database.getCollection("Taxes");


            Bson query = eq("id", parameter);

            try {
                DeleteResult result = collection.deleteOne(query);
                System.out.println("The object " + parameter + " was sucessfully deleted!");
            } catch (MongoException me) {
                System.out.println("The system was unable to delete the object");
            }
        }

    }

    public void CreateObjectInDB(int id, String name, double price) {
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Test");

            Document document = new Document();

            document.append("id", id);
            document.append("name", name);
            document.append("price", price);

            database.getCollection("Taxes").insertOne(document);

        }
    }

}
