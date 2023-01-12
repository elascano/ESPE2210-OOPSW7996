package ec.edu.espe.VehicleRegistration.view;

import ec.edu.espe.VehicleRegistration.controller.FileManager;
import static ec.edu.espe.VehicleRegistration.controller.FileManager.read;
import ec.edu.espe.VehicleRegistration.model.Vehicle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class VehicleRegistration {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;
        ArrayList<Vehicle> vehicleslist = new ArrayList<>();
        String fileName = "VehicleList.json";
        while (!exit) {
            menu();
            try {

                System.out.println("Write one of the options");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        vehicleslist = read(vehicleslist, "VehicleList.json");
                        FileManager.addvehicle(vehicleslist, scan, fileName);
                        break;
                    case 2:
                        FileManager.readVehicles(vehicleslist);
                        break;
                    case 3:
                        FileManager.findvehicle(vehicleslist, scan);
                        break;
                    case 4:
                        FileManager.update(vehicleslist, scan);

                        break;
                    case 5:
                    deletevehicle(scan, vehicleslist);
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("ERROR!!invalid option");
                }
            } catch (InputMismatchException e) {
                System.out.println("only numbers");
                scan.next();
            }
        }
    }

    private static void deletevehicle(Scanner scan, ArrayList<Vehicle> vehicleslist) {
        int option=0;
        do {
            System.out.println("===============================");
            System.out.println("             DELETE VEHICLE      ");
            System.out.println("===============================");
            System.out.println("1.Delete one vehicle ");
            System.out.println("2.Delete all vehicles");
            System.out.println("3.Return");
            
            try {
                System.out.println("Digit an option: ");
                option = scan.nextInt();
                switch (option) {
                    case 1:
                        FileManager.deleteVehicle(vehicleslist, scan);
                        break;
                        
                    case 2:
                        FileManager.deletAllJson();
                        vehicleslist.clear();
                        break;
                        
                    case 3:
                        break;
                    default:
                        System.out.println("Nonexistent option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect DataType!!");
                scan.next();
            }
        } while (option != 3);
    }

    private static void menu() {
        System.out.println("================================");
        System.out.println("        VEHICLE REGISTRATION");
        System.out.println("===============================");
        System.out.println("1. Add vehicle");
        System.out.println("2. Read vehicles");
        System.out.println("3. Find vehicle");
        System.out.println("4. Update vehicle");
        System.out.println("5. Delete vehicle");
        System.out.println("6. Exit");
    }
}
