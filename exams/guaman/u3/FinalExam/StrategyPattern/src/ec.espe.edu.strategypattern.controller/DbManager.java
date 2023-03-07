package ec.espe.edu.strategypattern;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import ec.espe.edu.strategypattern.model.SortApp;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class DbManager {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public DbManager() {
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

    
    public static void addSortApp(SortApp sortApp, MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int[] unordered = new int[10];
        int[] ordered = new int[10];
        try {
            sortApp.setOrdered(ordered);
            sortApp.setUnordered(unordered);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Data not saved");
        }
        try {
            InsertOneResult result = collection.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("unordered", sortApp.getUnordered())
                    .append("ordered", sortApp.getOrdered()));

            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }

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
