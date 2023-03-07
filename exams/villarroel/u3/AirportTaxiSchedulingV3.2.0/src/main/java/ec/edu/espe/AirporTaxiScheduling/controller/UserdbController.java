
package ec.edu.espe.AirporTaxiScheduling.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.AirporTaxiScheduling.model.User;
import ec.edu.espe.AirporTaxiScheduling.utils.DataBaseManager;
import java.util.ArrayList;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class UserdbController extends DataBaseManager{

    
    private MongoClient mongoClient;
    private MongoDatabase database;
  
   private static final String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
    private static final String databaseName = "AirportTaxiScheduling";
  
    
    public static UserdbController connectToDatabase (UserdbController dataBaseManager) {

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
  
      public static ArrayList<User> loadFromDatabase(ArrayList<User> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson(); 
        for (int i = 0; i < objects.size(); i++) {
          objects.remove(i); 
        }   
        MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<Document> result = objectsCollection.find(Filters.gt("phoneNumber", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), User.class)));
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


    @Override
    public void create(Object object, MongoDatabase database, String collectionName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void read(MongoDatabase database) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(MongoDatabase database, String collectionName, int idFinder) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void loadFromDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    
}
