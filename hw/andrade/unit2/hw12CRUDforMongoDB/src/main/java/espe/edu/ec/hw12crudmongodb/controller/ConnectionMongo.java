package espe.edu.ec.hw12crudmongodb.controller;

import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.conversions.Bson;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class ConnectionMongo {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void insertStudent() {
        int id;
        int age;
        String name;
        String uri = "mongodb+srv://laandrade:laandrade@cluster0.jcz1lsa.mongodb.net/test";
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");
                MongoCollection<Document> collection = database.getCollection("students");
                
                System.out.print("\nEnter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the age: ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the name: ");
                name = sc.nextLine();
                
                Document student = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("age",age);
                
                collection.insertOne(student);
                System.out.println("New student has agragated: " + student.get("name"));
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }

    public static void findStudent() {
        int id;
        String uri = "mongodb+srv://laandrade:laandrade@cluster0.jcz1lsa.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");
                
                MongoCollection<Document> collection = database.getCollection("students");
                
                System.out.print("\nEnter the id to find: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                try
                {
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("Student --> " + doc.toJson());
                    
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

    public static void updateStudent() {
        int id;
        int age;
        String name;
        String uri = "mongodb+srv://laandrade:laandrade@cluster0.jcz1lsa.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");
                
                MongoCollection collection = database.getCollection("students");
                
                System.out.print("\nEnter the id to update: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                
                System.out.print("\nEnter the new id: ");
                id = sc.nextInt();
                System.out.print("Enter the new age: ");
                age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the new name: ");
                name = sc.nextLine();
                
                Bson updates = Updates.combine(
                        Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("age", age));
                
                collection.updateOne(filter,updates);
                
                System.out.println("Data has been updated");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }

    public static void deleteStudent() {
        int id;
        String uri = "mongodb+srv://laandrade:laandrade@cluster0.jcz1lsa.mongodb.net/test";
        
        try(MongoClient mongoClient = MongoClients.create(uri))
        {
            MongoDatabase database = mongoClient.getDatabase("project");
            try
            {
                System.out.println("Connected successfully to server(Project).");
                
                MongoCollection collection = database.getCollection("students");
                
                System.out.print("\nEnter the id to delete: ");
                id = sc.nextInt();
                
                Bson filter = Filters.eq("id", id);
                
                collection.deleteOne(filter);
                
                System.out.println("Data has been deleted");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
            
        }
    }
    
    
    
}
