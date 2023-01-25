
package ec.edu.espe.hw12crudmongodb.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author @author Martín Suquillo, TeamWebMaster, DCCO-ESPE
 */
public class MongoConnection {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void insertVegetable() {
        int id;
        String name;
        int quantity;
        float weight;
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> collection = database.getCollection("Lake");
                
                System.out.print("Enter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the name: ");
                name = sc.next();
                System.out.print("Enter the quantity: ");
                quantity = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the price per unit: ");
                weight = sc.nextFloat();
                
                Document student = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("quantity", quantity)
                        .append("weight",weight);
                
                collection.insertOne(student);
                System.out.println("New fish agregated: " + student.get("name"));
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }

    public static void findVegetable() {
        int id;
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Product");
            try
            {
                System.out.println("Connected successfully to server.");
                
                MongoCollection<Document> collection = database.getCollection("Vegetables");
                
                System.out.println("");
                System.out.print("Enter the id to find: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                try
                {
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("Vegetables --> " + doc.toJson());
                    
                } catch (Exception e)
                {
                    System.out.println("Data not found");
                }
                
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }

    public static void uptadeVegetable() {
        int id;
        String name;
        int quantity;
        float pricePerUnit;
        
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Product");
            try
            {
                System.out.println("Connected successfully to server.");
                
                MongoCollection collection = database.getCollection("Vegetables");
                
                System.out.println("");
                System.out.print("Enter the id to update: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                
                System.out.print("Enter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the name: ");
                name = sc.next();
                System.out.print("Enter the quantity: ");
                quantity = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the price per unit: ");
                pricePerUnit = sc.nextFloat();
                
                Bson updates = Updates.combine(
                        Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("quantity", quantity),
                        Updates.set("pricePerUnit", pricePerUnit));
                
                collection.updateOne(filter,updates);
                
                System.out.println("Data uptaded successfully");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }

    public static void deleteVegetable() {
        int id;
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Product");
            try
            {
                System.out.println("Connected successfully to server.");
                
                MongoCollection collection = database.getCollection("Vegetable");
                
                System.out.print("\nEnter the id to delete: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                
                collection.deleteOne(filter);
                
                System.out.println("Data deleted successfully");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }
    
    
    
}

