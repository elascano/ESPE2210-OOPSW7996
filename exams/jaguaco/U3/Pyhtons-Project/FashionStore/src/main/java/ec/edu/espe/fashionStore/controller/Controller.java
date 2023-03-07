package ec.edu.espe.fashionStore.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.fashionstore.model.Measurement;
import ec.edu.espe.fashionstore.model.Order;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Controller {

    private static final Scanner sc = new Scanner(System.in);
    //private static final Order order = new Order();
    private static final Measurement measurement = new Measurement();

    public static void insertDocumentMongo(MongoDatabase database, Order order) {

        MongoCollection<Document> collection = database.getCollection("Orders");
        Document inspection = new Document("_id", new ObjectId())
                .append("id", order.getId())
                .append("customerName", order.getCustomerName())
                .append("phoneNumber", order.getPhoneNumber())
                .append("measurement", new Document()
                        .append("neckMeasurement", order.getMeasurement().getNeckMeasurement())
                        .append("chestMeasurement", order.getMeasurement().getChestMeasurement())
                        .append("shoulderMeasurement", order.getMeasurement().getShoulderMeasurement())
                        .append("armMeasurement", order.getMeasurement().getArmMeasurement())
                        .append("hipMeasurement", order.getMeasurement().getHipMeasurement())
                        .append("waistMeasurement", order.getMeasurement().getWaistMeasurement())
                        .append("legMeasurement", order.getMeasurement().getLegMeasurement()))
                .append("day", order.getDay())
                .append("month", order.getMonth())
                .append("year", order.getYear());

        collection.insertOne(inspection);

    }

    public static Order readMongo(MongoDatabase database, int id) {
        Order order;
        String document = "";
        Gson gson = new Gson();

        MongoCollection<Document> collection = database.getCollection("Orders");

        Bson filter = Filters.eq("id", id);
        Document query = collection.find(Filters.and(filter)).first();

        document = query.toJson();
        TypeToken<Order> type = new TypeToken<Order>() {
        };
        order = gson.fromJson(document, type.getType());

        return order;

    }

    public static boolean noRepeatOrder(MongoDatabase database, int id, boolean existOrder) {

        MongoCollection<Document> collection2 = database.getCollection("Orders");
        Bson filter = Filters.and(Filters.all("id", id));

        if (collection2.find(filter).first() == null) {
            existOrder = false;
        }
        if (collection2.find(filter).first() != null) {
            existOrder = true;
        }
        return existOrder;

    }

    public static void updateMongo(MongoDatabase database, Order order) {
        MongoCollection<Document> collection = database.getCollection("Orders");
        Bson query = Filters.eq("id", order.getId());
        Bson filter = Filters.and(Filters.all("id", order.getId()));

        if (collection.find(filter).first() != null) {

            Bson updates;
            updates = Updates.combine(Updates.set("customerName", order.getCustomerName()),
                    Updates.set("phoneNumber", order.getPhoneNumber()),
                    Updates.set("measurement.neckMeasurement", order.getMeasurement().getNeckMeasurement()),
                    Updates.set("measurement.chestMeasurement", order.getMeasurement().getChestMeasurement()),
                    Updates.set("measurement.shoulderMeasurement", order.getMeasurement().getShoulderMeasurement()),
                    Updates.set("measurement.armMeasurement", order.getMeasurement().getArmMeasurement()),
                    Updates.set("measurement.hipMeasurement", order.getMeasurement().getHipMeasurement()),
                    Updates.set("measurement.waistMeasurement", order.getMeasurement().getWaistMeasurement()),
                    Updates.set("measurement.legMeasurement", order.getMeasurement().getNeckMeasurement()),
                    Updates.set("day", order.getDay()),
                    Updates.set("month", order.getMonth()),
                    Updates.set("year", order.getYear()));
            collection.updateOne(query, updates);

        } else {
            System.out.println("Order not found");
        }
    }

    public static void deleteMongo(MongoDatabase database, Order order) {

        MongoCollection<Document> collection = database.getCollection("Orders");
        Bson query = Filters.eq("id", order.getId());
        Bson filter = Filters.and(Filters.all("id", order.getId()));

        if (collection.find(filter).first() != null) {

            collection.deleteOne(query);

        } else {
            System.out.println("Order not found");
        }

    }   
}

