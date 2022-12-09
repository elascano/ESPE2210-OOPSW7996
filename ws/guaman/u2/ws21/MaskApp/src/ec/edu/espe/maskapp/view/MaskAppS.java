package ec.edu.espe.maskapp.view;

import ec.edu.espe.maskapp.controller.FileManager;
import ec.edu.espe.maskapp.model.Mask;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class MaskAppS {
    public static void main(String[] args) {
        controlMainMenu();
    }
    
    public static void controlMainMenu() {
        int option = 0;
        ArrayList<Mask> masks = new ArrayList();
        masks = FileManager.loadData();
        while (option != 6) {
            System.out.println("\nMASK APP SIMULATOR");
            System.out.println("by: Alexander Guaman");
            System.out.println("\n\tMAIN MENU");
            System.out.println("1. Add a new Mask");
            System.out.println("2. Show Masks");
            System.out.println("3. Remove a Mask");
            System.out.println("4. Find a Mask");
            System.out.println("5. Update a Mask");
            System.out.println("6. Exit");

            option = askOption();

            switch (option) {
                case 1 -> {
                    FileManager.addNewMask(masks);
                }

                case 2 -> {
                    FileManager.showMask(masks);
                }

                case 3 -> {
                    FileManager.showMask(masks);
                    FileManager.removeMask(masks);
                }
                
                case 4 -> {
                    FileManager.findMask(masks);
                }
                
                case 5 -> {
                    FileManager.showMask(masks);
                    FileManager.updateMask(masks);
                }
                
                case 6 ->
                    System.out.println("See you...");

                default ->
                    System.out.println("Error: Invalid option try again.");
            }

        }
    }

    public static int askOption() {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Choose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }
}
