package espe.edu.ec.controller;

import java.util.Scanner;
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

    /*public static void insertEvent() {
        String uri = "mongodb+srv://OOP01:OOP123@cluster0.pikbt03.mongodb.net/test";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("hw15");
            try {
                System.out.println("Connected to the data base.");
                MongoCollection<Document> eventCollection = database.getCollection("Event");

                Document event = insertDataEvent();

                eventCollection.insertOne(event);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
*/
    public static Document insertDataEvent() {
        Event event = new Event();
        event.setName(sc.nextLine());
        event.setDate(sc.nextLine());
        event.setId(sc.nextLine());
        event.setDescription(sc.nextLine());
        return new Document("_id", new ObjectId())
                .append("id", event.getId())
                .append("name", event.getName())
                .append("date", event.getDate())
                .append("description", event.getDescription());
    }

    
}
