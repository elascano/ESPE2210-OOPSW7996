package utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
        ArrayList<String> listObjects;
        listObjects = new ArrayList<>();

        try {
            collection = getDatabase().getCollection(collectionName);

            MongoCursor<Document> cursor = collection.find().iterator();

            try {
                while (cursor.hasNext()) {                    
                    listObjects.add(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }

        } catch (Exception e) {
            System.out.println("Error: read Collection fail");
        }

        return listObjects;
    }
    
    public ArrayList readCollection(String collectionName, String key, int value) {
        MongoCollection collection;
        ArrayList<String> listObjects;
        listObjects = new ArrayList<>();

        try {
            collection = getDatabase().getCollection(collectionName);

            MongoCursor<Document> cursor = collection.find(new Document(key, value)).iterator();

            try {
                while (cursor.hasNext()) {                    
                    listObjects.add(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }

        } catch (Exception e) {
            System.out.println("Error: read Collection fail");
        }

        return listObjects;
    }
    
    public void updateDocument(String collectionName, String id, int nrc, String json) {
        MongoCollection collection;
        Document document;
        
        try {
            collection = getDatabase().getCollection(collectionName);
            

            document = (Document) collection.find((new Document("espeId", id)).append("nrc", nrc)).first();
            
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
    
    public void deleteDocument(String collectionName, int id) {
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
    
    public void deleteStudentDocument(String espeId ,int nrc) {
        MongoCollection collection;
        Document document;
        
        try {
            collection = getDatabase().getCollection("Students");            
            document = (Document) collection.find((new Document("espeId", espeId)).append("nrc", nrc)).first();
            collection.deleteOne(document);
            System.out.println("The document was successfully deleted");
        } catch (Exception e) {
            System.out.println("Error: Document no founded");
        }            
    }
    
    public void deleteDocument(String collectionName, String key ,int value) {
        MongoCollection collection;
        Document document;
        
        try {
            collection = getDatabase().getCollection(collectionName);            
            document = (Document) collection.find(new Document(key, value)).first();            
            collection.deleteOne(document);
            System.out.println("The document was successfully deleted");
        } catch (Exception e) {
            System.out.println("Error: Document no founded");
        }            
    }
    
    public String findDocument(String collectionName, String id) {
        MongoCollection collection;
        Document document;
        String json = "";

        try {
            collection = getDatabase().getCollection(collectionName);
            document = (Document) collection.find(new Document("id", id)).first();
           
            json = document.toJson();

        } catch (Exception e) {
            System.out.println("Error: Collection or ID no found");
        }

        return json;
    }
    
    public static String deleteKeyFromJson(String json, String key) {
        String newJson;
        
        JsonParser parser = new JsonParser();
        JsonElement jsonElement = parser.parse(json);
        JsonObject rootObject = jsonElement.getAsJsonObject();
        
        rootObject.remove(key);
        
        newJson = rootObject.toString();
        
        return  newJson;
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

