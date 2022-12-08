package ec.edu.espe.vehicle.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.vehicle.model.Vehicle;
import ec.edu.espe.vehicleS.view.VehicleS;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class FileManager {

    private static Scanner scanner = new Scanner(System.in);

    public static int findVehiclePosition(ArrayList<Vehicle> vehicle, String action) {
        int id;
        int vehiclePosition = -1;
        
        printAllListOfVehicle(vehicle);
        do {
            System.out.println("Enter the id of the vehicle you want to " + action);
            id = scanner.nextInt();
            vehiclePosition = searchId(vehicle, id);
        } while (vehiclePosition == -1);
        
        return vehiclePosition;
    }

    public static int searchId(ArrayList<Vehicle> vehicle, int id) {
        boolean validator = true;
        int vehiclePosition = -1;
        for (int i = 0; i < vehicle.size(); i++) {
            if (id == vehicle.get(i).getId()) {
                validator = false;
                vehiclePosition = i;
            }
        }
        if (validator) {
            System.out.println("Id entered does not exist.");
        }
        return vehiclePosition;
    }

    public static void deleteVehicle(ArrayList<Vehicle> vehicle) {
        int option, vehiclePosition;
        String action = "delete";
        vehiclePosition = findVehiclePosition(vehicle, action);

        
        System.out.println("Are you sure you want to delete this vehicle?\n1. YES\n2. NO");
        System.out.println("Choose an option (type 1 or 2)");
        option = scanner.nextInt();
        while (option > 2) {
            System.out.println("Option invalid, Enter an option: ");
            option = scanner.nextInt();
        }
        if (option == 1) {
            vehicle.remove(vehiclePosition);
            System.out.println("Vehicle removed");
            System.out.println("=======================================");
        }
        addJsonVehicle(vehicle);
        //exportJsonFile(vehicle);
    }

    public static void exportJsonFile(ArrayList<Vehicle> vehicle) {
        String json = new Gson().toJson(vehicle);
        try {
            FileWriter vehicleModified = new FileWriter("Vehicle.json");
            vehicleModified.write(json);
            vehicleModified.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static void printVehicleColor(ArrayList<Vehicle> vehicle, int search) {
        System.out.println("Id vehicle:\t\t\t" + vehicle.get(search).getId());
        System.out.println("Name of Driver:\t\t " + vehicle.get(search).getNameOfDriver());
        System.out.println("Color:\t\t\t" + vehicle.get(search).getColor());
        System.out.println("Enter the color to be modified:\t");
    }

    public static void header(int incomingVehicleRegistration) {
        if (incomingVehicleRegistration == 0) {
            System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE       ");
            System.out.println("                       Ws18");

            System.out.println("\t\t\t    Alex Trejo");

            System.out.println("Instructor: Edison Lascano");
            System.out.println("=========================================================");
            System.out.println("¡WELCOME TO THE VEHICLE REGISTRATION SYSTEM  :)!       ");
            System.out.println("______________________________________________________________");
        }

        System.out.println("___________________Menu______________________");
        System.out.println("1)Register vehicle:");
        System.out.println("2)Print all registered vehicles :");
        System.out.println("3)Modify the information of one of the registered vehicles:");
        System.out.println("4)Delete vehicle");
        System.out.println("5)Log out");
    }

    public static void printSelectedVehicle(ArrayList<Vehicle> vehicle, int search) {
        System.out.println("Id vehicle:\t\t\t" + vehicle.get(search).getId());
        System.out.println("Name of Driver:\t\t " + vehicle.get(search).getNameOfDriver());
        System.out.println("Color:\t\t\t" + vehicle.get(search).getColor());
        System.out.println("Enter the new ID:\t");

    }

    public static void printVehicle(ArrayList<Vehicle> vehicle, int search) {
        System.out.println("Id vehicle:\t\t\t" + vehicle.get(search).getId());
        System.out.println("Name of Driver:\t\t " + vehicle.get(search).getNameOfDriver());
        System.out.println("Color:\t\t\t" + vehicle.get(search).getColor());
        System.out.println("Enter the name to be modified:\t");
    }

    public static void printModified(ArrayList<Vehicle> vehicle, int search) {
        System.out.println("-----------Modified Data-----------");
        System.out.println("Id vehicle:\t\t\t" + vehicle.get(search).getId());
        System.out.println("Name of Driver:\t\t " + vehicle.get(search).getNameOfDriver());
        System.out.println("Color:\t\t\t" + vehicle.get(search).getColor());

        System.out.println("-----------Modified Data-----------");
    }

    public static void saveVehicle(int incomingVehicleRegistration, ArrayList<Vehicle> vehicleToBeRegistered) {
        Vehicle enteredVehicle = new Vehicle();

        String name = "";
        int id = 0;
        String color = "";

        System.out.println("__________________Vehicle registration system______________");
        System.out.println("----------------------------Product" + (incomingVehicleRegistration + 1) + "----------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the id of the Vehicle to register:\t\t");
        id = scanner.nextInt();

        System.out.print("Enter the name Of Driver:\t");
        name = scanner.next();

        System.out.print("Enter the color:\t");
        color = scanner.next();

        enteredVehicle.setId(id);
        enteredVehicle.setNameOfDriver(name);
        enteredVehicle.setColor(color);

        vehicleToBeRegistered.add(enteredVehicle);

        addJsonVehicle(vehicleToBeRegistered);
        System.out.println("============================================================");
    }
    
    
    public  static int updateVehicle(int search, Scanner scanner, ArrayList<Vehicle> vehicleRead, int confirmation) {
        int answer;
        int newId;
        String newName;
        String newColor;
        search -= 1;
        System.out.println("======================================");
        System.out.println("Select:\n(1)Do you want to change the id?\n(2)Do you want to change the name?\n(3)Do you want to change the color?\nEnter your answer:");
        answer = scanner.nextInt();
        if (answer == 1) {
            FileManager.printSelectedVehicle(vehicleRead, search);
            newId = scanner.nextInt();
            
            vehicleRead.get(search).setId(newId);
            FileManager.printModified(vehicleRead, search);
            FileManager.addJsonVehicle(vehicleRead);
            confirmation = 2;
            
        } else if (answer == 2) {
            FileManager.printVehicle(vehicleRead, search);
            newName = scanner.next();
            
            vehicleRead.get(search).setNameOfDriver(newName);
            FileManager.printModified(vehicleRead, search);
            FileManager.addJsonVehicle(vehicleRead);
            confirmation = 2;
            
        } else if (answer == 3) {
            
            FileManager.printVehicleColor(vehicleRead, search);
            
            newColor = scanner.next();
            
            vehicleRead.get(search).setColor(newColor);
            FileManager.printModified(vehicleRead, search);
            FileManager.addJsonVehicle(vehicleRead);
            confirmation = 2;
            
        } else {
            System.out.println("The options are from 1 to 3");
            
        }
        return confirmation;
    }
    

    public static void addJsonVehicle(ArrayList<Vehicle> vehicle) {
        String save = new Gson().toJson(vehicle);
        try {
            try ( FileWriter write = new FileWriter("Vehicle.json")) {
                write.write(save);
                write.close();
            }

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(VehicleS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public static int registerMoreVehicle(Scanner scanner) {
        int followAction;
        System.out.println("=======================================================");
        System.out.println("Would you like to enter another vehicle? \n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
        followAction = scanner.nextInt();
        System.out.println("=======================================================");
        return followAction;
    }

    public static int compareQuantityInVehicle(int search, ArrayList<Vehicle> vehicle, Scanner scanner) {
        while (search <= 0 || search > vehicle.size()) {
            System.out.println("Not registered");
            System.out.println("Enter again:");
            search = scanner.nextInt();
        }
        return search;
    }
    
      public static void printAllListOfVehicle(ArrayList<Vehicle> vehicle) {
        System.out.println("=======================================================");
        System.out.println("--------       Vehicle:      ---------");
        System.out.println("\tID\t\t\tName Of Driver\t\t\tColor");

        for (int i = 0; i < vehicle.size(); i++) {

            System.out.printf("[%d].%d \t\t\t%s\t\t\t\t %s\n", (i + 1), vehicle.get(i).getId(), vehicle.get(i).getNameOfDriver(), vehicle.get(i).getColor());

        }
        System.out.println("=================================================================");
    }
      
      public static ArrayList<Vehicle> readJSONVehicle(ArrayList<Vehicle> vehicle) throws JsonSyntaxException {
        String json = "";
        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(new FileReader("Vehicle.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                json = line;
                TypeToken<ArrayList<Vehicle>> types = new TypeToken<ArrayList<Vehicle>>() {
                };

                vehicle = gson.fromJson(json, types.getType());

            }
            br.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return vehicle;
    }
      
        public static void printList(int incomingVehicleRegistration, ArrayList<Vehicle> vehicle) {

        System.out.println("=======================================================");
        System.out.println("--------List of products in stock:---------");
        System.out.println("Id\t\t\t\t Name");
        for (int i = 0; i < incomingVehicleRegistration; i++) {

            System.out.printf("[%d].%d \t\t\t   %s\n", (i + 1), vehicle.get(i).getId(), vehicle.get(i).getNameOfDriver());

        }
    }

}
