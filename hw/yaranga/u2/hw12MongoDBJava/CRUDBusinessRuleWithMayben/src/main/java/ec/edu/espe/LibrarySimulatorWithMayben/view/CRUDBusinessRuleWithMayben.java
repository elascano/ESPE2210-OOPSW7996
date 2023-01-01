package ec.edu.espe.LibrarySimulatorWithMayben.view;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.LibrarySimulatorWithMayben.controller.FileManager;
import ec.edu.espe.LibrarySimulatorWithMayben.controller.DataBaseManager;
import ec.edu.espe.LibrarySimulatorWithMayben.model.Travel;
import ec.edu.espe.LibrarySimulatorWithMayben.model.Traveler;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class CRUDBusinessRuleWithMayben {

    public static void main(String[] args) {

        String uri = "mongodb+srv://lyaranga:tortilla@espe2210-oopsw7996.77wv341.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AirportTaxiScheduling");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                ArrayList<Travel> travels = new ArrayList<Travel>();
                Travel travel = new Travel();
                Scanner scan = new Scanner(System.in);
                int position[] = new int[1];
                boolean exit = false;
                int option;
                position[0] = 0;
                travels = DataBaseManager.loadFromDatabase(travels, database); 
                position[0] = travels.size();

                while (!exit) {
                    System.out.println("");
                    System.out.println("====================");
                    System.out.println("Leonardo Yaranga");
                    System.out.println("hw12");
                    System.out.println("==========Menu==========");
                    System.out.println("1.Add a travel");
                    System.out.println("2.Show all travels");
                    System.out.println("3.Update a travel");
                    System.out.println("4.Delete a travel");
                    System.out.println("5.Create Traveler Payments");
                    System.out.println("6.Save and exit");
                    try {
                        System.out.println("Enter an option number");
                        option = scan.nextInt();
                        System.out.println("");
                        switch (option) {
                            case 1:
                                addTravel(travels, travel, position);
                                FileManager.addTravelsToJson(travels);
                                DataBaseManager.createOperation(travels.get(position[0]), database);
                                position[0]++;
                                break;
                            case 2:
                                DataBaseManager.readToDataBase(database); 
                                break;
                            case 3:
                                DataBaseManager.updateOperation(database); 
                                break;
                            case 4:
                                DataBaseManager.deleteOperation(database); 
                                break;
                            case 5:
                                Traveler.createPayments(database);
                                break;
                            case 6:
                                FileManager.addTravelsToJson(travels);
                                travels = DataBaseManager.loadFromDatabase(travels, database);
                                System.out.println("You exit was success");
                                exit = true;
                                break;
                            default:
                                System.out.println("Nonexistent option");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Incorrect dataType");
                        System.out.println("Maybe you need to use comma ',' to separate decimals in the price");
                    }
                }
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

    public static void addTravel(ArrayList<Travel> travels, Travel travel, int position[]) {
        int id;
        String driver;
        String address;
        int year, month,day;
        String dateOfOcurrence;
        Float price;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the Id");
        id = scan.nextInt();
        scan.nextLine();

        System.out.println("Who is the driver");
        driver = scan.nextLine();

        System.out.println("What is the address?");
        address = scan.nextLine();

        System.out.println("What is the date on which the trip occurs?");
        System.out.print("year->");
        year = scan.nextInt();
        scan.nextLine();
        System.out.print("month->");
        month = scan.nextInt();
        scan.nextLine();
        System.out.print("day->");
        day = scan.nextInt();
        scan.nextLine();
        dateOfOcurrence=(year+"/"+month+"/"+day);
        System.out.println("What is the price?");
        price = scan.nextFloat();
        scan.nextLine();
        
        travel = new Travel(id, driver, address,dateOfOcurrence, price);
        travels.add(position[0], travel);

    }

}
