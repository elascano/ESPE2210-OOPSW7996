package ec.edu.espe.Strategy.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.Strategy.model.Strategy;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class StrategyController {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public StrategyController() {
        this.mongoClient = null;
        this.database = null;
    }

   
    public static StrategyController connectToDatabase(StrategyController dataBaseManager) {
        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
        String databaseName = "strategyYaranga";
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

    public static void createOne(Strategy strategy, MongoDatabase database, String collectionName) {
        MongoCollection<Document> strategyCollection = database.getCollection(collectionName);
        Gson gson = new Gson();

        String jsonString = gson.toJson(strategy);
        Document document = Document.parse(jsonString);
        strategyCollection.insertOne(document);

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
