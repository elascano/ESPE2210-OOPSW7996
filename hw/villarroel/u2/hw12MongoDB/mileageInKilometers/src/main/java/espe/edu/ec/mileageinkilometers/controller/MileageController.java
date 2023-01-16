
package espe.edu.ec.mileageinkilometers.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import espe.edu.ec.mileageinkilometers.model.Mileage;
import java.time.Instant;
import java.util.Date;

import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class MileageController {
    private static final Mileage mileage = new Mileage();
    public static void insertDocumentMongo(MongoDatabase database) {

        
        
        Scanner sc = new Scanner(System.in);
        
        String status = "done";

        System.out.println("===========================================");
        System.out.println("Insert the order id: ");
        mileage.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Insert the kilometers traveled: ");
        mileage.setKilometers(sc.nextFloat());
        Date date = Date.from(Instant.now());
        mileage.setDate(date);
        System.out.println("===========================================");
        

        MongoCollection<Document> collection = database.getCollection("Mileage");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", mileage.getId())
                .append("kilometers", mileage.getKilometers())
                .append("date", mileage.getDate())
                .append("status", status);

        collection.insertOne(inspection);

    }

    
    public static void readAllMongo(MongoDatabase database) {

        MongoCollection collection = database.getCollection("Mileage");
        
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

    public static void deleteMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("Enter the Mileage id:");
        mileage.setId(sc.nextInt());
        System.out.println("===========================================");
        MongoCollection<Document> collection = database.getCollection("Mileage");
        
        Bson query = Filters.eq("id", mileage.getId());
        
        Bson filter = Filters.and(Filters.all("id", mileage.getId()));
        

        if (collection.find(filter).first() != null) {

            collection.deleteOne(query);

            System.out.println("===========================================");
            System.out.println("The Kilometers has been deleted");
            System.out.println("===========================================");

        } else {
            System.out.println("Mileage not found");
        }

    }

    public static void updateMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);
        

        System.out.println("===========================================");
        System.out.println("Enter the Mileage id:");
        mileage.setId(sc.nextInt());
        System.out.println("===========================================");

        MongoCollection<Document> collection = database.getCollection("Mileage");
        
        Bson query = Filters.eq("id", mileage.getId());
        
        Bson filter = Filters.and(Filters.all("id", mileage.getId()));
        

        if (collection.find(filter).first() != null) {

            sc.nextLine();
            System.out.println("Change the Kilometers: ");
            mileage.setKilometers(sc.nextFloat());

            Bson updates = Updates.combine(Updates.set("kilometers", mileage.getKilometers()));
            collection.updateOne(query, updates);

            System.out.println("===========================================");
            System.out.println("The Mileage has been modified");
            System.out.println("===========================================");
        } else {
            System.out.println("Mileage not found :c");
        }
    }

    public static void readMongo(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Enter the id:");
        mileage.setId(sc.nextInt());
        System.out.println("===========================================");

        MongoCollection collection = database.getCollection("Mileage");
        
        Bson filter = Filters.and(Filters.all("id", mileage.getId()));
        
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
            System.out.println("Mileage not found :c");
        }
    }

    public static void insertInAOtherCollection(MongoDatabase database) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("Enter the Mileage id:");
        mileage.setId(sc.nextInt());
        System.out.println("===========================================");

        MongoCollection<Document> collection = database.getCollection("Mileage");
        MongoCollection<Document> collection2 = database.getCollection("KilometersTraveled");
        Bson filter = Filters.and(Filters.eq("id", mileage.getId()));

        if (collection.find(filter).first() != null) {

            collection2.insertOne(collection.find(filter).first());

            System.out.println("===========================================");
            System.out.println("The Mileage has been saved in the Orders collection");
            System.out.println("===========================================");

        } else {
            System.out.println("Mileage not found");
        }

    }

    
}
