
package ec.edu.espe.CruiseShips.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class MongoDBManager  {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBManager() {
        this.mongoClient = null;
        this.database = null;
    }
    
    public static void add(){};
    public static void read(){};
    public static void update(){};
    public static void delete(){};
    
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
