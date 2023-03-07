package ec.edu.espe.AirporTaxiScheduling.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.AirporTaxiScheduling.model.Travel;
import ec.edu.espe.AirporTaxiScheduling.utils.DataBaseManager;
import ec.edu.espe.AirporTaxiScheduling.utils.Error;
import java.util.ArrayList;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class TraveldbController extends DataBaseManager {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public TraveldbController() {
        this.mongoClient = null;
        this.database = null;
    }

    private static final String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
    private static final String databaseName = "AirportTaxiScheduling";

    public static TraveldbController connectToDatabase(TraveldbController dataBaseManager) {

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

    public static void createOne(Object object, MongoDatabase database, String collectionName) {
        MongoCollection<Document> travelsCollection = database.getCollection(collectionName);
        Gson gson = new Gson();

        String jsonString = gson.toJson(object);
        Document document = Document.parse(jsonString);
        travelsCollection.insertOne(document);

    }

    public static void deleteOne(MongoDatabase database, String collectionName, int idFinder) {
        MongoCollection<Document> collection = database.getCollection(collectionName);

        Bson filter = Filters.and(Filters.eq("id", idFinder));

        collection.deleteOne(filter);

    }

    public static ArrayList<Travel> load(ArrayList<Travel> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson();
        for (int i = 0; i < objects.size(); i++) {
            objects.remove(i);
        }
        MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<Document> result = objectsCollection.find(Filters.gt("idTraveler", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), Travel.class)));
        return objects;
    }

    public static Travel findDocumentdb(Travel travel, int idFinder) {
        MongoClient mongoClient = TravelerdbController.conection();
        MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
        MongoCollection<Document> collection = database.getCollection("Travels");
        Bson filter = Filters.and(Filters.all("idTraveler", idFinder));
        MongoCursor<Document> cursor = collection.find(filter).iterator();
        if (collection.find(filter).first() != null) {
            Document document = collection.find(filter).first();
            travel.setDriver(document.getString("driver"));
            travel.setTraveler(document.getString("traveler"));
            travel.setAddress(document.getString("adress"));
            travel.setPrice(Float.parseFloat(Double.toString(document.getDouble("price"))));
            travel.setPayed(document.getBoolean("payed"));
        } else {
            Error.message();
        }

        return travel;
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

    @Override
    public void create(Object object, MongoDatabase database, String collectionName) {

    }

    @Override
    public void read(MongoDatabase database) {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete(MongoDatabase database, String collectionName, int idFinder) {

    }

    @Override
    public void loadFromDatabase() {

    }

}
