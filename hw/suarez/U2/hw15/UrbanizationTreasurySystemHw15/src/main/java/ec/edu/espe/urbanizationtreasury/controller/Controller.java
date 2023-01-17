package ec.edu.espe.urbanizationtreasury.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.urbanizationtreasury.model.Resident;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Matias Suarez, WebMasterTeam, DCCO-ESPE
 */
public class Controller {

    public static int dniValidation(String dniValidation) {

        int number = 0, suma = 0, resultado = 0, result = 0;

        for (int i = 0; i < dniValidation.length(); i++) {
            number = Integer.parseInt(String.valueOf(dniValidation.charAt(i)));
            if (i % 2 == 0) {
                number = number * 2;
                if (number > 9) {
                    number = number - 9;
                }
            }
            suma = suma + number;
        }
        if (suma % 10 != 0) {
            resultado = 10 - (suma % 10);
            if (resultado == number) {
                System.out.println("Valid DNI");
            } else if (resultado != number) {
                System.out.println("Invalid DNI");
            }
        } else {
            System.out.println("Valid DNI");
            result = 1;
        }
        return (result);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void insertResident(Resident resident) {
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("urbanization");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection<Document> collectionResident = database.getCollection("residents");

                Document residen = new Document("_id", new ObjectId())
                        .append("id", resident.getId())
                        .append("name", resident.getName())
                        .append("batch", resident.getBatch());

                collectionResident.insertOne(residen);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static Resident findResident(Resident resident) {

        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("urbanization");
            try {
                MongoCollection<Document> collectionBurguer = database.getCollection("residents");

                Bson filter = Filters.eq("id", resident.getId());
                try {
                    Document doc = collectionBurguer.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<Resident> type = new TypeToken<Resident>() {
                    };
                    resident = gson.fromJson(Data, type.getType());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return resident;
    }

    public static void updateResident(Resident resident) {
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("urbanization");

            try {

                MongoCollection collectionBurger = database.getCollection("residents");

                Bson filter = Filters.eq("id", resident.getId());

                Bson updates = Updates.combine(Updates.set("id", resident.getId()),
                        Updates.set("name", resident.getName()),
                        Updates.set("batch", resident.getBatch()));

                collectionBurger.updateOne(filter, updates);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void deleteResident(Resident resident) {

        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("urbanization");
            try {
                MongoCollection collectionResident = database.getCollection("residents");

                Bson filter = Filters.eq("id", resident.getId());
                collectionResident.deleteOne(filter);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
}
