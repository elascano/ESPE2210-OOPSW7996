package ec.edu.espe.restaurant.controller;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import java.util.Scanner;
import org.bson.types.ObjectId;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class MongoDB {
    static Scanner sc = new Scanner(System.in);
    public static void productDelete() {
        int id;
        String uri = "mongodb+srv://yona:oop22@cluster0.ppsjulz.mongodb.net/test";
         try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                System.out.println("Successful connection to the database");
                MongoCollection collection = database.getCollection("Menu");
                System.out.println("\nWrite product ID to delete: ");
                id = sc.nextInt();
                Bson filter =Filters.eq("id",id);
                collection.deleteOne(filter);
                System.out.println("Data Deleted" );

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void productUpdate() {
        int id,quantity,unitCost;
        String name;
        String uri = "mongodb+srv://yona:oop22@cluster0.ppsjulz.mongodb.net/test";
         try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            MongoCollection<Document> collection = database.getCollection("Menu");
            try {
                System.out.println("Successful connection to the database");
                MongoCollection suppress = database.getCollection("Menu");
                System.out.println("\nWrite product ID to Update: ");
                id = sc.nextInt();
                Bson filter =Filters.eq("id",id);
                suppress.deleteOne(filter);
                System.out.println("Enter product name: ");
                name = sc.next();
                System.out.println("Enter Quantity: ");
                quantity = sc.nextInt();
                System.out.println("Enter unitCost: ");
                unitCost = sc.nextInt();
                Document inspection = new Document("id",new ObjectId())
                        .append("id", id)
                        .append("Name", name)
                        .append("Quantity", quantity)
                        .append("unitCost", unitCost);
                collection.insertOne(inspection);
                System.out.println("********Updated data*********");
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void productAdd() {
        String uri = "mongodb+srv://yona:oop22@cluster0.ppsjulz.mongodb.net/test";
        int id,total;
        String name,customer;
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        System.out.println("Enter Customer: ");
        customer = sc.next();
        System.out.println("Enter product name: ");
        name = sc.next();
        System.out.println("Enter total: ");
        total = sc.nextInt();
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("Project");
        MongoCollection<Document> collection = database.getCollection("Product");
        Document inspection = new Document("id",new ObjectId())
                .append("id", id)
                .append("Customer", customer)
                .append("Name", name)
                .append("total", total);
        collection.insertOne(inspection);
        System.out.println("*******Data entered correctly******** ");
    }
    public static void productReadme() {
        int id;
        String uri = "mongodb+srv://yona:oop22@cluster0.ppsjulz.mongodb.net/test";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Successful connection to the database");
                System.out.println("Write product ID to readme: ");
                id = sc.nextInt();
                MongoCollection collection = database.getCollection("Menu");
                Bson filter = Filters.and(Filters.gt("id", id));
                System.out.println("---> " + collection.find(filter).first());
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void menu() {
            System.out.println("=====Choose the option=======");
            System.out.println("============================");
            System.out.println("==   1. Insert product   ==");
            System.out.println("==   2. Find product     ==");
            System.out.println("==   3. Modify a product ==");
            System.out.println("==   4. Delete a product ==");
            System.out.println("==   5. Exit             ==");
            System.out.println("============================");
            System.out.print("Please type the option: ");
        }
}
