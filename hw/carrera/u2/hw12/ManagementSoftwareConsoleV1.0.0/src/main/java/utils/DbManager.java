package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.model.Material;
import ec.edu.espe.model.Product;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class DbManager {
   
    public static MongoCollection createConnection(String collection){
        String uri = "mongodb+srv://oop:oop@cluster0.og4urrq.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("ManagementSoftware");
        MongoCollection<Document> mongoCollection = mongoDatabase.getCollection(collection);
        System.out.println("-> Connected successfully to server.");
        return mongoCollection;   
    }
    public static void insert(MongoCollection productsCollection, Product product){
        int id = product.getId();
        String name = product.getName();
        float cost = product.getCost();
        String description = product.getDescription();
        ArrayList <Material> materials = product.getMaterials();
        int workingTime = product.getWorkingTime();
        int quantity = product.getQuantity();

        Document document = new Document("_id", new ObjectId());       
        document.append("id", id);
        document.append("name", name);
        document.append("cost", cost);
        document.append("description", description);
        document.append("materials", materials.toString());
        document.append("workingTime", workingTime);
        document.append("quantity", quantity);
       
        productsCollection.insertOne(document);
        System.out.println("Product inserted successfully"); 
    }
    public static void insert(int id, float totalCost){
        MongoCollection costsCollection = DbManager.createConnection("TotalCosts");
        Document document = new Document("_id", new ObjectId());       
        document.append("id", id);
        document.append("totalCost", totalCost);
        costsCollection.insertOne(document);
        System.out.println("Total cost inserted successfully");
    }
    public static void find(MongoCollection collection,int id){
        Bson filter = Filters.and(Filters.all("id", id));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if(cursor.hasNext()){
            System.out.println("-> Product found");
            while(cursor.hasNext()){
                System.out.println(cursor.next().toJson());
            }
        }else{
            System.out.println("-> Product not found");
        }
        
    }
    public static void read(MongoCollection collection){
        Bson filter = Filters.and(Filters.gt("id", 0));
        Document projectionDocument = new Document("_id", 0);
        try(MongoCursor<Document> cursor = collection.find(filter).projection(projectionDocument).iterator()) {
            if(cursor.hasNext()){
                System.out.println("LIST ---------------------");
                while(cursor.hasNext()){
                    System.out.println("-> " + cursor.next().toJson());
                }
            }else{
                System.out.println("-> There is no prodcuts in the database");
            }
        }
    }
    public static void update(MongoCollection collection, int id, String attribute, Object newAttribute){
        Bson query  =Filters.eq("id", id);
        Bson updates;
        updates = Updates.set(attribute, newAttribute);
        collection.updateOne(query, updates);
        System.out.println("-> Product updated successfully ");  
    }
    public static void delete(MongoCollection collection, int id){
        Bson query  =Filters.eq("id", id); 
        collection.deleteMany(query);
        System.out.println("-> Product deleted successfully");
    }
    public static String findAttribute(MongoCollection collection, int id, String attribute){
        Document projectionDocument = new Document("_id", 0).append(attribute, 1);
        Bson filter = Filters.and(Filters.all("id", id));
        String foundAttribute = null;
        MongoCursor<Document> cursor = collection.find(filter).projection(projectionDocument).iterator();
        if(cursor.hasNext()){
            while(cursor.hasNext()){
                foundAttribute = cursor.next().toJson().replaceAll("[{}: "+attribute+"\"\""+"]", ""); 
            }
        }else{
            System.out.println(attribute + "-> not found");
        }
        return foundAttribute;
    }
}

