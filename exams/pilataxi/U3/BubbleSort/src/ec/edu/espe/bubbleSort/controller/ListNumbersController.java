
package ec.edu.espe.bubbleSort.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.bubbleSort.model.ListNumbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class ListNumbersController {

    private MongoDatabase mongoDatabase = ConnectionDatabase.mongodb;

    private MongoCollection<Document> mongoCollection;

    public ListNumbersController() {
        this.mongoCollection = mongoDatabase.getCollection("arrayDiego");
    }

    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(ListNumbers listNumbers) {
        Document document = new Document();
        document.append("unsorted", Arrays.toString(listNumbers.getListOfNumbersDisordered()));
        document.append("size", listNumbers.getSizeOfListOfNumbers());
        document.append("sortAlgorithm", listNumbers.getSortAlgorithm());
        document.append("InsertionSort", Arrays.toString(listNumbers.getListOfNumberOrdered()));

        return document;
    }

}
