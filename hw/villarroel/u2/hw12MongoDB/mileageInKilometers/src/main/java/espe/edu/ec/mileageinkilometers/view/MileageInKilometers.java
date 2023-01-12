package espe.edu.ec.mileageinkilometers.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import espe.edu.ec.mileageinkilometers.controller.MileageController;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.conversions.Bson;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class MileageInKilometers {

    
        private static final Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {

        int option;
        boolean exit = false;

        String uri = "mongodb+srv://JoshSy01:060903@cluster0.2sziitx.mongodb.net/test";

        try ( MongoClient mongoClient = MongoClients.create(uri)) {

            MongoDatabase database = mongoClient.getDatabase("TaxiDriver");
            try {
                //Bson command = new BsonDocument("ping", new BsonInt64(1));
                //org.bson.Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                while (!exit) {

                    System.out.println("**********************************************");
                    System.out.println("  Justin Villarroel  //  OOP");
                    System.out.println("**********************************************");
                    System.out.println("                     MILEAGE                  ");
                    System.out.println(" 1. Add a new Mileage record");
                    System.out.println(" 2. History of Mileage");
                    System.out.println(" 3. Print a Mileage record");
                    System.out.println(" 4. Modify a Mileage record");
                    System.out.println(" 5. Delete a Mileage record");
                    System.out.println(" 6. Move information to other collection");
                    System.out.println(" 7. Exit");
                    System.out.println("**********************************************");

                    try {
                        System.out.print("Enter an option: ");
                        option = sc.nextInt();

                        switch (option) {
                            case 1 -> {
                                MileageController.insertDocumentMongo(database);
                            }
                            case 2 -> {
                                MileageController.readAllMongo(database);
                            }
                            case 3 -> {
                                MileageController.readMongo(database);
                            }
                            case 4 -> {
                                MileageController.updateMongo(database);
                            }
                            case 5 -> {
                                MileageController.deleteMongo(database);
                            }
                            case 6 -> {
                                MileageController.insertInAOtherCollection(database);                            
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
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
 }


