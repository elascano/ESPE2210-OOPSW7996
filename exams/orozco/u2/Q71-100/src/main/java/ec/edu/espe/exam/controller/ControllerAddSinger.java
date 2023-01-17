
package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Scanner;
import ec.edu.espe.exam.model.AddSinger;
import org.bson.types.ObjectId;
import org.bson.Document;


/**
 *
 * @author Labs-DCCO
 */
public class ControllerAddSinger {
    private static final Scanner sc = new Scanner(System.in);
    
    private static final AddSinger addSinger = new AddSinger();
    
    public static void insertDocumentMongo(MongoDatabase database, AddSinger addSinger){
        
        MongoCollection<Document> collection = database.getCollection("Singer");
        Document inspection = new Document("id", new ObjectId())
                .append("id", addSinger.getId())
                .append("name", addSinger.getName())
                .append("song", addSinger.getSong());
        
        collection.insertOne(inspection);
    }
    
    
}
