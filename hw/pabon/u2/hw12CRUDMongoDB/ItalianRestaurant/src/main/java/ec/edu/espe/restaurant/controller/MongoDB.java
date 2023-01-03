package ec.edu.espe.restaurant.controller;

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
        int price;
        String name;
        String uri = "mongodb+srv://eapabon:2002123@database.sdflumv.mongodb.net/test";
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected to the database.");
                MongoCollection<Document> collection = database.getCollection("Products");
                
                System.out.println("\nType the NAME of the product: ");
                name = sc.nextLine();
                System.out.println("Type the ID of the product: ");
                id = sc.nextInt();
                System.out.println("Type the PRICE of the product: ");
                price = sc.nextInt();
                sc.nextLine();
                                
                Document student = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("price",price);
                
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
        String uri = "mongodb+srv://eapabon:2002123@database.sdflumv.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected to the database.");                
                MongoCollection<Document> collection = database.getCollection("Products");               
                System.out.print("\nType the ID to find the product: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                try
                {
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("Product: " + doc.toJson());
                    
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
        int price;
        String name;
        String uri = "mongodb+srv://eapabon:2002123@database.sdflumv.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected to the database.");               
                MongoCollection collection = database.getCollection("Products");               
                System.out.print("\nType the ID to update: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);               
                System.out.print("\nType the ID: ");
                id = sc.nextInt();
                System.out.print("Type the new PRICE of the product: ");
                price = sc.nextInt();
                sc.nextLine();
                System.out.print(" Type the new NAME of the product: ");
                name = sc.nextLine();
                
                Bson updates = Updates.combine(Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("price", price));
                
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
        String uri = "mongodb+srv://eapabon:2002123@database.sdflumv.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected to the database.");                
                MongoCollection collection = database.getCollection("Products");              
                System.out.print("\nType the ID to delete: ");
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
