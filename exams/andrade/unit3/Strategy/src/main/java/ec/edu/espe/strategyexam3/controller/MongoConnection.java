
package ec.edu.espe.strategyexam3.controller;

import com.mongodb.MongoClientException;
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
    
    public static MongoCollection<Document> getConnection(String collection) throws MongoClientException {
        try {
            String url = "mongodb+srv://laandrade:laandrade@cluster0.jcz1lsa.mongodb.net/test";
            String dataBase = "strategyAndrade";
            MongoClient mongoClient = MongoClients.create(url);
            MongoDatabase database = mongoClient.getDatabase(dataBase);
            MongoCollection<Document> mongoCollection = database.getCollection(collection);

            return mongoCollection;
        } catch (MongoClientException e) {
            System.out.println("Error connecting to MongoDB" + e.getMessage());
            throw e;
        }
    }
    
}
