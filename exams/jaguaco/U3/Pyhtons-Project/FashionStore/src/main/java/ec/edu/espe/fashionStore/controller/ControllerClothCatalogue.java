
package ec.edu.espe.fashionStore.controller;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.fashionstore.model.ClothCatalogue;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ControllerClothCatalogue {
    private static final Scanner sc = new Scanner(System.in);
    
    private static final ClothCatalogue clothCatalogue = new ClothCatalogue();
    
    public static void insertDocumentMongo(MongoDatabase database, ClothCatalogue clothCatalogue) {

        MongoCollection<Document> collection = database.getCollection("ClothCatalogue");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", clothCatalogue.getId())
                .append("name", clothCatalogue.getName())
                .append("type", clothCatalogue.getType())
                .append("color", clothCatalogue.getColor());
                

        collection.insertOne(inspection);

    }
    
    public static ClothCatalogue readMongo(MongoDatabase database, int id) {
        ClothCatalogue clothCatalogue;
        String document = "";
        Gson gson = new Gson();

        MongoCollection<Document> collection = database.getCollection("ClothCatalogue");

        Bson filter = Filters.eq("id", id);
        Document query = collection.find(Filters.and(filter)).first();

        document = query.toJson();
        TypeToken<ClothCatalogue> type = new TypeToken<ClothCatalogue>() {
        };
        clothCatalogue = gson.fromJson(document, type.getType());

        return clothCatalogue;

    }
    
    public static boolean noRepeatOrder(MongoDatabase database, ClothCatalogue clothCatalogue, boolean existClothModel) {

        MongoCollection<Document> collection2 = database.getCollection("ClothCatalogue");
        Bson filter = Filters.and(Filters.all("id", clothCatalogue.getId()));

        if (collection2.find(filter).first() == null) {
            existClothModel = false;
        }
        if (collection2.find(filter).first() != null) {
            existClothModel = true;
        }
        return existClothModel;

    }
    
    public static void updateMongo(MongoDatabase database, ClothCatalogue clothCatalogue) {
        MongoCollection<Document> collection = database.getCollection("ClothCatalogue");
        Bson query = Filters.eq("id", clothCatalogue.getId());
        Bson filter = Filters.and(Filters.all("id", clothCatalogue.getId()));

        if (collection.find(filter).first() != null) {

            Bson updates;
            updates = Updates.combine(Updates.set("name", clothCatalogue.getName()),
                    Updates.set("type", clothCatalogue.getType()),
                    Updates.set("color", clothCatalogue.getColor()));
                    
            collection.updateOne(query, updates);

        } else {
            System.out.println("ClothModel not found");
        }
    }
    
    public static void deleteMongo(MongoDatabase database, ClothCatalogue clothCatalogue) {

        MongoCollection<Document> collection = database.getCollection("ClothCatalogue");
        Bson query = Filters.eq("id", clothCatalogue.getId());
        Bson filter = Filters.and(Filters.all("id", clothCatalogue.getId()));

        if (collection.find(filter).first() != null) {

            collection.deleteOne(query);

        } else {
            System.out.println("ClothModel not found");
        }

    }
    
}
