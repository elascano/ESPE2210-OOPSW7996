package ec.edu.espe.VehicleRegistration.view;

import ec.edu.espe.VehicleRegistration.controller.FileManager;
import ec.edu.espe.VehicleRegistration.model.Vehicle;
import ec.edu.espe.VehicleRegistration.utils.EnterIdException;
import ec.edu.espe.VehicleRegistration.utils.OptionInvalidException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class VehicleRegistration {

    public static void main(String[] args) throws EnterIdException, IOException {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;
        while (!exit) {
            boolean reenter;
            Vehicle vehicle = new Vehicle();
            ArrayList<Vehicle> vehicles = new ArrayList<>();
            String fileName = "VehicleList.json";

            try {
                reenter = false;
                System.out.println("");
                System.out.println("================================");
                System.out.println("        VEHICLE REGISTRATION");
                System.out.println("===============================");
                System.out.println("1. Add vehicle");
                System.out.println("2. Print vehicles.json");
                System.out.println("3. Exit");

                System.out.println("Write one of the options");
                option = scan.nextInt();

                switch (option) {
                    case 1:
                        FileManager.addvehicle(scan, vehicle, vehicles, fileName);
                        FileManager.readVehicles(vehicles);
                        break;
                    case 2:
                        FileManager.readjson();
                        break;
                    case 3:

                        exit = true;
                        break;
                    default:
                        System.out.println("ERROR!!invalid option");
                }
                if (option < 1 || option > 3) {
                    throw new OptionInvalidException();
                }
            } catch (OptionInvalidException e) {
                System.out.println(e.getMessage());
                reenter = true;
            }
        }
    }}

   
   
