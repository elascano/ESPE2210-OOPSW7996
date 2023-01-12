package ec.edu.espe.TaxiAirportSystem.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.TaxiAirportSystem.model.Driver;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class MongoData {

    public static void insertDriver(Driver driver) {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {
                System.out.println("Connected successfully to server(Traveler).");

                MongoCollection<Document> collectionDriver = database.getCollection("Driver");

                Document drivers = new Document("_id", new ObjectId())
                        .append("id", driver.getId())
                        .append("name", driver.getName())
                        .append("phoneNumber", driver.getPhoneNumber())
                        .append("age", driver.getAge())
                        .append("adress", driver.getAdress())
                        .append("CI", driver.getCI())
                        .append("email", driver.getEmail())
                        .append("gender", driver.getGender())
                        .append("vehicleMark", driver.getVehicleMark())
                        .append("vehiclePlate", driver.getVehiclePLate())
                        .append("vehicleYear", driver.getVehicleYear());

                collectionDriver.insertOne(drivers);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void deleteDriver(Driver driver) {

        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {
                MongoCollection collectionDriver = database.getCollection("Driver");

                Bson filter = Filters.eq("id", driver.getId());
                collectionDriver.deleteOne(filter);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void updateDriver(Driver driver) {
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");

            try {

                MongoCollection collectionDriver = database.getCollection("Driver");

                Bson filter = Filters.eq("id", driver.getId());

                Bson updates = Updates.combine(Updates.set("id", driver.getId()),
                        Updates.set("name", driver.getName()),
                Updates.set("phoneNumber", driver.getPhoneNumber()),
                Updates.set("age", driver.getAge()),
                Updates.set("adress", driver.getAdress()),
                Updates.set("CI", driver.getCI()),
                Updates.set("email", driver.getEmail()),
                Updates.set("gender", driver.getGender()),
                Updates.set("vehicleMark", driver.getVehicleMark()),
                Updates.set("vehiclePlate", driver.getVehiclePLate()),
                Updates.set("vehicleYear", driver.getVehicleYear()));

                collectionDriver.updateOne(filter, updates);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
    public static Driver findDriver(Driver driver) {
        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://oop:oop@cluster0.hvgjsvt.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirporTaxiScheduing");
            try {
                MongoCollection<Document> collectionDriver = database.getCollection("Driver");

                Bson filter = Filters.eq("id", driver.getId());
                try {
                    Document doc = collectionDriver.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<Driver> type = new TypeToken<Driver>() {
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
}
