
package ec.edu.espe.Singleton.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.Singleton.model.User;
import java.util.ArrayList;
import javax.swing.text.Document;
import org.bson.BsonDocument;

import org.bson.BsonInt64;

import org.bson.conversions.Bson;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class UserdbController{

    
    private MongoClient mongoClient;
    private MongoDatabase database;
  
     public static UserdbController connectToDatabase(String uri, String databaseName, UserdbController dataBaseManager) {

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
    
    public static void createOne(Object object, MongoDatabase database, String collectionName) {
         MongoCollection<org.bson.Document> travelsCollection = database.getCollection(collectionName);
        Gson gson = new Gson();

        String jsonString = gson.toJson(object);
        Document document = (Document) org.bson.Document.parse(jsonString);
        travelsCollection.insertOne((org.bson.Document) document);
    }
  
      public static ArrayList<User> loadFromDatabase(ArrayList<User> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson(); 
        for (int i = 0; i < objects.size(); i++) {
          objects.remove(i); 
        }   
        MongoCollection<org.bson.Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<org.bson.Document> result = objectsCollection.find(Filters.gt("phoneNumber", 0));
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


  
    
}
