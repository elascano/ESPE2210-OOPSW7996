/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.DinosaursSimulator.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.DinosaursSimulator.model.Dinosaur;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class DBManager {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static Dinosaur find(Dinosaur enteredProduct) {

        String uri = "mongodb+srv://OOP:OOP@clusteroop.htwlkgc.mongodb.net/test";
        Dinosaur dinosaur = new Dinosaur();

        try ( com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam");
            try {
                MongoCollection<Document> productCollection = database.getCollection("Dinosaurs");
                Bson filter = Filters.eq("id", enteredProduct.getId());
                try {
                    
                    Document doc = productCollection.find(Filters.and(filter)).first();
                    
                    int id = (int) doc.get("id");
                    String name = (String) doc.get("name");
                    int age = (int) doc.get("age");

                    dinosaur.setId(id);
                    dinosaur.setName(name);
                    dinosaur.setAge(age);
                    

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }

       

        return dinosaur;

    }
  
    public static void save(Dinosaur enteredDinosaurs) {//a//

        String uri = "mongodb+srv://OOP:OOP@clusteroop.htwlkgc.mongodb.net/test";

        System.out.println("___________________________________________________________________________________________");
        try ( com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam");

            try {

                System.out.println("The connection to the EcoMarketS database was successful.");
                System.out.println("_________________________________________________________________________________________");
                MongoCollection<Document> productCollection = database.getCollection("Dinosaurs");
                //MongoCollection<Document> inventoryCollection = database.getCollection("Inventory");

                Bson filter = Filters.eq("id", enteredDinosaurs.getId());

                if (productCollection.find(filter).first() == null) {
                    Document dinosaur = new Document("_id", new ObjectId())
                            .append("id", enteredDinosaurs.getId())
                            .append("name", enteredDinosaurs.getName())
                            .append("age", enteredDinosaurs.getAge());

                    productCollection.insertOne(dinosaur);
                    //Document inventory = registerInventory(enteredProducts);
                    //inventoryCollection.insertOne(inventory);
                    System.out.println("New product has agragated: " + enteredDinosaurs.getName());

                } else if (productCollection.find(filter).first() != null) {

                    System.out.println("This product is already registered");

                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }

    }//

    public static void update(int id , Dinosaur enteredDinosaur) {///****////

        String uri = "mongodb+srv://OOP:OOP@clusteroop.htwlkgc.mongodb.net/test";
        System.out.println("___________________________________________________________________________________________");
        try ( com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam");
            try {

                MongoCollection<Document> productCollection = database.getCollection("Dinosaurs");
                Bson filter = Filters.eq("id", id);

                Bson productUpdate = Updates.combine(Updates.set("id", enteredDinosaur.getId()),
                        Updates.set("name", enteredDinosaur.getName()),
                        Updates.set("age", enteredDinosaur.getAge())
                );
                productCollection.updateOne(filter, productUpdate);

            } catch (Exception e) {
                System.out.println("Data not found");
            }
        } catch (MongoException me) {
            System.out.println("An error occurred while attempting to connect: " + me);
        }

    }

    public static void delete(Dinosaur dinosaur) {

        String uri = "mongodb+srv://OOP:OOP@clusteroop.htwlkgc.mongodb.net/test";
        System.out.println("___________________________________________________________________________________________");
        try ( com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam");
            try {

                MongoCollection<Document> productCollection = database.getCollection("Dinosaurs");

                Bson filter = Filters.eq("id", dinosaur.getId());

                while (productCollection.find(filter).first() != null) {

                    productCollection.deleteOne(filter);

                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

    }

}
