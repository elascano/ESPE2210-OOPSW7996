
package ec.edu.espe.strategy.controller;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class MongoDB {
     static public MongoClient conection() {
                    String uri = "mongodb+srv://oop:<oop>@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";
                    MongoClient mongoClient = MongoClients.create(uri);
                    return mongoClient;
          }
           public static void uploadDocument(Number number) {
                    MongoClient mongoClient = conection();
                    MongoDatabase database = mongoClient.getDatabase("Strategy");
                    MongoCollection<Document> collection = database.getCollection("Strategy");
                    Document inspection = new Document("_id", new ObjectId());
                    collection.insertOne(inspection);
          }

          public static ArrayList<String> loadFromDatabase(ArrayList<String> objects, MongoDatabase database, String collectionName) {
                    Gson gson = new Gson();
                    MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
                    FindIterable<Document> result = objectsCollection.find(Filters.gt("id", 0));
                    result.forEach(d -> objects.add(gson.fromJson(d.toJson(), String.class)));
                    return objects;
          }

}
