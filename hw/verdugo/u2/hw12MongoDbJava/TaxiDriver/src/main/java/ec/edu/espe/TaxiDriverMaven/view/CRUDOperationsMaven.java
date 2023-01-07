
package ec.edu.espe.TaxiDriverMaven.view;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.TaxiDriverMaven.controller.FileManager;
import ec.edu.espe.TaxiDriverMaven.controller.DataBaseManager;
import ec.edu.espe.TaxiDriverMaven.model.Salary;
import ec.edu.espe.TaxiDriverMaven.model.TaxiDriver;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.bson.BsonDocument;
import org.bson.BsonInt64;
import org.bson.Document;
import org.bson.conversions.Bson;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class CRUDOperationsMaven {

    public static void main(String[] args) {
        
        String uri = "mongodb+srv://verdugong:espe123@taxidriversscheduling.ngazs9a.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("TaxiDriversScheduling");
            try {
                Bson command = new BsonDocument("ping", new BsonInt64(1));
                Document commandResult = database.runCommand(command);
                System.out.println("Connected successfully to server.");

                ArrayList<TaxiDriver> taxiDrivers = new ArrayList<>();
                TaxiDriver taxiDriver = new TaxiDriver();
                Scanner scan = new Scanner(System.in);
                int position[] = new int[1];
                boolean exit = false;
                int option;
                position[0] = 0;
                taxiDrivers = DataBaseManager.loadFileDatabase(taxiDrivers, database); 
                position[0] = taxiDrivers.size();

                while (!exit) {
                    System.out.println("");
                    System.out.println("                SEBASTIAN VERDUGO                ");
                    System.out.println("          Menu Options 'CRUD' operations         ");
                    System.out.println("1)Create a Taxi Driver");
                    System.out.println("2)Read a Taxi Driver");
                    System.out.println("3)Update a Taxi Driver");
                    System.out.println("4)Delete a Taxi Driver");
                    System.out.println("5)Create a Taxi Driver's Salary");
                    System.out.println("6)EXIT");
                    try {
                        System.out.println("Enter an option: ");
                        option = scan.nextInt();
                        System.out.println("");
                        switch (option) {
                            case 1:
                                DataBaseManager.enterTaxiDriver(taxiDrivers, taxiDriver, position);
                                FileManager.addTaxiDriversToJson(taxiDrivers);
                                DataBaseManager.createFile(taxiDrivers.get(position[0]), database);
                                position[0]++;
                                break;
                            case 2:
                                DataBaseManager.readFileDataBase(database);
                                break;
                            case 3:
                                DataBaseManager.updateFile(database); 
                                break;
                            case 4:
                                DataBaseManager.deleteFile(database); 
                                break;
                            case 5:
                                Salary.createProfitsFile(database);
                                break;
                            case 6:
                                FileManager.addTaxiDriversToJson(taxiDrivers);
                                taxiDrivers = DataBaseManager.loadFileDatabase(taxiDrivers, database);
                                System.out.println("You exit was success");
                                exit = true;
                                break;
                            default:
                                System.out.println("Nonexistent option");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Incorrect dataType");
                        System.out.println("Maybe you need to use comma ',' to separate decimals in the profits");
                    }
                }
            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }

        }
    }

}
