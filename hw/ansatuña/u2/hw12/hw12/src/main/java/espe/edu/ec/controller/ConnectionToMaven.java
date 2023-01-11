package espe.edu.ec.controller;

//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import espe.edu.ec.model.Event;
import org.bson.conversions.Bson;
import java.util.Scanner;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author NW USER
 */
public class ConnectionToMaven {

    private static final Scanner sc = new Scanner(System.in);

    public static void insertEvent() {
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw12Crud");
            try {
                System.out.println("Connected to the data base.");
                MongoCollection<Document> eventCollection = database.getCollection("Event");

                Document event = insertDataEvent();

                eventCollection.insertOne(event);
                System.out.println("New event has been added: " + event.get("name"));

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void findEvent() {

        int id;
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw12Crud");
            try {
                System.out.println("Connected to the data base.");

                MongoCollection<Document> collection = database.getCollection("Event");

                System.out.print("\nEnter the id to find: ");
                id = sc.nextInt();

                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = collection.find(Filters.and(filter)).first();
                    System.out.println("Event --> " + doc.toJson());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void updateEvent() {

        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw12Crud");
            try {
                System.out.println("Connected to the data base.");

                MongoCollection eventCollection = database.getCollection("Event");

                System.out.print("\nEnter the id to update: ");
                int id = sc.nextInt();
                Bson filter = Filters.eq("id", id);

                Event event = updateLocalEvent();

                Bson eventUpdates = Updates.combine(
                        Updates.set("id", event.getId()),
                        Updates.set("name", event.getName()),
                        Updates.set("date", event.getDate()),
                        Updates.set("description", event.getDescription()));

                eventCollection.updateOne(filter, eventUpdates);

                System.out.println("Data has been updated");

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    private static Event updateLocalEvent() {
        Event event = new Event();

        System.out.print("\nEnter the new id: ");
        event.setId(sc.nextInt());
        System.out.print("Enter the new name: ");
        event.setName(sc.nextLine());
        sc.nextLine();
        System.out.print("Enter the date: ");
        event.setDate(sc.nextLine());
        System.out.print("Enter the new description: ");
        event.setDescription(sc.nextLine());

        return event;
    }

    public static void deleteEvent() {
        int id;
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw12Crud");
            try {
                System.out.println("Connected to the data base.");

                MongoCollection collection = database.getCollection("students");

                System.out.print("\nEnter the id to delete: ");
                id = sc.nextInt();

                Bson filter = Filters.eq("id", id);

                collection.deleteOne(filter);

                System.out.println("Data has been deleted");

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    private static Document insertDataEvent() {
        Event event = new Event();
        System.out.print("\nEnter the id: ");
        event.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter the name: ");
        event.setName(sc.nextLine());
        System.out.print("Enter the description: ");
        event.setDescription(sc.nextLine());
        System.out.print("Enter the date: ");
        event.setDate(sc.nextLine());

        return new Document("_id", new ObjectId())
                .append("id", event.getId())
                .append("name", event.getName())
                .append("date", event.getDate())
                .append("description", event.getDescription());
    }

    private static void cancelLocalEvent(int id) {
        String description;
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw12Crud");
            try {
                MongoCollection eventCollection = database.getCollection("Canceled Event");

                Bson filter = Filters.eq("id", id);
                System.out.println("Write the reason why the event is canceled:");
                description = sc.next();  
                Bson eventUpdates = Updates.combine(Updates.set("description",description));

                eventCollection.updateOne(filter, eventUpdates);

                System.out.println("Data has been updated");

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void cancelEvent() {
        int id;

        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw12Crud");
            try {
                System.out.println("Connected to the data base.");

                MongoCollection<Document> eventCollection = database.getCollection("Event");
                MongoCollection<Document> canceledEventCollection = database.getCollection("Canceled Event");
                System.out.print("\nEnter the id to find: ");
                id = sc.nextInt();
                Bson filter = Filters.eq("id", id);
                try {
                    Document doc = eventCollection.find(Filters.and(filter)).first();
                    canceledEventCollection.insertOne(doc);
                    cancelLocalEvent(id);
                    System.out.println("Event saved in the Canceled Event db");

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
}
