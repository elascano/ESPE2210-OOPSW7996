
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
 * @author Juan Pinza, Search Engine Bandits , DCCO-ESPE
 */
public class Candy extends ProductWithVAT {

    Scanner scan = new Scanner(System.in);

    @Override
    public void createProduct() {
        try ( MongoClient client = MongoClients.create("mongodb+srv://pinza:153@pinzadatabase.yy2byr4.mongodb.net/?retryWrites=true&w=majority")) {
            MongoDatabase db = client.getDatabase("project");
            MongoCollection collection = db.getCollection("candy");
            System.out.print("Enter the id of the Candy: ");
            int candyId = scan.nextInt();
            System.out.print("Enter the name of the Candy: ");
            scan.nextLine();
            String candyName = scan.nextLine();
            System.out.print("Enter the quantity of the Candy: ");
            int candyQuantity = scan.nextInt();
            System.out.print("Enter the price of the Candy: ");
            float candyPrice = scan.nextFloat();
            Document newDocument = new Document("id", candyId).append("name", candyName).append("quantity", candyQuantity).append("pricePerUnit", candyPrice);
            collection.insertOne(newDocument);

            MongoDatabase bussinesDB = client.getDatabase("project");
            MongoCollection collectionDB = db.getCollection("productsWithVAT");
            candyPrice = Candy.computeVAT(candyPrice);
            Document newDocumentWithVAT = new Document("id", candyId).append("name", candyName).append("quantity", candyQuantity).append("pricePerUnit", candyPrice);
            collectionDB.insertOne(newDocumentWithVAT);

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect:" + me);
        }
    }

    @Override
    public void readProduct() {
        try ( MongoClient client = MongoClients.create("mongodb+srv://pinza:153@pinzadatabase.yy2byr4.mongodb.net/?retryWrites=true&w=majority")) {
            MongoDatabase db = client.getDatabase("project");
            MongoCollection collection = db.getCollection("candy");
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
        try ( MongoClient client = MongoClients.create("mongodb+srv://pinza:153@pinzadatabase.yy2byr4.mongodb.net/?retryWrites=true&w=majority")) {
            MongoDatabase db = client.getDatabase("project");
            MongoCollection collection = db.getCollection("candy");
            System.out.println("Enter the ID of the Candy you want to Update:");
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
                case 1:
                    System.out.println("Enter the new id: ");
                    int newId = scan.nextInt();
                    Bson updateId = Updates.set("id", newId);
                    collection.updateOne(filter, updateId);
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("Enter the new name: ");
                    String newName = scan.nextLine();
                    Bson updateName = Updates.set("name", newName);
                    collection.updateOne(filter, updateName);
                    break;
                case 3:
                    System.out.println("Enter the new quantity: ");
                    int newQuantity = scan.nextInt();
                    Bson updateQuantity = Updates.set("quantity", newQuantity);
                    collection.updateOne(filter, updateQuantity);
                    break;
                case 4:
                    System.out.println("Enter the new pricePerUnit: ");
                    float newPricePerUnit = scan.nextFloat();
                    Bson updatePricePerUnit = Updates.set("pricePerUnit", newPricePerUnit);
                    collection.updateOne(filter, updatePricePerUnit);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.exit(0);
                    break;
            }

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect:" + me);
        }
    }

    @Override
    public void deleteProduct() {
        try ( MongoClient client = MongoClients.create("mongodb+srv://pinza:153@pinzadatabase.yy2byr4.mongodb.net/?retryWrites=true&w=majority")) {
            MongoDatabase db = client.getDatabase("project");
            MongoCollection collection = db.getCollection("candy");
            System.out.println("Enter the ID of the Candy you want to DELETE!:");
            int id = scan.nextInt();
            Bson filter = Filters.eq("id", id);
            collection.deleteOne(filter);

        } catch (MongoException me) {
            System.err.println("An error occurred while attempting to connect:" + me);
        }

    }

}
