package ec.edu.espe.exam.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class MongoConnection {

    ConnectionString connectionString = new ConnectionString("mongodb+srv://darivadeneira7:MonOpp812.1@cluster0.yyvwtz7.mongodb.net/test");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Sort");

    public MongoDatabase data() {
        return database;
    }
}
