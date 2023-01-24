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
import ec.edu.espe.urbanizationtreasury.model.Animal;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Matias Suarez, WebMasterTeam, DCCO-ESPE
 */
public class Controller {

    private static final Scanner sc = new Scanner(System.in);

    public static void insertAnimal(Animal animal) {
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("urbanization");
            try {
                System.out.println("Connected successfully to server(menu).");
                MongoCollection<Document> collectionResident = database.getCollection("residents");

                Document residen = new Document("_id", new ObjectId())
                        .append("id", animal.getId())
                        .append("species", animal.getSpecies())
                        .append("color", animal.getColor());

                collectionResident.insertOne(residen);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static Animal findAnimal(Animal animals) {

        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("urbanization");
            try {
                MongoCollection<Document> collectionBurguer = database.getCollection("residents");

                Bson filter = Filters.eq("id", animals.getId());
                try {
                    Document doc = collectionBurguer.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<Animal> type = new TypeToken<Animal>() {
                    };
                    animals = gson.fromJson(Data, type.getType());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return animals;
    }

    public static void updateAnimal(Animal animals) {
        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("urbanization");

            try {

                MongoCollection collectionBurger = database.getCollection("residents");

                Bson filter = Filters.eq("id", animals.getId());

                Bson updates = Updates.combine(Updates.set("id", animals.getId()),
                        Updates.set("species", animals.getSpecies()),
                        Updates.set("color", animals.getColor()));

                collectionBurger.updateOne(filter, updates);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void deleteAnimal(Animal animals) {

        String uri = "mongodb+srv://oop:oop@clusterm.ro2u9de.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("urbanization");
            try {
                MongoCollection collectionResident = database.getCollection("residents");

                Bson filter = Filters.eq("id", animals.getId());
                collectionResident.deleteOne(filter);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
}
