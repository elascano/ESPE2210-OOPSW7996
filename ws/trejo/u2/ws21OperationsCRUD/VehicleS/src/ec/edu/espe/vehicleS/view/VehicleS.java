package ec.edu.espe.vehicleS.view;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.vehicle.model.Vehicle;

import ec.edu.espe.vehicle.controller.FileManager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class VehicleS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicle = new ArrayList<>();
        int incomingVehicleRegistration = 0;
        Boolean exit = false;
        int option = 0;

        while (!exit) {
            FileManager.header(incomingVehicleRegistration);
            try {
                System.out.println("Enter the option:");
                option = scanner.nextInt();

                switch (option) {
                    case 1: {

                        int followAction = 1;
                        while (followAction == 1) {

                            ArrayList<Vehicle> vehicleRead = new ArrayList<>();

                            vehicleRead = FileManager.readJSONVehicle(vehicleRead);

                            incomingVehicleRegistration = vehicleRead.size();

                            FileManager.saveVehicle(incomingVehicleRegistration, vehicleRead);

                            followAction = FileManager.registerMoreVehicle(scanner);

                            incomingVehicleRegistration++;

                        }

                    }

                    break;
                    case 2: {
                        int numberOfVehicle;
                        ArrayList<Vehicle> vehicleRead = new ArrayList<>();

                        vehicleRead = FileManager.readJSONVehicle(vehicleRead);

                        numberOfVehicle = vehicleRead.size();

                        if (numberOfVehicle != 0) {

                            FileManager.printAllListOfVehicle(vehicleRead);

                        } else {
                            System.out.println("No vehicle have been registered yet");

                        }

                    }
                    break;
                    case 3: {

                        int confirmation = 1;

                        int search = 2;
                        int answer;
                        int newId;

                        String newName;
                        String newColor;
                        int numberOfVehicle;
                        ArrayList<Vehicle> vehicleRead = new ArrayList<>();

                        vehicleRead = FileManager.readJSONVehicle(vehicleRead);

                        numberOfVehicle = vehicleRead.size();

                        if (numberOfVehicle != 0) {
                            while (confirmation == 1) {
                                FileManager.printList(numberOfVehicle, vehicleRead);

                                System.out.print("Enter the number of the vehicle you wish to modify:\t");
                                search = scanner.nextInt();

                                search = FileManager.compareQuantityInVehicle(search, vehicleRead, scanner);

                                confirmation = FileManager.updateVehicle(search, scanner, vehicleRead, confirmation);

                            }

                        } else {
                            System.out.println("No vehicle have been registered yet");
                        }

                    }
                    break;
                    case 4: {

                        ArrayList<Vehicle> vehicleRead = new ArrayList<>();

                        vehicleRead = FileManager.readJSONVehicle(vehicleRead);
                        FileManager.deleteVehicle(vehicleRead);
                    }
                    break;
                    case 5:
                        exit = true;
                    default:
                        System.out.println("The options are from 1 to 4");
                }

            } catch (InputMismatchException e) {
                System.out.println("You only have to enter numbers");
                System.out.println("==================================");
                scanner.nextLine();

            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        }
        System.out.println("_______End of menu_________");

    }

    

}
