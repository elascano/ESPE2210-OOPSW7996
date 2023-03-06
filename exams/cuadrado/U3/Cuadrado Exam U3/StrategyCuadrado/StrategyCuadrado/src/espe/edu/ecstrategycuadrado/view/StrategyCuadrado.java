package espe.edu.ecstrategycuadrado.view;
//import espe.edu.ec.Pizza.controller.ConnectionMongoPizza;
import espe.edu.ec.strategycuadrado.controller.SortApp.ConnectionMongoSortApp;
import java.util.Scanner;
/**
 *
 * @author Alejandro Cuadrado DeveloperBears OOP7996
 */
public class StrategyCuadrado {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        boolean exitMenu = false;
        try {
            while (!exitMenu) {
                printMenu();
                System.out.print("Enter the option:");
                option = sc.nextInt();

                switch (option) {
                    case 1 ->
                        ConnectionMongoSortApp.InsertSortApp();
                    case 2 ->
                        ConnectionMongoSortApp.findSortApp();
                    case 3 ->
                        ConnectionMongoSortApp.updateSortApp();
                    case 4 ->
                        ConnectionMongoSortApp.deleteSortApp();
                    case 5 ->
                        exitMenu = true;
                    default -> {
                        System.out.println("***Invalid option***\n");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect value");
        }
    }
    private static void printMenu() {
        System.out.println("***Enter the menu***");
        System.out.println("1. Insert new id");
        System.out.println("2. Find a SortApp:");
        System.out.println("3. Modify SortApp:");
        System.out.println("4. Delete SortApp:");
        System.out.println("5. Exit");
        System.out.println("================");
    }
}