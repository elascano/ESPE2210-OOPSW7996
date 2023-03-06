
package ec.edu.espe.q61_70.controller;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public interface CrudMongoDB {
    public void createToDatabase(Document document);
    public Document readToDatabase(String key, String value);
    public MongoCollection<Document> getMongoCollection(); 
    
}
