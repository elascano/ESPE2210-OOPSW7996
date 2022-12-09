
package ec.edu.espe.TruckSimulator.view;

import ec.edu.espe.TruckSimulator.model.Truck;
import java.util.ArrayList;
import java.util.Scanner;
import static ec.edu.espe.TruckSimulator.controller.FileManager.*;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class TruckSimulator {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int option;
        Scanner scan = new Scanner(System.in);
        ArrayList<Truck> trucksData = new ArrayList<>();
        int id;

        do {
            trucksData = read(trucksData, "TrucksFile.json");

            System.out.println("\n==============================================\n");
            System.out.println("           Welcome to the TruckSimulator          ");
            System.out.println("\n==============================================");
            System.out.println("\t\t1.Create new Truck             ");
            System.out.println("\t\t2.Find a Truck                 ");
            System.out.println("\t\t3.Delete a Truck               ");
            System.out.println("\t\t4.Update a Truck               ");
            System.out.println("\t\t5.Print List of Trucks        ");
            System.out.println("\t\t6.Exit                       ");
            System.out.println("================================================");
            System.out.println("Select an option:");
            option = scan.nextInt();

            switch (option) {
                case 1 -> {
                    addTruck(trucksData);
                    save(trucksData, "TrucksFile.json");
                    System.out.println("\nCOOL! You have added a new Truck\n");
                }

                case 2 -> {

                    System.out.println("====Insert the id of the Truck==== ");
                    id = scan.nextInt();
                    int truckOfFIle = find(trucksData, id, "TrucksFile.json");
                    if (truckOfFIle != -1) {
                        System.out.println("\nID\t\tCOLOR\t\tBRAND");
                        printLine(trucksData.get(truckOfFIle));
                    } else {
                        System.err.println("====THE ID DOES NOT EXIST=====");
                    }
                }

                case 3 -> {

                    System.out.println("====Insert the id of the Truck====");
                    id = scan.nextInt();

                    int truckOfFile = find(trucksData, id, "BusesFile.json");
                    delete(trucksData, truckOfFile);
                    save(trucksData, "TrucksFile.json");

                }

                case 4 -> {

                    System.out.println("====Insert the id of the Truck====");
                    id = scan.nextInt();

                    int truckOfFIle = find(trucksData, id, "TrucksFile.json");
                    update(trucksData, truckOfFIle);
                    save(trucksData, "TrucksFile.json");

                }

                case 5 -> {
                    System.out.println("\nID\t\tCOLOR\t\tBRAND");
                    printList(trucksData);
                }

                case 6 -> {
                    System.out.println("=======SEE YOU LATER :D======");
                }

                default -> {
                    System.out.println("====OPTION INVALID=====");
                    System.out.println("=======TRY AGAIN=======");

                }
            }
        } while (option != 6);
    }

}
