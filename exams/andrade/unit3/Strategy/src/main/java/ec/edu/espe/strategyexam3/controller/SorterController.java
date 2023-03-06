
package ec.edu.espe.strategyexam3.controller;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;
import java.util.Arrays;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class SorterController {
    
    public static void addToStrategyCollection(int unsorted[], int size, String sortAlgorithName, int sorted[]) {
        MongoCollection<Document> collectionStudents = MongoConnection.getConnection("sorter strategy");
        Document studentDoc = new Document("_id", new ObjectId())
                .append("unsorted", Arrays.toString(unsorted))
                .append("size", size)
                .append("sort algorith", sortAlgorithName)
                .append("sorted", Arrays.toString(sorted));
        collectionStudents.insertOne(studentDoc);

    }
    
}
