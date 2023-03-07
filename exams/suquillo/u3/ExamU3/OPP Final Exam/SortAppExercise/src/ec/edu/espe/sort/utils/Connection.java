package ec.edu.espe.sort.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Martín Suquillo,WebMasterTeam, DCCO-ESPE
 */
public class Connection {

    ConnectionString connectionString = new ConnectionString("mongodb+srv://31MartinS:1235@cluster0.tcvl6i2.mongodb.net/test");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("Project");

    public MongoDatabase data() {
        return database;
    }
}
