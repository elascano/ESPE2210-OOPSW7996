package utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */

public class Connection {

    ConnectionString connectionString = new ConnectionString("mongodb+srv://domlin:1234@domlin7.gs5if9g.mongodb.net/test");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();
    com.mongodb.client.MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("strategyBarrionuevo");

    public MongoDatabase data() {
        return database;
    }
}
