
package espe.edu.ec.mongo_crud.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Scanner;
import espe.edu.ec.mongo_crud.model.Snack;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Controller {
    private static final Snack snack = new Snack();
    private static final Scanner scan = new Scanner(System.in);
    
    public static void addSnack() {
        
        String uri = "mongodb+srv://fsquiroga:4321@cluster0.d2ga7nb.mongodb.net/test";
        
        try ( MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Proyecto");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> snackCollection = database.getCollection("Snack");

                System.out.println("----------------------");
                System.out.println("      ADD SNACK    ");
                System.out.println("----------------------");
                System.out.println("Enter the order id: ");
                snack.setId(scan.nextInt());
                scan.nextLine();
                System.out.println("Insert the snack name: ");
                snack.setName(scan.nextLine());
                System.out.println("Insert the quantity: ");
                snack.setQuantity(scan.nextInt());
                System.out.println("Insert the price per unit of the snack: ");
                snack.setPricePerUnit(scan.nextFloat());
                
                Document snackDocument = new Document("_id", new ObjectId())
                .append("id", snack.getId())
                .append("name", snack.getName())
                .append("quantity", snack.getQuantity())
                .append("pricePerUnit", snack.getPricePerUnit());

                snackCollection.insertOne(snackDocument);
                
                System.out.println("Snack added: "+ snackDocument.get("name"));
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
    
    public static void readSnack() {

        String uri = "mongodb+srv://fsquiroga:4321@cluster0.d2ga7nb.mongodb.net/test";
        
        try ( MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Proyecto");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> snackCollection = database.getCollection("Snack");

                System.out.println("----------------------");
                System.out.println("      READ SNACK    ");
                System.out.println("----------------------");
                System.out.println("Enter the Snack id:");
                snack.setId(scan.nextInt());
                
                Bson filter = Filters.eq("id", snack.getId());
                
                try
                {
                    Document query = snackCollection.find(Filters.and(filter)).first();
                    System.out.println("Student --> " + query.toJson());

                } catch (Exception e)
                {
                    System.out.println("Snack not found");
                }
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
    
    public static void updateSnack() {

        String uri = "mongodb+srv://fsquiroga:4321@cluster0.d2ga7nb.mongodb.net/test";
        
        try ( MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Proyecto");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> snackCollection = database.getCollection("Snack");

                System.out.println("----------------------");
                System.out.println("      UPDATE SNACK    ");
                System.out.println("----------------------");
                System.out.println("Enter the Snack id:");
                snack.setId(scan.nextInt());
                
                Bson filter = Filters.eq("id", snack.getId());
                
                scan.nextLine();
                System.out.println("Insert a new Snack name: ");
                snack.setName(scan.nextLine());
                System.out.println("Insert a new Snack quantity: ");
                snack.setQuantity(scan.nextInt());
                System.out.println("Insert a new Snack price per unit: ");
                snack.setPricePerUnit(scan.nextFloat());
            
                Bson modifySnack = Updates.combine(
                        Updates.set("id", snack.getId()),
                        Updates.set("name", snack.getName()),
                        Updates.set("quantity", snack.getQuantity()),
                        Updates.set("pricePerUnit", snack.getPricePerUnit()));
                
                snackCollection.updateOne(filter, modifySnack);
                
                System.out.println("Snack update succesfully");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
    public static void deleteSnack() {

        String uri = "mongodb+srv://fsquiroga:4321@cluster0.d2ga7nb.mongodb.net/test";
        
        try ( MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Proyecto");
            try
            {
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> snackCollection = database.getCollection("Snack");

                System.out.println("----------------------");
                System.out.println("      DELETE SNACK    ");
                System.out.println("----------------------");
                System.out.println("Enter the Snack id:");
                snack.setId(scan.nextInt());
                
                Bson filter = Filters.eq("id", snack.getId());
                
                snackCollection.deleteOne(filter);
                
                System.out.println("Snack deleted succesfully");
                
            } catch (MongoException me)
            {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

}
