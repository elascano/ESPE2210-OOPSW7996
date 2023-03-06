package ec.edu.espe.ExamExercise.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.espe.edu.ExamExercise.model.DBClass;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class MongoDBController {
    public static void saveData(int data[], int sortedData[],int size, String sortAlgorithm) {
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("strategyAviles");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                MongoCollection<Document> collection = database.getCollection("strategyAviles");
                Document newData = new Document("unsorted", data);
                newData.append("size", size);
                newData.append("sortAlgorithm", sortAlgorithm);
                newData.append("sorted", sortedData);
                collection.insertOne(newData);
                
                
                
            } catch (MongoException me) {
            }
            
        }
    }
}
