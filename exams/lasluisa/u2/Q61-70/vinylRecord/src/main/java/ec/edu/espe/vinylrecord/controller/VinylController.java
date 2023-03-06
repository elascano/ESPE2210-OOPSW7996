package ec.edu.espe.vinylrecord.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.vinylrecord.model.Vinyl;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class VinylController {

    private static final Scanner sc = new Scanner(System.in);

    public static void insertDocumentMongo(MongoDatabase database, Vinyl vinyl) {

        MongoCollection<Document> collection = database.getCollection("VinylRecord");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", vinyl.getId())
                .append("artist", vinyl.getArtist())
                .append("yearOfRelease", vinyl.getYearOfRelease());

        collection.insertOne(inspection);
    }

    public static Vinyl readMongo(MongoDatabase database, int id) {
        Vinyl vinyl;
        String document = "";
        Gson gson = new Gson();

        MongoCollection<Document> collection = database.getCollection("VinylRecord");

        Bson filter = Filters.eq("id", id);
        Document query = collection.find(Filters.and(filter)).first();

        document = query.toJson();
        TypeToken<Vinyl> type = new TypeToken<Vinyl>() {
        };
        vinyl = gson.fromJson(document, type.getType());

        return vinyl;

    }

    public static void deleteMongo(MongoDatabase database, Vinyl vinyl) {

        MongoCollection<Document> collection = database.getCollection("VinylRecord");
        Bson query = Filters.eq("id", vinyl.getId());
        Bson filter = Filters.and(Filters.all("id", vinyl.getId()));

        if (collection.find(filter).first() != null) {

            collection.deleteOne(query);

        } else {
            System.out.println("Order not found");
        }

    }
}
