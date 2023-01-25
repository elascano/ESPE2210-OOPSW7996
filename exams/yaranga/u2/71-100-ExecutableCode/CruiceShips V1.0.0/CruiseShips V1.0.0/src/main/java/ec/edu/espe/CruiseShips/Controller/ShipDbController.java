/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.CruiseShips.Controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.CruiseShips.model.Ship;
import java.util.ArrayList;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;
import org.w3c.dom.Document;

/**
 *
 * @author H303
 */
public class ShipDbController {
     private MongoClient mongoClient;
    private MongoDatabase database;

     public ShipDbController() {
        this.mongoClient = null;
        this.database = null;
    }
    

    public static ShipDbController connectToDatabase(String uri, String databaseName, ShipDbController dataBaseManager) {

        try {
            dataBaseManager.setMongoClient(MongoClients.create(uri));
            dataBaseManager.setDatabase(dataBaseManager.getMongoClient().getDatabase(databaseName));
            Bson command = new BsonDocument("ping", new BsonInt64(1));
            System.out.println("Connected successfully to server.");

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
        return dataBaseManager;
    }

    public static void createOperation(Object object, MongoDatabase database, String collectionName) {
        MongoCollection<org.bson.Document> travelsCollection = database.getCollection(collectionName);
        Gson gson = new Gson();

        String jsonString = gson.toJson(object);
        Document document = Document.parse(jsonString);
        travelsCollection.insertOne(document);

    }

    public static void readToDataBase(MongoDatabase database) {
        MongoCollection collection = database.getCollection("Travels");

        Bson filter = Filters.and(Filters.gt("id", 0));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        System.out.println("-->" + collection.find(filter).iterator());

        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
    }

    public static void deleteOperation(MongoDatabase database, String collectionName, int idFinder) { ///unusable
        MongoCollection<Document> collection = database.getCollection(collectionName);

        Bson filter = Filters.and(Filters.eq("id", idFinder));

        collection.deleteOne(filter);

    }

    public static ArrayList<Ship> loadFromDatabase(ArrayList<Ship> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson(); 
        for (int i = 0; i < objects.size(); i++) {
          objects.remove(i); 
        }   
        MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<Document> result = objectsCollection.find(Filters.gt("id", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), Travel.class)));
        return objects;
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
