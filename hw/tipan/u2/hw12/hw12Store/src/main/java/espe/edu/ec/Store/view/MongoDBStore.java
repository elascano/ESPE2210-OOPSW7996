package espe.edu.ec.Store.view;

import espe.edu.ec.store.controller.ConnectionMongoStore;
import java.util.Scanner;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class MongoDBStore {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option;
        boolean exitMenu = false;

        try {
            while (!exitMenu) {
                printMenu();
                System.out.print("Option: ");
                option = sc.nextInt();

                switch (option) {
                    case 1 ->
                        ConnectionMongoStore.insertProduct();
                    case 2 ->
                        ConnectionMongoStore.findProduct();
                    case 3 ->
                        ConnectionMongoStore.updateProduct();
                    case 4 ->
                        ConnectionMongoStore.deleteProduct();
                    case 5 ->
                        exitMenu = true;
                    default -> {
                        System.out.println("ERROR! Invalid option\n");
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("ERROR! Incorrect value");
        }
    }

    private static void printMenu() {
        System.out.println("*******************************");
        System.out.println("             WELCOME           ");
        System.out.println("        Huerto EcoMarket       ");
        System.out.println("        Reishel's System       ");
        System.out.println("You want to do?");
        System.out.println("*******************************");
        System.out.println("1. Insert the product");
        System.out.println("2. Read a product");
        System.out.println("3. Update a product");
        System.out.println("4. Delete a product");
        System.out.println("5. Exit");
        System.out.println("*******************************");
    }

}
