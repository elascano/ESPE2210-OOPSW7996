package utils;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.hw12MongoDB.model.Customer;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class DbManager {
    public static MongoCollection conectToCollection(String collectionName){
        MongoDatabase database;
        MongoCollection collection = null;
                
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/test";
        
        try (MongoClient client = MongoClients.create(uri)) {
            
            database = client.getDatabase("Project");
            collection = database.getCollection(collectionName);
            System.out.println("Connected successfully to server.");
             
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
    return collection; 
    }
    
    public static void insertCustomer(MongoCollection collection,Customer customer){
        int id;
        String name;
        String email;
        int[] dateOfBirth = new int[3];
        
        id = customer.getId();
        name = customer.getName();
        email = customer.getEmail();
        dateOfBirth = customer.getDateOfBirth();
        
        try{
            Document document = new Document("_id", new ObjectId());    
            document.append("id",id);
            document.append("name",name);
            document.append("email",email);
            document.append("dateOfBirth",dateOfBirth);
            
            collection.insertOne(document);
            System.out.println("The customer was successfully register at the data base.");
        
        }catch(MongoException me){
            System.err.println("An error occurred while attempting to insert: " + me);
        }
    }
    
    public static void findCustomer(MongoCollection collection, int id){
        Bson filter = Filters.and(Filters.gt("id", id));
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
}
