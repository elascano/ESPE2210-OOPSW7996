package ec.edu.espe.ExtraordinaryPayment.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.ExtraordinaryPayment.model.Resident;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Controller {

    private static final Resident resident = new Resident();

    public static void insertInAOtherCollection(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Enter the resident id:");
        resident.setId(sc.nextInt());
        System.out.println("----------------------");

        MongoCollection<Document> collection = database.getCollection("ExtraordinaryPayment");
        MongoCollection<Document> collection2 = database.getCollection("Residents");
        Bson filter = Filters.and(Filters.eq("id", resident.getId()));

        if (collection.find(filter).first() != null) {
            
            collection2.insertOne(collection.find(filter).first());

            System.out.println("----------------------------------------------------------");
            System.out.println("The resident has been save in the Resident collection");
            System.out.println("----------------------------------------------------------");
            
        } else {
            System.out.println("Resident not found :c");
        }

    }

    public static void deleteMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("Enter the resident id:");
        resident.setId(sc.nextInt());
        System.out.println("----------------------");

        MongoCollection<Document> collection = database.getCollection("ExtraordinaryPayment");
        Bson query = Filters.eq("id", resident.getId());
        Bson filter = Filters.and(Filters.all("id", resident.getId()));

        if (collection.find(filter).first() != null) {

            collection.deleteOne(query);

            System.out.println("---------------------------");
            System.out.println("The resident has been delete");
            System.out.println("---------------------------");

        } else {
            System.out.println("Resident not found :c");
        }

    }

    public static void updateMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);
        String month;

        System.out.println("----------------------");
        System.out.println("Enter the resident id:");
        resident.setId(sc.nextInt());
        System.out.println("----------------------");

        MongoCollection<Document> collection = database.getCollection("ExtraordinaryPayment");
        Bson query = Filters.eq("id", resident.getId());
        Bson filter = Filters.and(Filters.all("id", resident.getId()));

        if (collection.find(filter).first() != null) {

            sc.nextLine();
            System.out.println("Change the resident name: ");
            resident.setName(sc.nextLine());
            System.out.println("Change the payment: ");
            resident.setPay(sc.nextFloat());
            sc.nextLine();
            System.out.println("Change the payment month: ");
            month = sc.nextLine();

            Bson updates = Updates.combine(
                    Updates.set("name", resident.getName()),
                    Updates.set("month", month),
                    Updates.set("payment", resident.getPay()));
            collection.updateOne(query, updates);

            System.out.println("---------------------------");
            System.out.println("The resident has been modified");
            System.out.println("---------------------------");
        } else {
            System.out.println("Resident not found :c");
        }
    }

    public static void readMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Enter the resident id:");
        resident.setId(sc.nextInt());
        System.out.println("----------------------");

        MongoCollection collection = database.getCollection("ExtraordinaryPayment");
        Bson filter = Filters.and(Filters.all("id", resident.getId()));
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
            System.out.println("Resident not found :c");
        }
    }

    public static void readAllMongo(MongoDatabase database) {

        MongoCollection collection = database.getCollection("ExtraordinaryPayment");
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
        String month, status = "done";

        System.out.println("Insert the resident id: ");
        resident.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Insert the resident name: ");
        resident.setName(sc.nextLine());
        System.out.println("Insert the payment month: ");
        month = sc.nextLine();
        System.out.println("Insert the payment: ");
        resident.setPay(sc.nextFloat());
        sc.nextLine();

        MongoCollection<Document> collection = database.getCollection("ExtraordinaryPayment");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", resident.getId())
                .append("name", resident.getName())
                .append("month", month)
                .append("payment", resident.getPay())
                .append("status", status);

        collection.insertOne(inspection);

    }

}
