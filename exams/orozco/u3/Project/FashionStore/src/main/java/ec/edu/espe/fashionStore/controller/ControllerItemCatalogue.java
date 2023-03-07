
package ec.edu.espe.fashionStore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.fashionstore.model.ItemCatalogue;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ControllerItemCatalogue {
    private static final Scanner sc = new Scanner(System.in);
    
    private static final ItemCatalogue itemCatalogue = new ItemCatalogue();
    
    public static void insertDocumentMongo(MongoDatabase database, ItemCatalogue itemCatalogue) {

        MongoCollection<Document> collection = database.getCollection("ItemCatalogue");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", itemCatalogue.getId())
                .append("name", itemCatalogue.getName())
                .append("type", itemCatalogue.getType())
                .append("color", itemCatalogue.getColor());
                

        collection.insertOne(inspection);

    }
    
    public static ItemCatalogue readMongo(MongoDatabase database, int id) {
        ItemCatalogue itemCatalogue;
        String document = "";
        Gson gson = new Gson();

        MongoCollection<Document> collection = database.getCollection("ItemCatalogue");

        Bson filter = Filters.eq("id", id);
        Document query = collection.find(Filters.and(filter)).first();

        document = query.toJson();
        TypeToken<ItemCatalogue> type = new TypeToken<ItemCatalogue>() {
        };
        itemCatalogue = gson.fromJson(document, type.getType());

        return itemCatalogue;

    }
    
    public static boolean noRepeatOrder(MongoDatabase database, ItemCatalogue itemCatalogue, boolean existItemModel) {

        MongoCollection<Document> collection2 = database.getCollection("ItemCatalogue");
        Bson filter = Filters.and(Filters.all("id", itemCatalogue.getId()));

        if (collection2.find(filter).first() == null) {
            existItemModel = false;
        }
        if (collection2.find(filter).first() != null) {
            existItemModel = true;
        }
        return existItemModel;

    }
    
    public static void updateMongo(MongoDatabase database, ItemCatalogue itemCatalogue) {
        MongoCollection<Document> collection = database.getCollection("ItemCatalogue");
        Bson query = Filters.eq("id", itemCatalogue.getId());
        Bson filter = Filters.and(Filters.all("id", itemCatalogue.getId()));

        if (collection.find(filter).first() != null) {

            Bson updates;
            updates = Updates.combine(Updates.set("name", itemCatalogue.getName()),
                    Updates.set("type", itemCatalogue.getType()),
                    Updates.set("color", itemCatalogue.getColor()));
                    
            collection.updateOne(query, updates);

        } else {
            System.out.println("ItemModel not found");
        }
    }
    
    public static void deleteMongo(MongoDatabase database, ItemCatalogue itemCatalogue) {

        MongoCollection<Document> collection = database.getCollection("ItemCatalogue");
        Bson query = Filters.eq("id", itemCatalogue.getId());
        Bson filter = Filters.and(Filters.all("id", itemCatalogue.getId()));

        if (collection.find(filter).first() != null) {

            collection.deleteOne(query);

        } else {
            System.out.println("ItemModel not found");
        }

    }
}
