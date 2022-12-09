package ec.edu.espe.busS.view;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.bus.model.Bus;

import ec.edu.espe.bus.controller.FileManager;

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
public class BusS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bus> bus = new ArrayList<>();
        int incomingBusRegistration = 0;
        Boolean exit = false;
        int option = 0;

        while (!exit) {
            FileManager.header(incomingBusRegistration);
            try {
                System.out.println("Enter the option:");
                option = scanner.nextInt();

                switch (option) {
                    case 1: {

                        int followAction = 1;
                        while (followAction == 1) {

                            ArrayList<Bus> busRead = new ArrayList<>();

                            busRead = FileManager.readJSONBus(busRead);

                            incomingBusRegistration = busRead.size();

                            FileManager.saveBus(incomingBusRegistration, busRead);

                            followAction = FileManager.registerMoreBus(scanner);

                            incomingBusRegistration++;

                        }

                    }

                    break;
                    case 2: {
                        int numberOfBus;
                        ArrayList<Bus> busRead = new ArrayList<>();

                        busRead = FileManager.readJSONBus(busRead);

                        numberOfBus = busRead.size();

                        if (numberOfBus != 0) {

                            FileManager.printAllListOfBus(busRead);

                        } else {
                            System.out.println("No bus have been registered yet");

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
                        int numberOfBus;
                        ArrayList<Bus> busRead = new ArrayList<>();

                        busRead = FileManager.readJSONBus(busRead);

                        numberOfBus = busRead.size();

                        if (numberOfBus != 0) {
                            while (confirmation == 1) {
                                FileManager.printList(numberOfBus, busRead);

                                System.out.print("Enter the number of the bus you wish to modify:\t");
                                search = scanner.nextInt();

                                search = FileManager.compareQuantityInBus(search, busRead, scanner);

                                confirmation = FileManager.updateBus(search, scanner, busRead, confirmation);

                            }

                        } else {
                            System.out.println("No bus have been registered yet");
                        }

                    }
                    break;
                    case 4: {

                        ArrayList<Bus> busRead = new ArrayList<>();

                        busRead = FileManager.readJSONBus(busRead);
                        FileManager.deleteBus(busRead);
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
