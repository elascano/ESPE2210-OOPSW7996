package utils;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.mongodbmanager.MongoDbManager;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class MongoConnection {
    private static MongoConnection instance = null;
    private final MongoDatabase database;
    private MongoCollection collection;

    private MongoConnection() {
        String uri = "mongodb+srv://oop:oop@cluster0.og4urrq.mongodb.net/?retryWrites=true&w=majority";
        String dataBase = "ManagementSoftware";
        this.database = MongoDbManager.connectToDatabase(uri, dataBase);
    }
    
    public static MongoConnection getInstance(){
      if (instance == null) {
        instance = new MongoConnection();
      }
      return instance;
    }
    
    public MongoCollection getCollection(String collectionToConnect){
        collection = MongoDbManager.connectToCollection(database, collectionToConnect);
        return collection;
    } 
}
