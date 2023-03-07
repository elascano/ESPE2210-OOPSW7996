package ec.edu.espe.shopinventory_v2.controller;

import com.google.gson.Gson;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.awt.HeadlessException;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;


/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class DBConnection {

    
    public static MongoCollection getCollection(String collection) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://t07:seb@cluster0.cjkwcyi.mongodb.net/test");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("ShopInventory");
        MongoCollection<Document> productCollection = database.getCollection(collection);

        return productCollection;
    }

    
    
    public static boolean addProductVAT(int productID, String productName, int productQuantity, double productPrice, MongoCollection<Document> productCollection) throws HeadlessException, NumberFormatException {
        boolean flag = false;
        Bson filter = Filters.eq("id", productID);
        Document query = productCollection.find(Filters.and(filter)).first();

        if (query != null) {
            flag = false;
        } else if (query == null) {
            double iva;
            iva = productPrice * 1.12D;

            Document productDoc = new Document("_id", new ObjectId())
                    .append("id", productID)
                    .append("name", productName)
                    .append("quantity", productQuantity)
                    .append("pricePerUnit", productPrice)
                    .append("priceWithVAT", iva);

            productCollection.insertOne(productDoc);

            flag = true;
        }
        
        return flag;
    }
    
    public static boolean addProduct(int productID, String productName, int productQuantity, double productPrice, MongoCollection<Document> productCollection) throws HeadlessException, NumberFormatException {
        boolean flag = false;
        Bson filter = Filters.eq("id", productID);
        Document query = productCollection.find(Filters.and(filter)).first();

        if (query != null) {
            flag = false;
        } else if (query == null) {
            Document productDoc = new Document("_id", new ObjectId())
                    .append("id", productID)
                    .append("name", productName)
                    .append("quantity", productQuantity)
                    .append("pricePerUnit", productPrice);

            productCollection.insertOne(productDoc);

            flag = true;
        }
        
        return flag;
    }
    
    public static boolean deleteProduct(int productID, MongoCollection<Document> productCollection) throws NumberFormatException, HeadlessException {
        boolean flag = false;
        Bson filter = Filters.eq("id", productID);
        Document query = productCollection.find(Filters.and(filter)).first();

        if (query != null) {
            productCollection.deleteOne(filter);
            flag = true;
        } else if (query == null) {
            flag = false;
        }
        
        return flag;
    }
    
    
    public static boolean updateProductVAT(int productID, String productName, int productQuantity, double productPrice, MongoCollection<Document> productCollection) throws NumberFormatException, HeadlessException {
        boolean flag = false;
        Bson filter = Filters.eq("id", productID);
        Document query = productCollection.find(Filters.and(filter)).first();

        double iva;
        iva = productPrice * 1.12D;

        if (query != null) {
            Bson modifyProduct = Updates.combine(
                    Updates.set("name", productName),
                    Updates.set("quantity", productQuantity),
                    Updates.set("pricePerUnit", productPrice),
                    Updates.set("priceWithVAT", iva));

            productCollection.updateOne(filter, modifyProduct);
            flag = true;

        } else if (query == null) {
            flag = false;
        }
        
        return flag;
    }
    
    public static boolean updateProduct(int productID, String productName, int productQuantity, double productPrice, MongoCollection<Document> productCollection) throws NumberFormatException, HeadlessException {
        boolean flag = false;
        Bson filter = Filters.eq("id", productID);
        Document query = productCollection.find(Filters.and(filter)).first();

        if (query != null) {
            Bson modifyProduct = Updates.combine(
                    Updates.set("name", productName),
                    Updates.set("quantity", productQuantity),
                    Updates.set("pricePerUnit", productPrice));

            productCollection.updateOne(filter, modifyProduct);
            flag = true;

        } else if (query == null) {
            flag = false;
        }
        
        return flag;
    }
    
}
