package ec.edu.espe.huertoEcoMarket.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import ec.edu.espe.huertoEcoMarket.model.Product;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Manager {

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

    public static void insertProduct(Product product) {
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("Store");
            try {
                System.out.println("Connected successfully to server(Store).");
                MongoCollection<Document> collectionProduct = database.getCollection("productStore");

                Document docProduct = new Document("_id", new ObjectId())
                        .append("id", product.getId())
                        .append("name", product.getName())
                        .append("type", product.getType());

                collectionProduct.insertOne(docProduct);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static Product findProduct(Product product) {

        String Data;
        Gson gson = new Gson();
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Store");
            try {
                MongoCollection<Document> collectionProduct = database.getCollection("productStore");

                Bson filter = Filters.eq("id", product.getId());
                try {
                    Document doc = collectionProduct.find(Filters.and(filter)).first();
                    Data = doc.toJson();
                    TypeToken<Product> type = new TypeToken<Product>() {
                    };
                    product = gson.fromJson(Data, type.getType());

                } catch (Exception e) {
                    System.out.println("Data not found");
                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }

        return product;
    }

    public static void updateProduct(Product product) {
        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Store");

            try {

                MongoCollection collectionProduct = database.getCollection("productStore");

                Bson filter = Filters.eq("id", product.getId());

                Bson updates = Updates.combine(Updates.set("id", product.getId()),
                        Updates.set("name", product.getName()),
                        Updates.set("type", product.getType()));

                collectionProduct.updateOne(filter, updates);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void deleteProduct(Product product) {

        String uri = "mongodb+srv://oop09:oop@cluster0.pankc7e.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Store");
            try {
                MongoCollection collectionProduct = database.getCollection("productStore");

                Bson filter = Filters.eq("id", product.getId());
                collectionProduct.deleteOne(filter);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }

        }
    }
}
