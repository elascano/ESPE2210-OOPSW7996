package ec.edu.espe.StrategyPattern.controller;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.StrategyPattern.model.SortingNumbers;
import java.util.ArrayList;
import java.util.Arrays;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class SortNumbersController {

          public static void uploadDocument(SortingNumbers sort) {
                    MongoClient mongoClient = MongoDbAccess.conection();
                    MongoDatabase database = mongoClient.getDatabase("strategyVillarroel");
                    MongoCollection<Document> collection = database.getCollection("arrayJustin");
                    Document inspection = new Document("_id", new ObjectId())
                            .append("unsorted", sort.getUnSorted())
                            .append("size", sort.getSize())
                            .append("sortAlgoritm", sort.getSortAlgoritm())
                            .append("sorted", sort.getSorted());

                    collection.insertOne(inspection);
          }

          public static ArrayList<SortingNumbers> loadFromDatabase(ArrayList<SortingNumbers> objects, MongoDatabase database, String collectionName) {
                    Gson gson = new Gson();
                    MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
                    FindIterable<Document> result = objectsCollection.find(Filters.gt("size", 0));
                    result.forEach(d -> objects.add(gson.fromJson(d.toJson(), SortingNumbers.class)));
                    return objects;
          }

}
