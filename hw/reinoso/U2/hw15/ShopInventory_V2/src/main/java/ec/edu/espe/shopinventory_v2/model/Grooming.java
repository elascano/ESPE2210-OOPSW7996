package ec.edu.espe.shopinventory_v2.model;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.Scanner;
import java.util.logging.Filter;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class Grooming extends ProductWithVAT {

    Scanner scan = new Scanner(System.in);

    @Override
    public void createProduct() {
        try ( MongoClient client = MongoClients.create("mongodb+srv://JerlyReinoso:R1RNC@jerlyreinoso.vwcbpz1.mongodb.net/test")) {
            MongoDatabase db = client.getDatabase("ShopInventory");
            MongoCollection collection = db.getCollection("Grooming");
            System.out.print("Enter the id of the Grooming: ");
            int groomingId = scan.nextInt();
            System.out.print("Enter the name of the Grooming: ");
            scan.nextLine();
            String groomingName = scan.nextLine();
            System.out.print("Enter the quantity of the Gromming: ");
            int groomingQuantity = scan.nextInt();
            System.out.print("Enter the price of the Grooming: ");
            float groomingPrice = scan.nextFloat();
            Document newDocument = new Document("id", groomingId).append("name", groomingName).append("quantity", groomingQuantity).append("pricePerUnit", groomingPrice);
            collection.insertOne(newDocument);

            MongoDatabase bussinesDB = client.getDatabase("ShopInventory");
            MongoCollection collectionDB = db.getCollection("productsWithVAT");
            groomingPrice = Grooming.computeVAT(groomingPrice);
            Document newDocumentWithVAT = new Document("id", groomingId).append("name", groomingName).append("quantity", groomingQuantity).append("pricePerUnit", groomingPrice);
            collectionDB.insertOne(newDocumentWithVAT);

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect:" + me);
        }
    }

    @Override
    public void readProduct() {
        try ( MongoClient client = MongoClients.create("mongodb+srv://JerlyReinoso:R1RNC@jerlyreinoso.vwcbpz1.mongodb.net/test")) {
            MongoDatabase db = client.getDatabase("ShopInventory");
            MongoCollection collection = db.getCollection("Grooming");
            System.out.println("Please, enter the ID of the product you're looking for: ");
            int id = scan.nextInt();
            Bson filter = Filters.all("id", id);
            System.out.println("---> " + collection.find(filter).first());

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect:" + me);
        }

    }

    @Override
    public void updateProduct() {
        try ( MongoClient client = MongoClients.create("mongodb+srv://JerlyReinoso:R1RNC@jerlyreinoso.vwcbpz1.mongodb.net/test")) {
            MongoDatabase db = client.getDatabase("ShopInventory");
            MongoCollection collection = db.getCollection("Grooming");
            System.out.println("Enter the ID of the Grooming you want to Update:");
            int id = scan.nextInt();
            Bson filter = Filters.eq("id", id);

            System.out.println("What parameter you want to edit?");
            System.out.println("1) id");
            System.out.println("2) name");
            System.out.println("3) quantity");
            System.out.println("4) pricePerUnit");
            System.out.println("5) Exit");

            System.out.println("Please, choose one option: ");
            int parameter = scan.nextInt();
            switch (parameter) {
                case 1 -> {
                    System.out.println("Enter the new id: ");
                    int newId = scan.nextInt();
                    Bson updateId = Updates.set("id", newId);
                    collection.updateOne(filter, updateId);
                }
                case 2 -> {
                    scan.nextLine();
                    System.out.println("Enter the new name: ");
                    String newName = scan.nextLine();
                    Bson updateName = Updates.set("name", newName);
                    collection.updateOne(filter, updateName);
                }
                case 3 -> {
                    System.out.println("Enter the new quantity: ");
                    int newQuantity = scan.nextInt();
                    Bson updateQuantity = Updates.set("quantity", newQuantity);
                    collection.updateOne(filter, updateQuantity);
                }
                case 4 -> {
                    System.out.println("Enter the new pricePerUnit: ");
                    float newPricePerUnit = scan.nextFloat();
                    Bson updatePricePerUnit = Updates.set("pricePerUnit", newPricePerUnit);
                    collection.updateOne(filter, updatePricePerUnit);
                }
                case 5 -> System.exit(0);
                default -> System.exit(0);
            }

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect:" + me);
        }
    }

    @Override
    public void deleteProduct() {
        try ( MongoClient client = MongoClients.create("mongodb+srv://JerlyReinoso:R1RNC@jerlyreinoso.vwcbpz1.mongodb.net/test")) {
            MongoDatabase db = client.getDatabase("ShopInventory");
            MongoCollection collection = db.getCollection("Grooming");
            System.out.println("Enter the ID of the Snack you want to DELETE!:");
            int id = scan.nextInt();
            Bson filter = Filters.eq("id", id);
            collection.deleteOne(filter);

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect:" + me);
        }

    }

}
