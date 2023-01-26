package ec.espe.edu.SoccerTeam.controller;

import java.util.Scanner;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.conversions.Bson;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class MongoDB {
    
    private static final Scanner sc = new Scanner(System.in);
    
    public static void insert() {
        int id;
        boolean isAvailable;
        String name;
        String url = "mongodb+srv://usBazurto:contrasenia99@cluster0.js9z1jh.mongodb.net/test";
        try(MongoClient mongoClient = MongoClients.create(url))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected to the database.");
                MongoCollection<Document> collection = database.getCollection("inventory");
                
                System.out.println("\n Impuut the name of the ingredient: ");
                name = sc.next();
                System.out.println("Imput the ID of the ingredient: ");
                id = sc.nextInt();
                System.out.println("Imput the ingredient is available: ");
                isAvailable = sc.nextBoolean();
                                
                Document student = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("is available? ",isAvailable);
                
                collection.insertOne(student);
                System.out.println("=  ADDED  =");
                
            } catch (MongoException me)
            {
                System.out.println("Error to connect with the database " + me);
            }           
        }
    }

    public static void find() {
        int id;
        String url = "mongodb+srv://usBazurto:contrasenia99@cluster0.js9z1jh.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(url))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected to the database.");                
                MongoCollection<Document> collection = database.getCollection("inventory");               
                System.out.print("\n Imput the ID to find the ingredient: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                try
                {
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("Ingredient: " + doc.toJson());
                    
                } catch (Exception e)
                {
                    System.out.println("Error, no data in the database");
                }
                                
            } catch (MongoException me)
            {
                System.out.println("Error to connect with the database " + me);
            }            
        }
    }

    public static void update() {
        int id;
        boolean isAvailable;
        String name;
        String url = "mongodb+srv://usBazurto:contrasenia99@cluster0.js9z1jh.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(url))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected to the database.");               
                MongoCollection collection = database.getCollection("inventory");               
                System.out.print("\n Imput the ID of ingredient to update: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);               
                System.out.print("\n Imput the new ID: ");
                id = sc.nextInt();
                System.out.println("Imput the ingredient is available: ");
                isAvailable = sc.nextBoolean();
                System.out.print(" Imput the new name of the ingredient: ");
                name = sc.next();
                
                Bson updates = Updates.combine(Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("is Available? ", isAvailable));
                
                collection.updateOne(filter,updates);
                
                System.out.println("DATA UPDATED");
                
            } catch (MongoException me)
            {
                System.out.println("Error to connect with the database " + me);
            }           
        }
    }

    public static void delete() {
        int id;
        String url = "mongodb+srv://usBazurto:contrasenia99@cluster0.js9z1jh.mongodb.net/test";;
        
        try(MongoClient mongoClient = MongoClients.create(url))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected to the database.");                
                MongoCollection collection = database.getCollection("inventory");              
                System.out.print("\n Imput the ID of ingredient to delete: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);            
                collection.deleteOne(filter);              
                System.out.println("DATA DELETED");
                
            } catch (MongoException me)
            {
                System.out.println("Error to connect with the database " + me);
            }           
        }
    }    
}
