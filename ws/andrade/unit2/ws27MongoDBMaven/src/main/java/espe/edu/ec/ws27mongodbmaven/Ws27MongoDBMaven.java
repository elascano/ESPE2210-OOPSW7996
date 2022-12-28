
package espe.edu.ec.ws27mongodbmaven;

import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.*;
import org.bson.conversions.Bson;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE 
 */
public class Ws27MongoDBMaven {

    public static void main(String[] args) {
        
        String uri = "mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("oop");
            try {
                System.out.println("Connected successfully to server."); 
  
                MongoCollection collection = database.getCollection("Customer"); 
  
                Bson filter = Filters.and(Filters.gt("age", 18));
                MongoCursor<Document> cursor = collection.find(filter).iterator();
                System.out.println(" --> "+collection.find(filter).iterator());
                
                try{
                while(cursor.hasNext()){
                    System.out.println(cursor.next().toJson());
                }
                }finally{
                cursor.close();
                }
                
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
        
    }
}
