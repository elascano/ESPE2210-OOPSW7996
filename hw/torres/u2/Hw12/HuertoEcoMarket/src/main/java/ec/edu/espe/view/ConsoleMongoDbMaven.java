package ec.edu.espe.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.controller.DataBaseManager;
import ec.edu.espe.model.Product;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ConsoleMongoDbMaven {

    public static void main(String[] args) {

        String uri = "mongodb+srv://OOP:OOP@clusteroop.htwlkgc.mongodb.net/?retryWrites=true&w=majority";
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        int option = 0;

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("HuertoEcoMarket");
            try {
                System.out.println("Connected successfully to DataBase");

                MongoCollection collectionProduct = database.getCollection("Products");

                while (option != 7) {
                    System.out.println("\n  Huerto EcoMarket");
                    System.out.println("Carlos Alexander Torres");
                    System.out.println("\n\tMAIN MENU");
                    System.out.println("1. Add a new product");
                    System.out.println("2. Show all products");
                    System.out.println("3. Delete a product");
                    System.out.println("4. Find a producto");
                    System.out.println("5. Update a product");
                    System.out.println("6. Register sale with offer");
                    System.out.println("7. Exit");

                    System.out.print("Choose an option: ");
                    try {
                        option = sc.nextInt();
                    } catch (Exception e) {
                        option = 0;
                    }
                    sc.nextLine();

                    switch (option) {
                        case 1 -> {
                            DataBaseManager.addProduct(product, collectionProduct);
                        }

                        case 2 -> {
                            DataBaseManager.printProducts(collectionProduct);

                        }

                        case 3 -> {
                            DataBaseManager.printProducts(collectionProduct);
                            DataBaseManager.deleteProduct(collectionProduct);

                        }

                        case 4 -> {

                            DataBaseManager.findProduct(collectionProduct);
                        }

                        case 5 -> {
                            DataBaseManager.printProducts(collectionProduct);
                            DataBaseManager.updateProduct(collectionProduct);

                        }

                        case 6 -> {
                            DataBaseManager.SaleWithOffer();
                        }
                        case 7 ->
                            System.out.println("See you later");

                        default ->
                            System.out.println("Error: Invalid option, please try again.");
                    }

                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
}
