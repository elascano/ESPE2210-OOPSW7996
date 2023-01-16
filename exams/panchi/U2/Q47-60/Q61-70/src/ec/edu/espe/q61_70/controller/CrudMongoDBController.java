package ec.edu.espe.q61_70.controller;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.q61_70.model.MongoConnection;
import org.bson.Document;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class CrudMongoDBController implements CrudMongoDB{
    
    private MongoCollection<Document> mongoCollection;
    
    public CrudMongoDBController(String mongoCollection) {

        this.mongoCollection = MongoConnection.database.getCollection(mongoCollection);
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
    public MongoCollection<Document> getMongoCollection() {
        return mongoCollection;
    } 
}
