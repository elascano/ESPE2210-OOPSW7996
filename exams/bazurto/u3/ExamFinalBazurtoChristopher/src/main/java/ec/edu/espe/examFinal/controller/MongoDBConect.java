package ec.edu.espe.examFinal.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.examFinal.model.Numbers;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class MongoDBConect {

    public boolean register(Numbers number) {

        MongoClient mongoClient = MongoClients.create("mongodb+srv://usBazurto:contrasenia99@cluster0.js9z1jh.mongodb.net/test");
        MongoDatabase db = mongoClient.getDatabase("strategyBazurto");

        Document doc = new Document();
        doc.append("unsorted", Arrays.toString(number.getUnsorted()))
                .append("size", number.getSize())
                .append("sortAlgorithm", number.getSortAlgorithm())
                .append("sorted", Arrays.toString(number.getSorted()));
        MongoCollection<Document> collection = db.getCollection("arrayChristopher");
        collection.insertOne(doc);

        return true;
    }
}
