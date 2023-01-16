package ec.edu.espe.exam.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.ReplaceOptions;
import org.bson.Document;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class CRUDDBController {

    private MongoCollection<Document> mongoCollection;

    public CRUDDBController(String mongoCollection) {

        this.mongoCollection = MongoDBConnection.database.getCollection(mongoCollection);
    }

    public void createToDatabase(Document document) {

        mongoCollection.insertOne(document);
    }

    public Document readToDatabase(Document document) {

        return mongoCollection.find(document).first();

    }

    public void uploadToDatabase(Document query, Document upload) {
        ReplaceOptions options = new ReplaceOptions().upsert(true);

        mongoCollection.replaceOne(query, upload, options);
    }

    public void deleteToDatabase(Document document) {
        mongoCollection.deleteOne(document);
    }

    public MongoCollection<Document> getMongoCollection() {
        return mongoCollection;
    }

}
