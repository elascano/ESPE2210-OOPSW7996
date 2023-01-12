/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.shopinventory_v2.model.Product;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class MongoCRUD {
    
    private static final String uri = "mongodb+srv://OOP:OOP@clusteroop.htwlkgc.mongodb.net/?retryWrites=true&w=majority";
    private static final Scanner scan = new Scanner(System.in);
    
    public static void addToMongo(Document product, String collection) {

        try ( MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("HuertoEcoMarket");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection( collection);

                productCollection.insertOne(product);
                
                System.out.println("New Product has been added: " + product.get("name"));

            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
    
    public static void readMongo(int id, String collection) {

        try ( MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("HuertoEcoMarket");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection(collection);

                
                
                Bson filter = Filters.eq("id", id);
                
                try
                {
                    Document query = productCollection.find(Filters.and(filter)).first();
                    
                    System.out.println("Product --> " + query.toJson());

                } catch (Exception e)
                {
                    System.out.println("Product not found");
                }
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
    
    public static void updateMongo(int id, String collection, Product product) {

        try ( MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("HuertoEcoMarket");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection(collection);
                
                Bson filter = Filters.eq("id", id);
                
                Bson modifyProduct = Updates.combine(
                        Updates.set("name", product.getName()),
                        Updates.set("amount", product.getAmount()),
                        Updates.set("price", product.getPrice()));
                
                productCollection.updateOne(filter, modifyProduct);
                
                System.out.println("Product update succesfully");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
    
    public static void deleteMongo(int id, String collection) {

        try ( MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("HuertoEcoMarket");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> productCollection = database.getCollection(collection);

                Bson filter = Filters.eq("id", id);
                
                productCollection.deleteOne(filter);
                
                System.out.println("Product deleted succesfully");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
}
