package ec.edu.espe.CruiseShips.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.CruiseShips.model.Ship;
import java.util.ArrayList;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author H303
 */
public class ShipDbController extends MongoDbManager {

    public static ShipDbController connectToDatabase(String uri, String databaseName, ShipDbController dataBaseManager) {

        try {
            dataBaseManager.setMongoClient(MongoClients.create(uri));
            dataBaseManager.setDatabase(dataBaseManager.getMongoClient().getDatabase(databaseName));
            Bson command = new BsonDocument("ping", new BsonInt64(1));
            org.bson.Document commandResult = dataBaseManager.getDatabase().runCommand(command);
            System.out.println("Connected successfully to server.");

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
        return dataBaseManager;
    }
 
    public static void createOperation(Object object, MongoDatabase database, String collectionName) {
        MongoCollection<org.bson.Document> collection = database.getCollection(collectionName);
        Gson gson = new Gson();

        String jsonString = gson.toJson(object);
        org.bson.Document document = org.bson.Document.parse(jsonString);
        collection.insertOne(document);

    }

    public static ArrayList<Ship> loadFromDatabase(ArrayList<Ship> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson();
        for (int i = 0; i < objects.size(); i++) {
            objects.remove(i);
        }
        MongoCollection<org.bson.Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<org.bson.Document> result = objectsCollection.find(Filters.gt("id", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), Ship.class)));
        return objects;
    }

}
