package utils;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;

import org.bson.Document;
import org.bson.conversions.Bson;


/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class DBManager {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public DBManager() {
        mongoClient = null;
        database = null;
    }

    public void connect(String uri, String dataBaseName) {
        try {
            setMongoClient(MongoClients.create(uri));
            setDatabase(getMongoClient().getDatabase(dataBaseName));
            System.out.println("Connected successfully to server.");

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
    }

    public void createDocument(String collectionName, String json) {
        Document document;
        MongoCollection collection;

        try {
            collection = getDatabase().getCollection(collectionName);
            document = Document.parse(json);

            collection.insertOne(document);

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
    }

    public ArrayList readCollection(String collectionName) {
        MongoCollection collection;
        ArrayList<Object> listObjects;
        listObjects = new ArrayList<>();

        try {
            collection = getDatabase().getCollection(collectionName);

            MongoCursor<Document> cursor = collection.find().iterator();

            try {
                while (cursor.hasNext()) {                    
                    listObjects.add(cursor.next().values().toArray());                    
                }
            } finally {
                cursor.close();
            }

        } catch (Exception e) {
            System.out.println("Error: read Collection fail");
        }

        return listObjects;
    }
    
    public void updateDocument(String collectionName, String id, String json) {
        MongoCollection collection;
        Document document;
        
        try {
            collection = getDatabase().getCollection(collectionName);
            
            document = (Document) collection.find(new Document("id", id)).first();
            
            if (document != null) {
                Bson updateValue = Document.parse(json);
                Bson updateOperation = new Document("$set", updateValue);
                collection.updateOne(document, updateOperation);
                System.out.println("The document was successfully updated");
            }
            
        } catch (Exception e) {
            System.out.println("Error: Collection no founded");
        }
    }
    
    public void deleteDocument(String collectionName, String id) {
        MongoCollection collection;
        Document document;
        
        try {
            collection = getDatabase().getCollection(collectionName);            
            document = (Document) collection.find(new Document("id", id)).first();            
            collection.deleteOne(document);
            System.out.println("The document was successfully deleted");
        } catch (Exception e) {
            System.out.println("Error: Document no founded");
        }
            
    }
    
    public Object[] findDocument(String collectionName, String id) {
        MongoCollection collection;
        Document document;
        Object[] object = null;
        
        try {
            collection = getDatabase().getCollection(collectionName);            
            document = (Document) collection.find(new Document("id", id)).first();
            object = document.values().toArray();
            
        } catch (Exception e) {
            System.out.println("Error: Collection or ID no found");
        }
        
        return object;
    }
    
    public static String toJson(Object object) {
        Gson gson = new Gson();
        String json;
        json = gson.toJson(object);

        return json;
    }

    /**
     * @return the mongoClient
     */
    public MongoClient getMongoClient() {
        return mongoClient;
    }

    /**
     * @param mongoClient the mongoClient to set
     */
    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    /**
     * @return the database
     */
    public MongoDatabase getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }

}
