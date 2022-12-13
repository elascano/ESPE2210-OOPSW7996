package ec.edu.espe.bus.controller;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.bus.model.Bus;
import ec.edu.espe.busS.view.BusS;
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

    public static int findBusPosition(ArrayList<Bus> bus, String action) {
        int id;
        int busPosition = -1;

        printAllListOfBus(bus);
        do {
            System.out.println("Enter the id of the bus you want to " + action);
            id = scanner.nextInt();
            busPosition = searchId(bus, id);
        } while (busPosition == -1);

        return busPosition;
    }

    public static int searchId(ArrayList<Bus> bus, int id) {
        boolean validator = true;
        int busPosition = -1;
        for (int i = 0; i < bus.size(); i++) {
            if (id == bus.get(i).getId()) {
                validator = false;
                busPosition = i;
            }
        }
        if (validator) {
            System.out.println("Id entered does not exist.");
        }
        return busPosition;
    }

    public static void deleteBus(ArrayList<Bus> bus) {
        int option, busPosition;
        String action = "delete";
        busPosition = findBusPosition(bus, action);

        System.out.println("Are you sure you want to delete this bus?\n1. YES\n2. NO");
        System.out.println("Choose an option (type 1 or 2)");
        option = scanner.nextInt();
        while (option > 2) {
            System.out.println("Option invalid, Enter an option: ");
            option = scanner.nextInt();
        }
        if (option == 1) {
            bus.remove(busPosition);
            System.out.println("Bus removed");
            System.out.println("=======================================");
        }
        addJsonBus(bus);

    }

    public static void printBusColor(ArrayList<Bus> bus, int search) {
        System.out.println("Id bus:\t\t\t" + bus.get(search).getId());
        System.out.println("Name of Driver:\t\t " + bus.get(search).getNameOfDriver());
        System.out.println("Color:\t\t\t" + bus.get(search).getColor());
        System.out.println("Enter the color to be modified:\t");
    }

    public static void header(int incomingBusRegistration) {
        if (incomingBusRegistration == 0) {
            System.out.println("       UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE       ");
            System.out.println("                       Hw08");

            System.out.println("\t\t\t    Alex Trejo");

            System.out.println("Instructor: Edison Lascano");
            System.out.println("=========================================================");
            System.out.println("¡WELCOME TO THE BUS REGISTRATION SYSTEM  :)!       ");
            System.out.println("______________________________________________________________");
        }

        System.out.println("___________________Menu______________________");
        System.out.println("1)Register bus:");
        System.out.println("2)Print all registered bus:");
        System.out.println("3)Modify the information of one of the registered bus:");
        System.out.println("4)Delete bus");
        System.out.println("5)Log out");
    }

    public static void printSelectedBus(ArrayList<Bus> bus, int search) {
        System.out.println("Id bus:\t\t\t" + bus.get(search).getId());
        System.out.println("Name of Driver:\t\t " + bus.get(search).getNameOfDriver());
        System.out.println("Color:\t\t\t" + bus.get(search).getColor());
        System.out.println("Enter the new ID:\t");

    }

    public static void printBus(ArrayList<Bus> bus, int search) {
        System.out.println("Id bus:\t\t\t" + bus.get(search).getId());
        System.out.println("Name of Driver:\t\t " + bus.get(search).getNameOfDriver());
        System.out.println("Color:\t\t\t" + bus.get(search).getColor());
        System.out.println("Enter the name to be modified:\t");
    }

    public static void printModified(ArrayList<Bus> bus, int search) {
        System.out.println("-----------Modified Data-----------");
        System.out.println("Id bus:\t\t\t" + bus.get(search).getId());
        System.out.println("Name of Driver:\t\t " + bus.get(search).getNameOfDriver());
        System.out.println("Color:\t\t\t" + bus.get(search).getColor());

        System.out.println("-----------Modified Data-----------");
    }

    public static void saveBus(int incomingBusRegistration, ArrayList<Bus> busToBeRegistered) {
        Bus enteredBus = new Bus();

        String name = "";
        int id = 0;
        String color = "";

        System.out.println("__________________Bus registration system______________");
        System.out.println("----------------------------Bus" + (incomingBusRegistration + 1) + "----------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the id of the Bus to register:\t\t");
        id = scanner.nextInt();

        System.out.print("Enter the name Of Driver:\t");
        name = scanner.next();

        System.out.print("Enter the color:\t");
        color = scanner.next();

        enteredBus.setId(id);
        enteredBus.setNameOfDriver(name);
        enteredBus.setColor(color);

        busToBeRegistered.add(enteredBus);

        addJsonBus(busToBeRegistered);
        System.out.println("============================================================");
    }

    public static int updateBus(int search, Scanner scanner, ArrayList<Bus> busRead, int confirmation) {
        int answer;
        int newId;
        String newName;
        String newColor;
        search -= 1;
        System.out.println("======================================");
        System.out.println("Select:\n(1)Do you want to change the id?\n(2)Do you want to change the name?\n(3)Do you want to change the color?\nEnter your answer:");
        answer = scanner.nextInt();
        if (answer == 1) {
            FileManager.printSelectedBus(busRead, search);
            newId = scanner.nextInt();

            busRead.get(search).setId(newId);
            FileManager.printModified(busRead, search);
            FileManager.addJsonBus(busRead);
            confirmation = 2;

        } else if (answer == 2) {
            FileManager.printBus(busRead, search);
            newName = scanner.next();

            busRead.get(search).setNameOfDriver(newName);
            FileManager.printModified(busRead, search);
            FileManager.addJsonBus(busRead);
            confirmation = 2;

        } else if (answer == 3) {

            FileManager.printBusColor(busRead, search);

            newColor = scanner.next();

            busRead.get(search).setColor(newColor);
            FileManager.printModified(busRead, search);
            FileManager.addJsonBus(busRead);
            confirmation = 2;

        } else {
            System.out.println("The options are from 1 to 3");

        }
        return confirmation;
    }

    public static void addJsonBus(ArrayList<Bus> bus) {
        String save = new Gson().toJson(bus);
        try {
            try ( FileWriter write = new FileWriter("RegisterBus.json")) {
                write.write(save);
                write.close();
            }

        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(BusS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public static int registerMoreBus(Scanner scanner) {
        int followAction;
        System.out.println("=======================================================");
        System.out.println("Would you like to enter another bus? \n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
        followAction = scanner.nextInt();
        System.out.println("=======================================================");
        return followAction;
    }

    public static int compareQuantityInBus(int search, ArrayList<Bus> bus, Scanner scanner) {
        while (search <= 0 || search > bus.size()) {
            System.out.println("Not registered");
            System.out.println("Enter again:");
            search = scanner.nextInt();
        }
        return search;
    }

    public static void printAllListOfBus(ArrayList<Bus> bus) {
        System.out.println("=======================================================");
        System.out.println("--------      Bus:      ---------");
        System.out.println("\tID\t\t\tName Of Driver\t\t\tColor");

        for (int i = 0; i < bus.size(); i++) {

            System.out.printf("[%d].%d \t\t\t%s\t\t\t\t %s\n", (i + 1), bus.get(i).getId(), bus.get(i).getNameOfDriver(), bus.get(i).getColor());

        }
        System.out.println("=================================================================");
    }

    public static ArrayList<Bus> readJSONBus(ArrayList<Bus> bus) throws JsonSyntaxException {
        String json = "";
        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(new FileReader("RegisterBus.json"));
            String line = "";
            while ((line = br.readLine()) != null) {
                json = line;
                TypeToken<ArrayList<Bus>> types = new TypeToken<ArrayList<Bus>>() {
                };

                bus = gson.fromJson(json, types.getType());

            }
            br.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return bus;
    }

    public static void printList(int incomingBusRegistration, ArrayList<Bus> bus) {

        System.out.println("=======================================================");
        System.out.println("--------List of bus:---------");
        System.out.println("Id\t\t\t\t Name");
        for (int i = 0; i < incomingBusRegistration; i++) {

            System.out.printf("[%d].%d \t\t\t   %s\n", (i + 1), bus.get(i).getId(), bus.get(i).getNameOfDriver());

        }
    }

}
