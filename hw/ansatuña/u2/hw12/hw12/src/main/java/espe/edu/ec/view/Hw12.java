package espe.edu.ec.view;

import espe.edu.ec.controller.ConnectionToMaven;
import java.util.Scanner;

/**
 *
 * @author Karla Ansatuña
 */
public class Hw12 {

    public static void main(String[] args) {
        int choice = 0;
        boolean option = false;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {

                case 1 -> {
                    ConnectionToMaven.insertEvent();
                }
                case 2 -> {
                    ConnectionToMaven.findEvent();

                }
                case 3 -> {
                    ConnectionToMaven.updateEvent();
                }
                case 4 -> {
                    ConnectionToMaven.deleteEvent();
                }
                case 5 -> {
                    ConnectionToMaven.cancelEvent();
                }
                case 6 -> {
                    option = true;
                }
            }
        } while (!option);
    }

    public static void menu() {
        System.out.println("===================");
        System.out.println("=====Welcome User=====");
        System.out.println("Please choose an option");
        System.out.println("1. Enter a new event >");
        System.out.println("2. Find an event >");
        System.out.println("3. Update the Data of an event by id >");
        System.out.println("4. Delete an event >");
        System.out.println("5. Cancel an event >");
        System.out.println("6. Exit the program >");
        System.out.println("==========>");
    }
}
