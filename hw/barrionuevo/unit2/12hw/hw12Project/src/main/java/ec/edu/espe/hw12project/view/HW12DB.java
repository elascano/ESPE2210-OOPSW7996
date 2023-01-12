
package ec.edu.espe.hw12project.view;

import ec.edu.espe.hw12project.model.Service;
import java.util.Scanner;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.hw12project.controller.DBManager;



/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class HW12DB {
    public static void main(String[] args) {
        String uri = "mongodb+srv://domlin:1234@domlin7.gs5if9g.mongodb.net/?retryWrites=true&w=majority";
        Scanner sc = new Scanner(System.in);
        Service service= new Service();
        int option = 0;

        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("HW12DB");
            try {
                System.out.println("Connected successfully to server.");

                MongoCollection collectionService = database.getCollection("Service");
                MongoCollection collectionServiceGrade = database.getCollection("ServiceGrade");

                while (option != 7) {
                    System.out.println("-----------------HOMEWORK 12-----------------");
                    System.out.println("\nService of Client Simulator");
                    System.out.println("Lindsay Barrionuevo - DeltaTeam");
                    System.out.println("\n   MENU");
                    System.out.println("1. Add a rating to our Service!");
                    System.out.println("2. Show all ratings");
                    System.out.println("3. Delete a rating");
                    System.out.println("4. Find you rating to our Service");
                    System.out.println("5. Modify the rating of Service");
                    System.out.println("6. Calculate the total customer satisfaction");
                    System.out.println("7. Leave the program");

                    System.out.print("Please choose an option: ");
                    try {
                        option = sc.nextInt();
                    } catch (Exception e) {
                        option = 0;
                    }
                    sc.nextLine();

                    switch (option) {
                        case 1 -> {
                            DBManager.addRatingService(service, collectionService);
                        }

                        case 2 -> {
                            DBManager.printRatingService(collectionService);

                        }

                        case 3 -> {
                            DBManager.printRatingService(collectionService);
                            DBManager.deleteRatingService(collectionService);

                        }

                        case 4 -> {

                            DBManager.findRatingService(collectionService);
                        }

                        case 5 -> {
                            DBManager.printRatingService(collectionService);
                            DBManager.modifyRatingService(collectionService);

                        }

                        case 6 -> {
                            DBManager.calculate(collectionService, collectionServiceGrade);


                        }

                        case 7 ->
                            System.out.println("Thank you for helping us improve!");

                        default ->
                            System.out.println("Error: Invalid option try again.");
                    }

                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
}
