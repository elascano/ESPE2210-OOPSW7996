/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.view;

import com.google.gson.Gson;
import ec.edu.espe.bus.model.Bus;
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
public class Exercise33 {

    public static void main(String[] args) {
        int id;

        int answer;
        int numberOfBusesEntered = 0;
        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bus> bus = new ArrayList<>();
        Bus registeredBus = new Bus();

        while (!exit) {
            try {
                Menu();
                answer = scanner.nextInt();

                switch (answer) {
                    case 1: {

                        int followAction = 1;
                        while (followAction == 1) {

                            saveBus(numberOfBusesEntered, scanner, registeredBus, bus);

                            followAction = registerMoreBuses(scanner);
                            numberOfBusesEntered++;

                        }

                    }

                    break;
                    case 2:
                        exit=true;
                        break;
                    default:
                        System.out.println("There is only option 1 re-enter again.");
                        throw new AssertionError();
                }

            } catch (InputMismatchException e) {
                System.out.println("You only have to enter numbers");
                System.out.println("==================================");

            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        }
        System.out.println("_______End of menu_________");

    }

    private static void Menu() {
        System.out.println("==========================");
        System.out.println("-------Bus system-------");
        System.out.println("1.Enter bus data");
        System.out.println("2.Log out");
        System.out.println("Enter your answer:");
    }

    private static int registerMoreBuses(Scanner scanner) {
        int followAction;
        System.out.println("=======================================================");
        System.out.println("Would you like to enter another bus? \n Enter the number: \n(1)Yes \n(2)NO \nEnter the number:");
        followAction = scanner.nextInt();
        System.out.println("=======================================================");
        return followAction;
    }

    private static void saveBus(int numberOfBusesEntered, Scanner scanner, Bus registeredBus, ArrayList<Bus> bus) {
        int id;
        String nameOfDriver;
        String color;
        System.out.println("__________________Bus data logging______________");
        System.out.println("----------------------------Bus" + (numberOfBusesEntered + 1) + "----------------");
        System.out.print("Enter the id of the bus to be registered:\t\t");
        id = scanner.nextInt();
        System.out.print("Enter the name of driver of the bus to be registered:\t");
        nameOfDriver = scanner.next();
        System.out.print("Introduzca el color del autobús a registrar:\t");
        color = scanner.next();
        registeredBus.setId(id);
        registeredBus.setNameOfDriver(nameOfDriver);
        registeredBus.setColor(color);
        bus.add(registeredBus);
        addJsonRegisterBus(bus);
        numberOfBusesEntered++;
    }

    private static void addJsonRegisterBus(ArrayList<Bus> registerbus) {
        String save = new Gson().toJson(registerbus);

        try {
            try ( FileWriter write = new FileWriter("RegisterBus.json")) {
                write.write(save);
                write.close();
            }

        } catch (IOException ex) {
            Logger.getLogger(Exercise33.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
