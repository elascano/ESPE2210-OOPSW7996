
package ec.edu.espe.exam2.controller;

import ec.edu.espe.exam2.model.MongoDBConection;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.ReplaceOptions;
import org.bson.Document;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class CRUDMongoDB implements CRUDMongoDBInter{
    private MongoCollection<Document> mongoCollection;

    public CRUDMongoDB(String mongoCollection) {

        this.mongoCollection = MongoDBConection.database.getCollection(mongoCollection);
    }

    @Override
    public void createToDatabase(Document document) {
        mongoCollection.insertOne(document);
    }

    @Override
    public Document readToDatabase(String key, String value) {
        return mongoCollection.find(eq(key, value)).first();
    }

    @Override
    public void uploadToDatabase(Document query, Document upload) {
        ReplaceOptions options = new ReplaceOptions().upsert(true);
        mongoCollection.replaceOne(query, upload, options);
    }

    @Override
    public void deleteToDatabase(Document document) {
        mongoCollection.deleteOne(document);
    }

    @Override
    public MongoCollection<Document> getMongoCollection() {
        return mongoCollection;
    }
}
