
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
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class MongoConnection {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void insertPayment() {
        int id;
        String name;
        String month;
        float pay;
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> collection = database.getCollection("payments");

                System.out.print("Enter the Id: ");
                id = sc.nextInt();
                System.out.print("Enter the name: ");
                name = sc.next();
                System.out.print("Enter the month: ");
                month = sc.next();
                System.out.print("Enter the value of the pay: ");
                pay = sc.nextFloat();

                Document student = new Document("_id", new ObjectId())
                        .append("Id", id)
                        .append("name", name)
                        .append("month", month)
                        .append("pay", pay);

                collection.insertOne(student);
                System.out.println("New payment agregated: " + student.get("name"));

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void findPayment() {
        int Id;
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                System.out.println("Connected to the data base.");

                MongoCollection<Document> collection = database.getCollection("payments");

                System.out.print("\nEnter the id to find: ");
                Id = sc.nextInt();

                Bson filter = Filters.eq("Id", Id);
                try {
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("payment --> " + doc.toJson());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void updatePayments() {
        int id;
        String name;
        String month;
        float pay;
        
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected successfully to server.");
                
                MongoCollection collection = database.getCollection("payments");
                
                System.out.println("");
                System.out.print("Enter the id to update: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                
                System.out.print("Enter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the name: ");
                name = sc.next();
                System.out.print("Enter the month: ");
                month = sc.next();
                System.out.print("Enter the price per unit: ");
                pay = sc.nextFloat();
                
                Bson updates = Updates.combine(
                        Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("month", month),
                        Updates.set("pay", pay));
                
                collection.updateOne(filter,updates);
                
                System.out.println("Data uptaded successfully");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }

    public static void deletePayments() {
        int id;
        String uri = "mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try
            {
                System.out.println("Connected successfully to server.");
                
                MongoCollection collection = database.getCollection("payments");
                
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

