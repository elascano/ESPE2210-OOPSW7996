package ec.edu.espe.tableapp.view;

import ec.edu.espe.tableapp.controller.FileManager;
import ec.edu.espe.tableapp.model.Table;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class TableAppS {

    public static void main(String[] args) {

        controlMainMenu();
    }

    public static void controlMainMenu() {
        int option = 0;
        ArrayList<Table> tables = new ArrayList();
        tables = FileManager.loadData();
        while (option != 5) {
            System.out.println("\n       Sheylee Enriquez");
            System.out.println("---------Homework 08---------");
            System.out.println("\n===========TABLE APP============");
            System.out.println("|               Menu:           |");
            System.out.println("| 1. Add a new table            |");
            System.out.println("| 2. Show all the tables        |");
            System.out.println("| 3. Remove a table             |");
            System.out.println("| 4. Update a table             |");
            System.out.println("| 5. Exit                       |");
            System.out.println("==================================");

            option = askOption();

            switch (option) {
                case 1 -> {
                    FileManager.addNewTable(tables);
                }

                case 2 -> {
                    FileManager.showTables(tables);
                }

                case 3 -> {
                    FileManager.showTables(tables);
                    FileManager.removeTables(tables);
                }
                
                case 4 -> {
                    FileManager.showTables(tables);
                    FileManager.updateTable(tables);
                }
                
                case 5 ->
                    System.out.println("Thanks! :)");

                default ->
                    System.out.println("Error: Invalid option try again.");
            }

        }
    }

    public static int askOption() {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print("Please, choose an option: ");
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = 0;
        }
        sc.nextLine();

        return option;
    }

    

}
