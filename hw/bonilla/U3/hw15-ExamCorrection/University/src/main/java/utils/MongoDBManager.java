package utils;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.IndexOptions;
import ec.edu.espe.correction.model.University;

import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class MongoDBManager {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public void conectToMongoDb(String uri) {
        try {
            setMongoClient(MongoClients.create(uri));
            setDatabase(mongoClient.getDatabase("OOP"));
            System.out.println("Connected successfully to server.");

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);

        }

    }

    public void insertDocumentDataBase(String collectionName, Document document) {
        MongoCollection<Document> mongoCollection;
        try {
            mongoCollection = getDatabase().getCollection(collectionName);
            
            mongoCollection.insertOne(document);
           
            
        } catch (Exception e)
        {
            
        }

    }
    public boolean verifyRepertorieId(String collectionName, University university)
    {
        boolean vefifyId=false;
        MongoCollection<Document> mongoCollection=getDatabase().getCollection(collectionName);
       Bson filter=Filters.eq("Id:", university.getId());
        Document queryId=mongoCollection.find(filter).first();
        if(queryId!=null)
        {
           vefifyId=true;
       }
       else
       {
          vefifyId=false;
        }
       return vefifyId;
    }
    

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }

}
