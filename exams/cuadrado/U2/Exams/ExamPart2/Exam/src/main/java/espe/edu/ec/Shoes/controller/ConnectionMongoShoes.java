package espe.edu.ec.Shoes.controller;
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
/**
 *
 * @author Alejandro Cuadrado,DCCO-ESPE
 */
public class ConnectionMongoShoes {
    private static final Scanner sc = new Scanner(System.in);
    public static void insertShoes() {
        int id;
        float price;
        String name;
        float iva;
        String uri = "mongodb+srv://Poo:oop123@cluster0.7o2yta6.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection<Document> collectionPizza = database.getCollection("MenuShoes");
                MongoCollection<Document> collectionIva = database.getCollection("iva");
                System.out.print("\nEnter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the name: ");
                name = sc.next();
                System.out.print("Enter the price: ");
                price = sc.nextFloat();
                Document Shoes = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("price", price);
                collectionPizza.insertOne(Shoes);
                System.out.println("New Shoes has agragated: " + Shoes.get("name"));
                iva = (float) (price * 0.15);
                price = iva + price;
                Document ShoesIva = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("price with Iva", price);
                collectionIva.insertOne(ShoesIva);
                System.out.println("New price with Iva of: " + ShoesIva.get("name"));
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void findShoes() {
        int id;
        String uri = "mongodb+srv://Poo:oop123@cluster0.7o2yta6.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection<Document> collectionShoes = database.getCollection("menu");
                System.out.print("\nEnter the id to find: ");
                id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionShoes.find(Filters.and(filter)).first();
                    System.out.println("Shoes: " + doc.toJson());
                    findShoesIva(id);
                } catch (Exception e) {
                    System.out.println("Data not found");
                }
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void findShoesIva(int id) {
        String uri = "mongodb+srv://Poo:oop123@cluster0.7o2yta6.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                MongoCollection<Document> collectionIva = database.getCollection("iva");
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionIva.find(Filters.and(filter)).first();
                    System.out.println("Shoes: " + doc.toJson());
                } catch (Exception e) {
                    System.out.println("Data not found");
                }
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void updateShoes() {
        int id;
        float price;
        String name;
        String uri = "mongodb+srv://Poo:oop123@cluster0.7o2yta6.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection collectionShoes = database.getCollection("menu");
                System.out.print("\nEnter the id to update: ");
                id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                System.out.print("\nEnter the new id: ");
                id = sc.nextInt();
                System.out.print("Enter the new name: ");
                name = sc.next();
                System.out.print("Enter the new price: ");
                price = sc.nextFloat();
                Bson updates = Updates.combine(Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("price", price));
                collectionShoes.updateOne(filter, updates);
                updateShoesIva(id, price, name);
                System.out.println("***Data has been updated***");
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void updateShoesIva(int id, float price, String name) {
        float iva;
        String uri = "mongodb+srv://Poo:oop123@cluster0.7o2yta6.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                MongoCollection<Document> collectionIva = database.getCollection("iva");
                iva = (float) (price * 0.15);
                price = iva + price;
                Bson filter = Filters.eq("id", id);
                Bson updates = Updates.combine(Updates.set("id", id),
                        Updates.set("name", name),
                        Updates.set("price with Iva", price));
                collectionIva.updateOne(filter, updates);
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    public static void deleteShoes() {
        int id;
        String uri = "mongodb+srv://Poo:oop123@cluster0.7o2yta6.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("ShopShoes");
            try {
                System.out.println("Connected successfully to server(Pizzashop).");
                MongoCollection collectionShoes = database.getCollection("menu");
                MongoCollection<Document> collectionIva = database.getCollection("iva");
                System.out.print("\nEnter the id to delete: ");
                id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                collectionShoes.deleteOne(filter);
                collectionIva.deleteOne(filter);
                System.out.println("Data has been deleted");
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
}
