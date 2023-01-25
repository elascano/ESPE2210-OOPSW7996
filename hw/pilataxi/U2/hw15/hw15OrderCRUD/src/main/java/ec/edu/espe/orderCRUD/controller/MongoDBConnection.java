
package ec.edu.espe.orderCRUD.controller;

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
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class MongoDBConnection {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void insertMenu() {
        int id;
        String productName;
        int price;
        String type;
        String uri = "mongodb+srv://diegop:diegop@cluster0.skonea2.mongodb.net/test";
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> collection = database.getCollection("Menu");
                
                System.out.print("Enter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the productName: ");
                productName = sc.next();
                System.out.print("Enter the price: ");
                price = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the type of food: ");
                type = sc.next();
                
                Document student = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("productName", productName)
                        .append("price", price)
                        .append("type",type);
                
                collection.insertOne(student);
                System.out.println("New Menu Food agregated: " + student.get("productName"));
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }

    public static void findMenu() {
        int id;
        String uri = "mongodb+srv://diegop:diegop@cluster0.skonea2.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected successfully to server.");
                
                MongoCollection<Document> collection = database.getCollection("Menu");
                
                System.out.println("");
                System.out.print("Enter the id to find: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                try
                {
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("Menu --> " + doc.toJson());
                    
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

    public static void updateMenu() {
        int id;
        String productName;
        int price;
        String type;
        
        String uri = "mongodb+srv://diegop:diegop@cluster0.skonea2.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected successfully to server.");
                
                MongoCollection collection = database.getCollection("Menu");
                
                System.out.println("");
                System.out.print("Enter the id to update: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                
                
                System.out.print("Enter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the productName: ");
                productName = sc.next();
                System.out.print("Enter the price: ");
                price = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the type of food: ");
                type = sc.next();
                
                Bson updates = Updates.combine(
                        Updates.set("id", id),
                        Updates.set("productName", productName),
                        Updates.set("price", price),
                        Updates.set("type", type));
                
                collection.updateOne(filter,updates);
                
                System.out.println("Data uptaded successfully");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }

    public static void deleteMenu() {
        int id;
        String uri = "mongodb+srv://diegop:diegop@cluster0.skonea2.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected successfully to server.");
                
                MongoCollection collection = database.getCollection("Menu");
                
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
