package ec.edu.espe.AirporTaxiScheduling.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.AirporTaxiScheduling.model.TaxiDriver;
import java.util.ArrayList;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TaxiDriverdbController {

    public static void insertDriver(TaxiDriver driver) {
        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
            try {
                System.out.println("Connected successfully to server(TaxiDriver).");

                MongoCollection<Document> collectionDriver = database.getCollection("TaxiDriver");

                Document drivers = new Document("_id", new ObjectId())
                        .append("CI", driver.getCI())
                        .append("name", driver.getName())
                        .append("phoneNumber", driver.getPhoneNumber())
                        .append("age", driver.getAge())
                        .append("adress", driver.getAdress())
                        .append("email", driver.getMail())
                        .append("gender", driver.getGender())
                        .append("vehicleMark", driver.getVehicleMark())
                        .append("vehiclePlate", driver.getVehiclePlate())
                        .append("vehicleYear", driver.getVehicleYear());

                collectionDriver.insertOne(drivers);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void deleteDriver(TaxiDriver driver) {

        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
            try {
                MongoCollection collectionDriver = database.getCollection("TaxiDriver");

                Bson filter = Filters.eq("CI", driver.getCI());
                collectionDriver.deleteOne(filter);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void updateDriver(TaxiDriver driver) {
        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");

            try {

                MongoCollection collectionDriver = database.getCollection("TaxiDriver");

                Bson filter = Filters.eq("CI", driver.getCI());

                Bson updates = Updates.combine(Updates.set("CI", driver.getCI()),
                        Updates.set("name", driver.getName()),
                        Updates.set("phoneNumber", driver.getPhoneNumber()),
                        Updates.set("age", driver.getAge()),
                        Updates.set("adress", driver.getAdress()),
                        Updates.set("email", driver.getMail()),
                        Updates.set("gender", driver.getGender()),
                        Updates.set("vehicleMark", driver.getVehicleMark()),
                        Updates.set("vehiclePlate", driver.getVehiclePlate()),
                        Updates.set("vehicleYear", driver.getVehicleYear()));

                collectionDriver.updateOne(filter, updates);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static TaxiDriver findDriver(TaxiDriver driver) {
        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
            try {
                MongoCollection<Document> collectionDriver = database.getCollection("TaxiDriver");

                Bson filter = Filters.eq("CI", driver.getCI());
                try {
                    Document doc = collectionDriver.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<TaxiDriver> type = new TypeToken<TaxiDriver>() {
                    };
                    driver = gson.fromJson(Data, type.getType());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return driver;
    }

    public static ArrayList<TaxiDriver> loadFromDatabase(ArrayList<TaxiDriver> objects, MongoDatabase database, String collectionName) {
        Gson gson = new Gson();
        MongoCollection<Document> objectsCollection = database.getCollection(collectionName);
        FindIterable<Document> result = objectsCollection.find(Filters.gt("phoneNumber", 0));
        result.forEach(d -> objects.add(gson.fromJson(d.toJson(), TaxiDriver.class)));
        return objects;
    }

}
