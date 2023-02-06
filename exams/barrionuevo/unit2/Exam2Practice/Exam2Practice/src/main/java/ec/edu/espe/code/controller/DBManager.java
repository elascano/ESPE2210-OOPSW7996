
package ec.edu.espe.code.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.code.model.SoccerPlayer;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class DBManager {
    
    public static void createData (SoccerPlayer soccerPlayer){
        
        String uri = "mongodb+srv://domlin:1234@domlin7.gs5if9g.mongodb.net/test";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ExamPractice2");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                MongoCollection<Document> collection = database.getCollection("SoccerPlayers");
                
                Document newClient = new Document("id",keyboard.getId());
                newClient.append("long",keyboard.getLongInCm());
                newClient.append("width", keyboard.getWidthInCm());
                collection.insertOne(newClient);
                
            } catch (MongoException me) {
            }
 
        }
    }
    
}
