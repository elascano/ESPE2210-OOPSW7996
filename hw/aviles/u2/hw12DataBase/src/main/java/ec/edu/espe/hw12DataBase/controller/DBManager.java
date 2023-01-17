package ec.edu.espe.hw12DataBase.controller;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.hw12DataBase.model.Food;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.BasicDBObject;
import ec.edu.espe.hw12DataBase.model.Order;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class DBManager {
    
    public static int chooseOption(int option) {
        Scanner readOption = new Scanner(System.in);
        boolean posibleToContinue;
        do {
            try {
                posibleToContinue = false;
                System.out.println("Choose an option: ");
                option = readOption.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Error, please introduce a real number");
                readOption.next();
                posibleToContinue = true;
            }
        } while (posibleToContinue);
        return (option);
    }
    
    
    public static void findData (){
        boolean posibleToContinue;
        Scanner read = new Scanner(System.in);
        Double price = 0.00;
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                
                
                do {
                    try {
                        posibleToContinue = false;
                        System.out.println("Enter the price of the food");
                        price = read.nextDouble();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, please introduce a number");
                        read.next();
                        posibleToContinue = true;
                    }
                } while (posibleToContinue);

                
                MongoCollection collection = database.getCollection("Food");
                Bson filter = Filters.and(Filters.in("price", price));
                MongoCursor<Document> cursor = collection.find(filter).iterator();

                System.out.println("---> " + collection.find(filter).iterator());
 
                try {
                    while (cursor.hasNext()) {
                        System.out.println(cursor.next().toJson());
                    }
                } finally {
                    cursor.close();
                }
 
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
 
        }
    }
    
    public static void createData (){
        Food food;
        boolean posibleToContinue;
        Scanner read = new Scanner(System.in);
        int id = 0;
        String name;
        Double price = 0.00;
        
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> collection = database.getCollection("Food");
                
                do {
                    try {
                        posibleToContinue = false;
                        System.out.println("Enter the id of the food");
                        id = read.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, please introduce a real number");
                        read.next();
                        posibleToContinue = true;
                    }
                } while (posibleToContinue);
                
                
                
                System.out.println("Enter the name of the food");
                name = read.next();
                
                
                do {
                    try {
                        posibleToContinue = false;
                        System.out.println("Enter the price of the food");
                        price = read.nextDouble();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, please introduce a number");
                        read.next();
                        posibleToContinue = true;
                    }
                } while (posibleToContinue);
                
                food = new Food(id, name, price);

                System.out.println("" + food);


                Document newFood = new Document("id",id);
                newFood.append("name",name);
                newFood.append("price", price);
                collection.insertOne(newFood);
                
                
 
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
 
        }
    }
    
    public static void updateData (){
        
        int option = 0;
        int idToFind = 0;
        
        boolean posibleToContinue;
        int id = 0;
        String name = null;
        double price = 0;
        Scanner read = new Scanner(System.in);
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
 
                MongoCollection<Document> collection = database.getCollection("Food");
                Bson filter = Filters.and(Filters.gt("id", 0));
                MongoCursor<Document> cursor = collection.find(filter).iterator();
 
                System.out.println("---> " + collection.find(filter).iterator());
 
                try {
                    while (cursor.hasNext()) {
                        System.out.println(cursor.next().toJson());
                    }
                } finally {
                    cursor.close();
                }
                
                do {
                    try {
                        posibleToContinue = false;
                        System.out.println("Enter the id of the food that you want to update");
                        idToFind = read.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, please introduce a real number");
                        read.next();
                        posibleToContinue = true;
                    }
                } while (posibleToContinue);
                
                
                
                
                do {
                    System.out.println("==============================");
                    System.out.println("What do you want to update: ");
                    System.out.println("1. Id");
                    System.out.println("2. Name");
                    System.out.println("3. Price");
                    System.out.println("4. Exit");
                    System.out.println("==============================");
                    do {
                        try {
                            posibleToContinue = false;
                            System.out.println("Choose an option: ");
                            option = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("==================================\n");
                            System.out.println("Error, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);
                    System.out.println("\n==================================\n");
                    switch (option) {
                        case 1:
                            do {
                                try {
                                    posibleToContinue = false;
                                    System.out.println("Enter new Id: ");
                                    id = read.nextInt();
                                } catch (InputMismatchException ex) {
                                    System.out.println("==================================\n");
                                    System.out.println("Error, please introduce a real number");
                                    read.next();
                                    posibleToContinue = true;
                                }
                            } while (posibleToContinue);
                            collection.updateOne(new Document("id",idToFind),new Document("$set",new Document("id",id)));
                            idToFind=id;
                            System.out.println("Food updated");
                            break;
                        case 2:
                            System.out.println("Enter new name: ");
                            name = read.next();
                            collection.updateOne(new Document("id",idToFind),new Document("$set",new Document("name",name)));
                            System.out.println("Food updated");
                            break;
                        case 3:
                            do {
                                try {
                                    posibleToContinue = false;
                                    System.out.println("Enter new price: ");
                                    price = read.nextDouble();
                                } catch (InputMismatchException ex) {
                                    System.out.println("==================================\n");
                                    System.out.println("Error, please introduce a number.");
                                    read.next();
                                    posibleToContinue = true;
                                }
                            } while (posibleToContinue);
                            collection.updateOne(new Document("id", idToFind), new Document("$set", new Document("price", price)));
                            System.out.println("Food updated");
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("==================================\n");
                            System.out.println("Invalid Option");
                            break;
                    }
                } while (option != 4);
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
 
        }
    }
    
    public static void deleteData (){
        boolean posibleToContinue;
        int id = 0;
        Scanner read = new Scanner(System.in);
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
 
                MongoCollection<Document> collection = database.getCollection("Food");
                Bson filter = Filters.and(Filters.gt("id", 0));
                MongoCursor<Document> cursor = collection.find(filter).iterator();
 
                System.out.println("---> " + collection.find(filter).iterator());
 
                try {
                    while (cursor.hasNext()) {
                        System.out.println(cursor.next().toJson());
                    }
                } finally {
                    cursor.close();
                }
                
                do {
                    try {
                        posibleToContinue = false;
                        System.out.println("Enter the if of the food that you want to eliminate");
                        id = read.nextInt();
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, please introduce a real number");
                        read.next();
                        posibleToContinue = true;
                    }
                } while (posibleToContinue);
                
                collection.deleteOne(Filters.eq("id",id));
                System.out.println("Food eliminated");
                
 
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
 
        }
    }
    
    
    public static double CalculateOrder (){
        
        int idToFind = 0;
        int id = 0;
        
        Food food;
        food = new Food(0,null,0);
        
        boolean posibleToContinue;
        double totalPrice = 0;
        Scanner read = new Scanner(System.in);
        
        
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
 
                MongoCollection<Document> collection = database.getCollection("Food");
                Bson filter = Filters.and(Filters.gt("id", 0));
                MongoCursor<Document> cursor = collection.find(filter).iterator();
 
                System.out.println("---> " + collection.find(filter).iterator());
 
                try {
                    while (cursor.hasNext()) {
                        System.out.println(cursor.next().toJson());
                    }
                } finally {
                    cursor.close();
                }
                
                
                
                System.out.println("Enter dde id of the food you want in your order.");
                System.out.println("Enter 0 if you want to generate a order");
                totalPrice = 0;
                do {
                    do {
                        try {
                            posibleToContinue = false;
                            idToFind = read.nextInt();
                        } catch (InputMismatchException ex) {
                            System.out.println("Error, please introduce a real number");
                            read.next();
                            posibleToContinue = true;
                        }
                    } while (posibleToContinue);

                    if (idToFind != 0) {
                        id = idToFind;
                        Document newFood = new Document("id", id);
                        filter = Filters.and(Filters.in("id", id));
                        newFood = collection.find(filter).first();
                        totalPrice = newFood.getDouble("price") + totalPrice;
                        System.out.println("Food added\n");
                    }

                    
                    
                } while (idToFind != 0);
                System.out.println("The total price is: "+totalPrice);
                System.out.println("Order generated");
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
            
        }
        return (totalPrice);
    }
    
    public static void createOrder (double totalPrice){
        Order order;
        boolean posibleToContinue;
        Scanner read = new Scanner(System.in);
        long collectionSize;
        int id;
        
        String uri = "mongodb+srv://oop:oop@cluster0.f4j9tfw.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Project");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");
                MongoCollection<Document> collection = database.getCollection("Order");
                
                collectionSize = collection.countDocuments();
                id = (int) (collectionSize+1);
                
                
                order = new Order(id, totalPrice);

                System.out.println("" + order);


                Document newFood = new Document("id",id);
                newFood.append("totalPrice", totalPrice);
                collection.insertOne(newFood);
                
                
 
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
            System.out.println("Order generated");
        }
    }
    
    
}