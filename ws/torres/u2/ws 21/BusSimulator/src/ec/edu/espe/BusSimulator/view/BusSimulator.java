
package ec.edu.espe.BusSimulator.view;

import ec.edu.espe.BusSimulator.model.Bus;
import java.util.ArrayList;
import java.util.Scanner;
import static ec.edu.espe.BusSimulator.controller.FileManager.*;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class BusSimulator {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        int option;
        Scanner scan = new Scanner(System.in);
        ArrayList<Bus> busesData = new ArrayList<>();
        int id;

        do {
            busesData = read(busesData, "BusesFile.json");

            System.out.println("\n==============================================\n");
            System.out.println("           Welcome to the BusSimulator          ");
            System.out.println("\n==============================================");
            System.out.println("\t\t1.Create new Bus             ");
            System.out.println("\t\t2.Find a Bus                 ");
            System.out.println("\t\t3.Delete a Bus               ");
            System.out.println("\t\t4.Update a Bus               ");
            System.out.println("\t\t5.Print List of Buses        ");
            System.out.println("\t\t6.Exit                       ");
            System.out.println("================================================");
            System.out.println("Select an option:");
            option = scan.nextInt();

            switch (option) {
                case 1 -> {
                    addBus(busesData);
                    save(busesData, "BusesFile.json");
                    System.out.println("\nCOOL! You have added a new bus\n");
                }

                case 2 -> {

                    System.out.println("====Insert the id of the Bus==== ");
                    id = scan.nextInt();
                    int busOfFIle = find(busesData, id, "BusesFile.json");
                    if (busOfFIle != -1) {
                        System.out.println("\nID\t\tCOLOR\t\tCAPACITY");
                        printLine(busesData.get(busOfFIle));
                    } else {
                        System.err.println("====THE ID DOES NOT EXIST=====");
                    }
                }

                case 3 -> {

                    System.out.println("====Insert the id of the Bus====");
                    id = scan.nextInt();

                    int busOfFile = find(busesData, id, "BusesFile.json");
                    delete(busesData, busOfFile);
                    save(busesData, "BusesFile.json");

                }

                case 4 -> {

                    System.out.println("====Insert the id of the Bus====");
                    id = scan.nextInt();

                    int busOfFIle = find(busesData, id, "BusesFile.json");
                    update(busesData, busOfFIle);
                    save(busesData, "BusesFile.json");

                }

                case 5 -> {
                    System.out.println("\nID\t\tCOLOR\t\tCAPACITY");
                    printList(busesData);
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
