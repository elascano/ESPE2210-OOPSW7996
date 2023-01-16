
package ec.edu.espe.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class MongoConnection {
    
    public static MongoCollection<Document> connect(){
        String uri = "mongodb+srv://laandrade:laandrade@cluster0.jcz1lsa.mongodb.net/test";
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("Exam2");
        MongoCollection<Document> collection = database.getCollection("cellphones");
        return collection;
    }
    
}
