package ec.edu.espe.exam2.utils;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.exam2.model.ProgrammingLanguages;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class MongoConnection {

  
    public static MongoCollection<Document> connectMongo() {

        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);

        MongoDatabase database = mongoClient.getDatabase("Exam2_Programming_Languages");

        MongoCollection<Document> languaguesCollection = database.getCollection("Programming_Languages");

        return languaguesCollection;

    }

}
