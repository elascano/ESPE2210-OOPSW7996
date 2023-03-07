
package ec.espe.edu.strategy.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.espe.edu.strategy.model.Strategy;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
/**
 *
* @author Sebastian Verdugo,ProgressTeam,DCCO-ESPE
 */
public class StrategyMongoConection {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public StrategyMongoConection() {
        this.mongoClient = null;
        this.database = null;
    }

    public static StrategyMongoConection connectToDatabase(StrategyMongoConection dataBaseManager) {
        String uri = "mongodb+srv://verdugong:espe123@examexercise.g7jxmjt.mongodb.net/?retryWrites=true&w=majority";
        String databaseName = "strategyVerdugo";
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
        MongoCollection<Document> strategyMongoConection = database.getCollection(collectionName);
        Gson gson = new Gson();

        String jsonString = gson.toJson(strategy);
        Document document = Document.parse(jsonString);
        strategyMongoConection.insertOne(document);

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
