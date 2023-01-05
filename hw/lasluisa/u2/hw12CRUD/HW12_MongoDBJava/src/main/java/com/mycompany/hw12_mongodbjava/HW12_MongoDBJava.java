package com.mycompany.hw12_mongodbjava;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.FashionStore.controller.Controller;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class HW12_MongoDBJava {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        boolean exit = false;

        String uri = "mongodb+srv://elasluisa:1234567890@cluster0.iofgjxa.mongodb.net/test";
        
        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("FashionStore");
            try {
                //Connect with server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                while (!exit) {

                    System.out.println("======================");
                    System.out.println(" Fashion Store");
                    System.out.println("======================");
                    System.out.println(" Orders");
                    System.out.println(" 1. Add a new Order");
                    System.out.println(" 2. History of Orders");
                    System.out.println(" 3. Print an order");
                    System.out.println(" 4. Modify an order");
                    System.out.println(" 5. Delete an order");
                    System.out.println(" 6. Move information to other collection");
                    System.out.println(" 7. Exit");
                    System.out.println("======================");

                    try {
                        System.out.print("Enter an option: ");
                        option = sc.nextInt();

                        switch (option) {
                            case 1 -> {
                                Controller.insertDocumentMongo(database);
                            }
                            case 2 -> {
                                Controller.readAllMongo(database);
                            }
                            case 3 -> {
                                Controller.readMongo(database);
                            }
                            case 4 -> {
                                Controller.updateMongo(database);
                            }
                            case 5 -> {
                                Controller.deleteMongo(database);
                            }
                            case 6 -> {
                                Controller.insertInAOtherCollection(database);                            
                            }
                            case 7 ->
                                exit = true;

                            default ->
                                System.out.println("Option invalid ");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Data type entered wasn't the expected");
                        sc.next();
                    }
                }

                //to print some documents, I must use a loop: for, for each, while
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
}
