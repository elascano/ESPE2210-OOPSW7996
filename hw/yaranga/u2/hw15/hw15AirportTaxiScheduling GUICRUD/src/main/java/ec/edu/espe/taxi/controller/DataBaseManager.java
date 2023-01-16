package ec.edu.espe.taxi.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.taxi.model.Travel;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class DataBaseManager {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public DataBaseManager() {
        this.mongoClient = null;
        this.database = null;
    }

    private static Scanner scan = new Scanner(System.in);

    public static DataBaseManager connectToDatabase(String uri, String databaseName, DataBaseManager dataBaseManager) {

        try {
            dataBaseManager.setMongoClient(MongoClients.create(uri));
            dataBaseManager.setDatabase(dataBaseManager.getMongoClient().getDatabase(databaseName));
            Bson command = new BsonDocument("ping", new BsonInt64(1));
            Document commandResult = dataBaseManager.getDatabase().runCommand(command);
            System.out.println("Connected successfully to server.");

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
        return dataBaseManager;
    }

    public static void createOperation(Object object, MongoDatabase database, String collectionName) {
        MongoCollection<Document> travelsCollection = database.getCollection(collectionName);
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

   /* public static void updateOperation(MongoDatabase database, String collectionName,Object object) {
        MongoCollection<Document> travelsCollection = database.getCollection(collectionName);
   
        FindIterable<Document> result = travelsCollection.find(Filters.eq("id", object.get));

        travelsCollection.updateOne(result.first(), Updates.set("price", price));

    }*/

    public static void deleteOperation(MongoDatabase database) { ///unusable
        MongoCollection<Document> travelsCollection = database.getCollection("Travels");

        
        FindIterable<Document> result = travelsCollection.find(Filters.eq("id", scan.nextInt()));
       
                travelsCollection.deleteOne(result.first());
       
    }

    public static ArrayList<Travel> loadFromDatabase(ArrayList<Travel> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson();
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
