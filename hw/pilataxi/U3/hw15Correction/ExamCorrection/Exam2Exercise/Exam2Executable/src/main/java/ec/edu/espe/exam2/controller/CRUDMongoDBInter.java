
package ec.edu.espe.exam2.controller;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public interface CRUDMongoDBInter {
    public void createToDatabase(Document document);
    public Document readToDatabase(String key, String value);
    public void uploadToDatabase(Document query, Document upload);
    public void deleteToDatabase(Document document);
    public MongoCollection<Document> getMongoCollection();
}
