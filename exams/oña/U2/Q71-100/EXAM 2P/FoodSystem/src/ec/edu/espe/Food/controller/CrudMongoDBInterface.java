package ec.edu.espe.Food.controller;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public interface CrudMongoDBInterface {
    
    public void createToDatabase(Document document);
    public Document readToDatabase(String key, String value);
    public void uploadToDatabase(Document query, Document upload);
    public void deleteToDatabase(Document document);
    public MongoCollection<Document> getMongoCollection(); 
}
