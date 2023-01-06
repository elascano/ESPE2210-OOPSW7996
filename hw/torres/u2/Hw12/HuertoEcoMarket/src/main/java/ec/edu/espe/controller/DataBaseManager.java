/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.model.Product;
import java.util.Iterator;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import ec.edu.espe.model.Offer;


/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class DataBaseManager {
    
     public static void addProduct(Product product, MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        String name;
        int amount;
        float price;
        try {
            System.out.print("Enter the name of product: ");
            name = sc.nextLine();
            product.setName(name);
            System.out.print("Enter the amount of " + name+ " : ");
            amount = sc.nextInt();
            product.setAmount(amount);
            System.out.print("Enter the price for unit of " + name+ " : ");
            price = sc.nextFloat();
            product.setPrice(price);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Data not saved");
        }
        try {
            InsertOneResult result = collection.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("name", product.getName())
                    .append("amount", product.getAmount())
                    .append("price", product.getPrice()));

            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }

    }

    public static void findProduct(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        String nameFind = "";
        try {
            System.out.print("Enter name to find: ");
            nameFind = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e +"please try again");
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "amount", "price"),
                Projections.excludeId());
        Document courseFind = (Document) collection.find(eq("name", nameFind))
                .projection(projectionFields)
                .first();
        if (courseFind == null) {
            System.out.println("No results found.");
        } else {
            System.out.println(courseFind.toJson());
        }
    }

    public static void updateProduct(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int optionFind = 0;
        String nameToUpdate = "";
        try {
            System.out.print("Enter the name of product to update: ");
            nameToUpdate = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "amount", "price"),
                Projections.excludeId());
        Document doc = (Document) collection.find(eq("name", nameToUpdate))
                .projection(projectionFields)
                .first();
        if (doc == null) {
            System.out.println("Not found.");
        } else {
            Document product = new Document().append("name", nameToUpdate);

            while (optionFind != 4) {

                System.out.println("1. To Correct Name");
                System.out.println("2. Change amount");
                System.out.println("3. Change price");
                System.out.println("4. Go out");

                System.out.print("Choose an option: ");
                try {
                    optionFind = sc.nextInt();
                } catch (Exception e) {
                    optionFind = 0;
                }
                sc.nextLine();
                switch (optionFind) {
                    case 1 -> {
                        String newName;

                        System.out.print("Enter the correct name: ");
                        newName = sc.nextLine();

                        Bson updates = Updates.combine(Updates.set("name", newName));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(product, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 2 -> {
                        int newAmount;

                        System.out.print("type the new amount: ");
                        newAmount = sc.nextInt();

                        Bson updates = Updates.combine(Updates.set("amount", newAmount));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(product, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 3 -> {
                        double newPrice;

                        System.out.print("Enter the new Price: ");
                        newPrice = sc.nextDouble();

                        Bson updates = Updates.combine(Updates.set("price", newPrice));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(product, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 4 -> {

                    }
                    default ->
                        System.out.println("Error: Invalid option try again.");

                }
            }
        }
    }

    public static void deleteProduct(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        String productDelete = "";
        try {
            System.out.print("Enter product to delete: ");
            productDelete = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "amount", "price"),
                Projections.excludeId());
        Document doc = (Document) collection.find(eq("name", productDelete))
                .projection(projectionFields)
                .first();
        if (doc == null) {
            System.out.println("No results found.");
        } else {
            Bson courseDelete = eq("nrc", productDelete);
            try {
                DeleteResult result = collection.deleteOne(courseDelete);
                System.out.println("Deleted document: " + result.getDeletedCount());
            } catch (MongoException me) {
                System.err.println("Unable to delete due to an error: " + me);
            }
        }
    }

    public static void printProducts(MongoCollection collection) {
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void SaleWithOffer(){
        
        double discount = 0;
        int amountSold;
        double priceTotal = 0;
        double priceWithOffer = 0;
        double price;
        String nameProductSale;
        Scanner sc = new Scanner(System.in);


        String uri = "mongodb+srv://OOP:OOP@clusteroop.htwlkgc.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("HuertoEcoMarket");
            try {

                System.out.println("Connected successfully to DataBase");
                MongoCollection<Document> productsCollection = database.getCollection("Products");
                MongoCollection<Document> saleWithOfferCollection = database.getCollection("SalesWithDiscount");

                Offer offer = new Offer("0",0,0,0,0);
                
                System.out.print("Enter the name of the product sold: ");
                nameProductSale = sc.next();

                System.out.print("Enter the amount sold: ");
                amountSold = sc.nextInt();

                Bson filter = Filters.eq("name", nameProductSale);
                Document doc = productsCollection.find(Filters.and(filter)).first();

                price = doc.getDouble("price");
                priceTotal = price*amountSold;
                if (amountSold>10){
                    discount = priceTotal*0.10;
                    priceWithOffer = priceTotal - discount;
                }
                
                offer.setName(nameProductSale);
                offer.setAmountSale(amountSold);
                offer.setDiscount(discount);
                offer.setPriceTotal(priceTotal);
                
                

                if (saleWithOfferCollection.find(filter).first() == null) {
                    Document saleProduct = new Document("_id", new ObjectId())
                            .append("name", doc.get("name of Product"))
                            .append("amount sold", offer.getAmountSale())
                            .append("price", doc.getDouble("price"))
                            .append("discount", discount)
                            .append("price Total with discount", priceWithOffer);

                    saleWithOfferCollection.insertOne(saleProduct);
                    System.out.println("The sale has been registered");

                } else if (saleWithOfferCollection.find(filter).first() != null) {

                    Bson updateAmount = Updates.inc("amount sold", + amountSold);
                    saleWithOfferCollection.updateOne(filter, updateAmount);
                    System.out.println("The sale has been registered");

                }

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    
    }
    
}
