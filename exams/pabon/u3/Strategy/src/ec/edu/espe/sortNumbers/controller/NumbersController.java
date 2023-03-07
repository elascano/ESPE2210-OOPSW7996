package ec.edu.espe.sortNumbers.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.sortNumbers.model.Numbers;
import ec.edu.espe.sortNumbers.utils.MongoDBConnection;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class NumbersController {

    private MongoDatabase mongoDatabase = MongoDBConnection.mongodb;

    private MongoCollection<Document> mongoCollection;

    public NumbersController() {
        this.mongoCollection = mongoDatabase.getCollection("arrayElkin");
    }

    public void updateToDatabase(Document document) {
        mongoCollection.insertOne(document);

    }

    public MongoCollection getMongoCollection() {
        return this.mongoCollection;
    }

    public Document createDocument(Numbers listDigits) {
        Document document = new Document();
        document.append("NumbersDisordered", Arrays.toString(listDigits.getNumbersDisordered()));
        document.append("ListOfDigits", listDigits.getSizeOfListOfNumbers());
        document.append("Algorithm", listDigits.getSortAlgorithm());
        document.append("NumberOrdered", Arrays.toString(listDigits.getListOfNumberOrdered()));

        return document;
    }

}
