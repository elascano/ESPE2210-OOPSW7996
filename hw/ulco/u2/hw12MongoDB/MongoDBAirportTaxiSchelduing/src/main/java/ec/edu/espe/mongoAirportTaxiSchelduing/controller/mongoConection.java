
package ec.edu.espe.mongoAirportTaxiSchelduing.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.mongoAirportTaxiSchelduing.model.Traveler;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class mongoConection {
    
     public static void readTraveles(Scanner scan) {
        int option = 0;
        do {
            System.out.println("===============================");
            System.out.println("         SEARCH TRAVELER      ");
            System.out.println("===============================");
            System.out.println("1.Search one traveler");
            System.out.println("2.View Travelers");
            System.out.println("3.Return");

            try {
                System.out.println("Digit an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        searchOneTraveler(scan);
                        break;
                    case 2:
                        viewtravelers();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nonexistent option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect dataType");
                scan.next();
            }
        } while (option != 3);
    }

    public static void viewtravelers() {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                MongoCollection collection = database.getCollection("Traveler");

                Bson filter = Filters.and(Filters.gt("id", 0));
                MongoCursor<Document> cursor = collection.find(filter).iterator();

                try {
                    while (cursor.hasNext()) {
                        System.out.println(cursor.next().toJson());
                    }
                } finally {
                    cursor.close();
                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    public static void travelCost(Scanner scan) {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {

                System.out.println("Connected successfully to server(Traveler).");
                MongoCollection<Document> collectionTripPrice = database.getCollection("TripPrice");
                int id;
                System.out.println("=========================");
                System.out.println("     TRAVEL PRICE");
                System.out.println("=========================");
                System.out.print("Enter the id: ");
                id = scan.nextInt();
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionTripPrice.find(Filters.and(filter)).first();
                    System.out.println("Traveler --> " + doc.toJson());
                } catch (Exception e) {
                    System.out.println("****Data not found***");
                }
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    public static void deletTraveler(Scanner scan) {
        int id;
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {
                System.out.println("Connected successfully to server(Traveler).");

                MongoCollection<Document> collectionTraveler = database.getCollection("Traveler");
                System.out.println("=========================");
                System.out.println(" DELETE TRAVELER");
                System.out.println("=========================");
                System.out.print("Enter the id to delete: ");
                id = scan.nextInt();

                Bson filter = Filters.eq("id", id);

                collectionTraveler.deleteOne(filter);

                System.out.println("****DATA DELETED SUCCESSFULLY****");

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void updateTraveler(Scanner scan) {
        int id;

        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {
                System.out.println("Connected successfully to server(Traveler).");

                MongoCollection<Document> collectionTraveler = database.getCollection("Traveler");
                Traveler traveler = new Traveler();
                System.out.println("=========================");
                System.out.println(" UPDATE TRAVELER");
                System.out.println("=========================");

                System.out.print("Enter the id : ");
                id = scan.nextInt();
                Bson filter = Filters.eq("id", id);

                System.out.println("Enter the new name: ");
                traveler.setName(scan.next());
                System.out.println("Enter the new adress: ");
                traveler.setAdress(scan.next());
                System.out.println("Enter the Kilometes Traveler: ");
                traveler.setKilometesTraveler(scan.nextFloat());

                Bson updates = Updates.combine(
                        Updates.set("name", traveler.getName()),
                        Updates.set("adress", traveler.getAdress()),
                        Updates.set("kilometeSTraveler", traveler.getKilometesTraveler()));

                collectionTraveler.updateOne(filter, updates);

                System.out.println("****SUCCESSFULLY UPDATED DATA*****");
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void searchOneTraveler(Scanner scan) {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {

                System.out.println("Connected successfully to server(Traveler).");
                MongoCollection<Document> collectionTraveler = database.getCollection("Traveler");
                int id;

                System.out.print("Enter the id: ");
                id = scan.nextInt();
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collectionTraveler.find(Filters.and(filter)).first();
                    System.out.println("Traveler --> " + doc.toJson());
                } catch (Exception e) {
                    System.out.println("****Data not found***");
                }
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    public static void addTraveler(Scanner scan) {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {
                System.out.println("Connected successfully to server(Traveler).");
                MongoCollection<Document> collectionTraveler = database.getCollection("Traveler");
                MongoCollection<Document> collectionTripPrice = database.getCollection("TripPrice");

                Traveler traveler = new Traveler();
                System.out.println("=========================");
                System.out.println(" NEW TRAVELER");
                System.out.println("=========================");
                System.out.println("Enter the id: ");
                traveler.setId(scan.nextInt());
                System.out.println("Enter the name: ");
                traveler.setName(scan.next());
                System.out.println("Enter the adress: ");
                traveler.setAdress(scan.next());
                System.out.println("Enter the Kilometes Traveler: ");
                traveler.setKilometesTraveler(scan.nextFloat());

                Document Traveler = new Document("_id", new ObjectId())
                        .append("id", traveler.getId())
                        .append("name", traveler.getName())
                        .append("adress", traveler.getAdress())
                        .append("kilometesTraveler", traveler.getKilometesTraveler());

                collectionTraveler.insertOne(Traveler);

                float price;
                price = (float) 0.40;
                price = traveler.getKilometesTraveler() * price;
                Document TripPrice = new Document("_id", new ObjectId())
                        .append("id", traveler.getId())
                        .append("name", traveler.getName())
                        .append("Price", price);

                collectionTripPrice.insertOne(TripPrice);

                System.out.println("PASSENGER ADDED SUCCESSFULLY--->" + Traveler.get("id"));
            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

}


