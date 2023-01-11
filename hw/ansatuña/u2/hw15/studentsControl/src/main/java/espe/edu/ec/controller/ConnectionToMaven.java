package espe.edu.ec.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import espe.edu.ec.model.Event;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Karla Ansatuña
 */
public class ConnectionToMaven {

   
    private static final Scanner sc = new Scanner(System.in);

    public static void insertEvent(Event event) {
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("hw15");
            try {
                System.out.println("Connected successfully to the server.");
                MongoCollection<Document> collectionResident = database.getCollection("Event");

                Document events = new Document("_id", new ObjectId())
                        .append("id", event.getId())
                        .append("name", event.getName())
                        .append("date", event.getDate())
                        .append("guest", event.getGuest())
                        .append("description", event.getDescription());

                collectionResident.insertOne(events);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static Event findEvent(Event event) {

        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw15");
            try {
                MongoCollection<Document> collectionBurguer = database.getCollection("Event");

                Bson filter = Filters.eq("id", event.getId());
                try {
                    Document doc = collectionBurguer.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<Event> type = new TypeToken<Event>() {
                    };
                    event = gson.fromJson(Data, type.getType());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return event;
    }

    public static void updateEvent(Event event) {
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw15");

            try {

                MongoCollection collectionBurger = database.getCollection("Event");

                Bson filter = Filters.eq("id", event.getId());

                Bson updates = Updates.combine(Updates.set("id", event.getId()),
                        Updates.set("name", event.getName()),
                        Updates.set("date", event.getDate()),
                        Updates.set("guest", event.getGuest()),
                        Updates.set("description", event.getDescription()));

                collectionBurger.updateOne(filter, updates);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void deleteEvent(Event event) {

        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw15");
            try {
                MongoCollection collectionResident = database.getCollection("Event");

                Bson filter = Filters.eq("id", event.getId());
                collectionResident.deleteOne(filter);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
}