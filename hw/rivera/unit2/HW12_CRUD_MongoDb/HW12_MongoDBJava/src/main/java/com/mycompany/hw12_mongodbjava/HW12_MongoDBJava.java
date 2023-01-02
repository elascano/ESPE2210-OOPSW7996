package com.mycompany.hw12_mongodbjava;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.ExtraordinaryPayment.controller.Controller;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class HW12_MongoDBJava {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        boolean exit = false;

        String uri = "mongodb+srv://WebMasterTeam:1234@cluster0.zxu5lqj.mongodb.net/?retryWrites=true&w=majority";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("UrbanizationTreasurySystem");
            try {
                //Connect with server
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                while (!exit) {

                    System.out.println("======================");
                    System.out.println(" Joel's Company");
                    System.out.println("======================");
                    System.out.println(" Extraordinary Payment System");
                    System.out.println(" 1. Add a new Resident");
                    System.out.println(" 2. History of payments");
                    System.out.println(" 3. Print a Bill");
                    System.out.println(" 4. Modify a Resident payment");
                    System.out.println(" 5. Delete a Payment");
                    System.out.println(" 6. Move information an other collection");
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
                        System.out.println("You need to enter a number");
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
