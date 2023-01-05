package ec.edu.espe.FashionStore.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.FashionStore.model.Order;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Controller {

    private static final Order order = new Order();

    public static void insertInAOtherCollection(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Enter the order id:");
        order.setId(sc.nextInt());
        System.out.println("----------------------");

        MongoCollection<Document> collection = database.getCollection("Customers");
        MongoCollection<Document> collection2 = database.getCollection("Orders");
        Bson filter = Filters.and(Filters.eq("id", order.getId()));

        if (collection.find(filter).first() != null) {

            collection2.insertOne(collection.find(filter).first());

            System.out.println("----------------------------------------------------------");
            System.out.println("The order has been saved in the Orders collection");
            System.out.println("----------------------------------------------------------");

        } else {
            System.out.println("Order not found");
        }

    }

    public static void deleteMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Enter the order id:");
        order.setId(sc.nextInt());
        System.out.println("----------------------");

        MongoCollection<Document> collection = database.getCollection("Customers");
        Bson query = Filters.eq("id", order.getId());
        Bson filter = Filters.and(Filters.all("id", order.getId()));

        if (collection.find(filter).first() != null) {

            collection.deleteOne(query);

            System.out.println("---------------------------");
            System.out.println("The order has been deleted");
            System.out.println("---------------------------");

        } else {
            System.out.println("Order not found");
        }

    }

    public static void updateMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);
        String month;

        System.out.println("----------------------");
        System.out.println("Enter the order id:");
        order.setId(sc.nextInt());
        System.out.println("----------------------");

        MongoCollection<Document> collection = database.getCollection("Customers");
        Bson query = Filters.eq("id", order.getId());
        Bson filter = Filters.and(Filters.all("id", order.getId()));

        if (collection.find(filter).first() != null) {

            sc.nextLine();
            System.out.println("Change the customer name: ");
            order.setCustomerName(sc.nextLine());
            System.out.println("Change the customer's phone number: ");
            order.setPhoneNumber(sc.nextLong());

            Bson updates = Updates.combine(Updates.set("customerName", order.getCustomerName()),
                    Updates.set("phoneNumber", order.getPhoneNumber()));
            collection.updateOne(query, updates);

            System.out.println("---------------------------");
            System.out.println("The order has been modified");
            System.out.println("---------------------------");
        } else {
            System.out.println("Order not found :c");
        }
    }

    public static void readMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Enter the order id:");
        order.setId(sc.nextInt());
        System.out.println("----------------------");

        MongoCollection collection = database.getCollection("Customers");
        Bson filter = Filters.and(Filters.all("id", order.getId()));
        MongoCursor<Document> cursor = collection.find(filter).iterator();

        if (collection.find(filter).first() != null) {
            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }
        } else {
            System.out.println("Order not found :c");
        }
    }

    public static void readAllMongo(MongoDatabase database) {

        MongoCollection collection = database.getCollection("Customers");
        Bson filter = Filters.and(Filters.all("status", "done"));
        MongoCursor<Document> cursor = collection.find(filter).iterator();

        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
    }

    public static void insertDocumentMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);
        String status = "done";

        System.out.println("Insert the order id: ");
        order.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Insert the customer name: ");
        order.setCustomerName(sc.nextLine());
        System.out.println("Insert the phone number: ");
        order.setPhoneNumber(sc.nextLong());

        MongoCollection<Document> collection = database.getCollection("Customers");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", order.getId())
                .append("customerName", order.getCustomerName())
                .append("phoneNumber", order.getPhoneNumber())
                .append("status", status);

        collection.insertOne(inspection);

    }

}
