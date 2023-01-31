package ec.edu.espe.CruiseShips.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class CruiseShipController extends MongoDBManager {

    public static CruiseShipController connectToDatabase(String uri, String databaseName, CruiseShipController dataBaseManager) {

        try {
            dataBaseManager.setMongoClient(MongoClients.create(uri));
            dataBaseManager.setDatabase(dataBaseManager.getMongoClient().getDatabase(databaseName));
            System.out.println("Connected successfully to server.");

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect: " + me);
        }
        return dataBaseManager;
    }
 
    public static void create(Object object, MongoDatabase database, String collectionName) {
        MongoCollection<org.bson.Document> collection = database.getCollection(collectionName);
        Gson gson = new Gson();

        String jsonString = gson.toJson(object);
        org.bson.Document document = org.bson.Document.parse(jsonString);
        collection.insertOne(document);

    }


}
