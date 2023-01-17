package ec.edu.espe.hw12project.controller;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.hw12project.model.Service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class DBManager {

    public static void addRatingService(Service service, MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        String name;
        int id;
        int qualityOfService;
        try {

            System.out.print("Write the ID of your preference (only numbers):");
            id = sc.nextInt();
            sc.nextLine();
            service.setId(id);
            System.out.print("Write your name, if you do not wish it can be Anonymous: ");
            name = sc.nextLine();
            service.setName(name);
            System.out.print("From 1 to 5, insert the quality of service received: ");
            qualityOfService = sc.nextInt();
            sc.nextLine();
            service.setQualityOfService(qualityOfService);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Data was not saved");
        }
        try {
            InsertOneResult result = collection.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("id", service.getId())
                    .append("name", service.getName())
                    .append("qualityOfService", service.getQualityOfService()));

            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }
    
    public static void findRatingService(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        String nameToFind = "";
        try {
            System.out.print("type name to find: ");
            nameToFind = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("id", "name", "qualityOfService"),
                Projections.excludeId());
        Document serviceFind = (Document) collection.find(eq("name", nameToFind))
                .projection(projectionFields)
                .first();
        if (serviceFind == null) {
            System.out.println("No results found.");
        } else {
            System.out.println(serviceFind.toJson());
        }
    }
    
    public static void printRatingService(MongoCollection collection) {
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public static void deleteRatingService(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int ratingToDelete = 0;
        try {
            System.out.print("type rating's ID to delete: ");
            ratingToDelete = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("id", "name", "qualityOfService"),
                Projections.excludeId());
        Document doc = (Document) collection.find(eq("id", ratingToDelete))
                .projection(projectionFields)
                .first();
        if (doc == null) {
            System.out.println("No results found.");
        } else {
            Bson ratingDelete = eq("id", ratingToDelete);
            try {
                DeleteResult result = collection.deleteOne(ratingDelete);
                System.out.println("Deleted document count: " + result.getDeletedCount());
            } catch (MongoException me) {
                System.err.println("Unable to delete due to an error: " + me);
            }
        }
    }
    
    public static void modifyRatingService(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int optionFind = 0;
        int ratingToModify = 0;
        try {
            System.out.print("type the ID to modify the select rating: ");
            ratingToModify = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("id", "name", "qualityOfService"),
                Projections.excludeId());
        Document doc = (Document) collection.find(eq("id", ratingToModify))
                .projection(projectionFields)
                .first();
        if (doc == null) {
            System.out.println("No results found.");
        } else {
            Document service = new Document().append("id", ratingToModify);

            while (optionFind != 4) {

                System.out.println("1. ID");
                System.out.println("2. Name");
                System.out.println("3. Rating Quality of Service");
                System.out.println("4. Back");

                System.out.print("Please choose an option: ");
                try {
                    optionFind = sc.nextInt();
                } catch (Exception e) {
                    optionFind = 0;
                }
                sc.nextLine();
                switch (optionFind) {
                    case 1 -> {
                        String idUpdated;

                        //name
                        System.out.print("type the new ID: ");
                        idUpdated = sc.nextLine();

                        Bson updates = Updates.combine(
                                Updates.set("id", idUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(service, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 2 -> {
                        
                        String nameUpdated;

                        System.out.print("type the new name: ");
                        nameUpdated = sc.nextLine();

                        Bson updates = Updates.combine(
                                Updates.set("name", nameUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(service, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 3 -> {
                        int qualityOfServiceUpdated;

                        //student Number
                        System.out.print("From 1 to 5, insert the quality of service received:  ");
                        qualityOfServiceUpdated = sc.nextInt();

                        Bson updates = Updates.combine(Updates.set("QualityOfService", qualityOfServiceUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(service, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 4 -> {

                    }
                    default ->
                        System.out.println("Error: Invalid option try again.");

                }
            }
        }
    }
    
    public static void calculate(MongoCollection collectionService, MongoCollection collectionServiceGrade) {
        ArrayList<Service> services;
        ArrayList<Object> listObjects;
        listObjects = new ArrayList<>();
        int totalServiceGrade = 0;
        LocalDate now = LocalDate.now();

        try ( MongoCursor<Document> cursor = collectionService.find().iterator()) {
            while (cursor.hasNext()) {
                listObjects.add(cursor.next().values().toArray());
            }
        }

        services = Service.read(listObjects);

        for (int i = 0; i < services.size(); i++) {
            totalServiceGrade += services.get(i).getQualityOfService();
        }

        try {
            InsertOneResult result = collectionServiceGrade.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("date", now.format(DateTimeFormatter.ISO_DATE))
                    .append("totalService", collectionService.countDocuments())
                    .append("totalServiceGrade", totalServiceGrade));

            System.out.println("The total grade of the quality of Service is : " + totalServiceGrade);
            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }
}
