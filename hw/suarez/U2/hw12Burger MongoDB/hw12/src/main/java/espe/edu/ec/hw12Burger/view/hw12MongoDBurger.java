package espe.edu.ec.hw12Burger.view;

import espe.edu.ec.hw12Burger.controller.ConnectionMongoBurger;
import java.util.Scanner;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class hw12MongoDBurger {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        boolean exitMenu = false;

        try {
            while (!exitMenu) {
                printMenu();
                System.out.print("Enter the option --> ");
                option = sc.nextInt();

                switch (option) {
                    case 1 ->
                        ConnectionMongoBurger.insertBurger();
                    case 2 ->
                        ConnectionMongoBurger.findBurger();
                    case 3 ->
                        ConnectionMongoBurger.updateBurger();
                    case 4 ->
                        ConnectionMongoBurger.deleteBurger();
                    case 5 ->
                        exitMenu = true;
                    default -> {
                        System.out.println("|||Invalid option|||\n");
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Incorrect value");
        }
    }

    private static void printMenu() {
        System.out.println("|||||||||Enter the menu|||||||||");
        System.out.println("1. Insert new hamburger in menu");
        System.out.println("2. Find a hamburger in menu");
        System.out.println("3. Modify a hamburger in menu");
        System.out.println("4. Delete a hamburger in menu");
        System.out.println("5. Exit");
        System.out.println("||||||||||||||||||||||||||||||||");
    }

}
