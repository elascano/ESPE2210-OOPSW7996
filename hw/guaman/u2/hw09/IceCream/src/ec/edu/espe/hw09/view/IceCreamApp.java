package ec.edu.espe.hw09.view;

import ec.edu.espe.hw09.controller.FileManager;
import ec.edu.espe.hw09.model.IceCream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class IceCreamApp {

    public static void main(String[] args) {
        int option = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        ArrayList<IceCream> iceCreams;
        iceCreams = FileManager.read();

        while (option != 3) {
            System.out.println("\nICE-CREAM APP SIMULATOR ");
            System.out.println("by: Alexander Guaman");
            System.out.println("\nMAIN MENU");
            System.out.println("1. Add a new Ice Cream");
            System.out.println("2. Show all Ice Creams");
            System.out.println("3. Exit");

            System.out.print("Enter an option: ");

            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    FileManager.addNewIceCream(iceCreams);
                }

                case 2 -> {
                    FileManager.showAllIceCreams(iceCreams);
                }

                case 3 ->
                    System.out.println("See you...");

                default ->
                    System.out.println("Error: Invalid option try again.");
            }

        }
    }

}
