package espe.edu.ec.store.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import java.text.DecimalFormat;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ConnectionMongoStore {

    private static final Scanner sc = new Scanner(System.in);

    public static void insertProduct() {
        int id;
        float price;
        String name;
        float discount;
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("Store");
            try {
                System.out.println("**** You are connected to the server(Store). ****");
                MongoCollection<Document> collectionProduct = database.getCollection("productStore");
                MongoCollection<Document> collectionDiscount = database.getCollection("discount");

                System.out.print("\nInsert the id: ");
                id = sc.nextInt();
                System.out.print("Insert the name: ");
                name = sc.next();
                System.out.print("Insert the price: ");
                price = sc.nextFloat();

                Document Product = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("price", price);

                collectionProduct.insertOne(Product);
                System.out.println("Product: " + Product.get("name"));

                discount = (float) (price * 0.30);
                price = price - discount;
                Document ProductDiscount = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("price with Discount", price);

                collectionDiscount.insertOne(ProductDiscount);
                System.out.println("Price with discount: " + ProductDiscount.get("price"));

            } catch (MongoException me) {
                System.out.println("ERROR! It can't be connected " + me);
            }

        }
    }

    public static void findProduct() {
        int id;
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Store");
            try {
                System.out.println("**** You are connected to the server(Store). ****");

                MongoCollection<Document> collectionProduct = database.getCollection("productStore");

                System.out.print("\nInsert the id: ");
                id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionProduct.find(Filters.and(filter)).first();
                    System.out.println("Product --> " + doc.toJson());
                    findProductDiscount(id);
                } catch (Exception e) {
                    System.out.println("ERROR! Not found in the database ");
                }

            } catch (MongoException me) {
                System.out.println("ERROR! It can't be connected " + me);
            }

        }
    }

    public static void findProductDiscount(int id) {
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Store");
            try {
                MongoCollection<Document> collectionDiscount = database.getCollection("discount");
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionDiscount.find(Filters.and(filter)).first();
                    System.out.println("Product --> " + doc.toJson());
                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("ERROR! It can't be connected " + me);
            }

        }
    }

    public static void updateProduct() {
        int id;
        float price;
        String name;
        float discount;
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Store");

            try {
                System.out.println("**** You are connected to the server(Store). ****");

                MongoCollection collectionProduct = database.getCollection("productStore");
                MongoCollection<Document> collectionDiscount = database.getCollection("discount");

                System.out.print("\nInsert the id: ");
                id = sc.nextInt();

                Bson filter = Filters.eq("id", id);

                System.out.print("\nInsert the new id: ");
                id = sc.nextInt();
                System.out.print("Insertthe new name: ");
                name = sc.next();
                System.out.print("Insert the new price: ");
                price = sc.nextFloat();

                Bson updates = Updates.combine(Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("price", price));

                collectionProduct.updateOne(filter, updates);
                updateProductDiscount(id, price, name);
                System.out.println("****Updated Product****");

            } catch (MongoException me) {
                System.out.println("ERROR! It can't be connected " + me);
            }

        }
    }

    public static void updateProductDiscount(int id, float price, String name) {
        float discount;
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Store");

            try {
                MongoCollection<Document> collectionDiscount = database.getCollection("discount");

                discount = (float) (price * 0.30);
                price = price - discount;

                Bson filter = Filters.eq("id", id);
                Bson updates = Updates.combine(Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("price with Discount", price));
                collectionDiscount.updateOne(filter, updates);

            } catch (MongoException me) {
                System.out.println("ERROR! It can't be connected " + me);
            }

        }
    }

    public static void deleteProduct() {
        int id;
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Store");
            try {
                System.out.println("**** You are connected to the server(Store). ****");

                MongoCollection collectionProduct = database.getCollection("productStore");
                MongoCollection<Document> collectionDiscount = database.getCollection("discount");

                System.out.print("\nInsert the id: ");
                id = sc.nextInt();

                Bson filter = Filters.eq("id", id);

                collectionProduct.deleteOne(filter);
                collectionDiscount.deleteOne(filter);

                System.out.println("****Deleted Product****");

            } catch (MongoException me) {
                System.out.println("ERROR! It can't be connected " + me);
            }

        }
    }
}
