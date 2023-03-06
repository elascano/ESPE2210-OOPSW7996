package ec.edu.espe.urbanizationtreasury.controller;

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
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class ConnectionMongo {

    private static final Scanner sc = new Scanner(System.in);

    public static void insertBurger() {
        int id;
        float price;
        String name;
        float iva;
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("menu");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection<Document> collectionBurguer = database.getCollection("menu");
                MongoCollection<Document> collectionIva = database.getCollection("iva");

                System.out.print("\nEnter the id: ");
                id = sc.nextInt();
                System.out.print("Enter the name: ");
                name = sc.next();
                System.out.print("Enter the price: ");
                price = sc.nextFloat();

                Document Burger = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("price", price);

                collectionBurguer.insertOne(Burger);
                System.out.println("New burger has agragated: " + Burger.get("name"));

                iva = (float) (price * 0.12);
                price = iva + price;
                Document BurgerIva = new Document("_id", new ObjectId())
                        .append("id", id)
                        .append("name", name)
                        .append("price with Iva", price);

                collectionIva.insertOne(BurgerIva);
                System.out.println("New price with Iva of: " + BurgerIva.get("name"));

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void findBurger() {
        int id;
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("menu");
            try {
                System.out.println("Connected successfully to server(menu).");

                MongoCollection<Document> collectionBurguer = database.getCollection("menu");

                System.out.print("\nEnter the id to find: ");
                id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionBurguer.find(Filters.and(filter)).first();
                    System.out.println("Burger --> " + doc.toJson());
                    findBurgerIva(id);
                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void findBurgerIva(int id) {
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("menu");
            try {
                MongoCollection<Document> collectionIva = database.getCollection("iva");
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionIva.find(Filters.and(filter)).first();
                    System.out.println("Burger --> " + doc.toJson());
                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void updateBurger() {
        int id;
        float price;
        String name;
        float iva;
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("menu");

            try {
                System.out.println("Connected successfully to server(menu).");

                MongoCollection collectionBurger = database.getCollection("menu");
                MongoCollection<Document> collectionIva = database.getCollection("iva");

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

                collectionBurger.updateOne(filter, updates);
                updateBurgerIva(id, price, name);
                System.out.println("|||Data has been updated|||");

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void updateBurgerIva(int id, float price, String name) {
        float iva;
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("menu");

            try {
                MongoCollection<Document> collectionIva = database.getCollection("iva");

                iva = (float) (price * 0.12);
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

    public static void deleteBurger() {
        int id;
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("menu");
            try {
                System.out.println("Connected successfully to server(menu).");

                MongoCollection collectionBurger = database.getCollection("menu");
                MongoCollection<Document> collectionIva = database.getCollection("iva");

                System.out.print("\nEnter the id to delete: ");
                id = sc.nextInt();

                Bson filter = Filters.eq("id", id);

                collectionBurger.deleteOne(filter);
                collectionIva.deleteOne(filter);

                System.out.println("Data has been deleted");

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
}
