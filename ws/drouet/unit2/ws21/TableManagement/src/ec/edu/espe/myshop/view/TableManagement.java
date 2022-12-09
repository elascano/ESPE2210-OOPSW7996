package ec.edu.espe.myshop.view;

import ec.edu.espe.myshop.controller.FileManagement;
import ec.edu.espe.myshop.model.Table;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class TableManagement {

    public static ArrayList<Table> tables;

    public static void main(String[] args) {
        tables = new ArrayList<>();

        showMainMenu();
    }

    private static void showMyInfo() {
        System.out.println("======================================");
        System.out.println("  Table Management - FileManagement");
        System.out.println("======================================");
        System.out.println("-----------Stephen Drouet------------");
    }

    public static void showMainMenu() {
        Scanner scan;
        scan = new Scanner(System.in);
        FileManagement file = new FileManagement();
        Table table;

        int option;
        int id;
        String fileName;
        String currentFile = "None";

        showMyInfo();

        do {
            System.out.println("---------------------------------------");
            System.out.println("              Main Menu");
            System.out.println("---------------------------------------");
            System.out.println("Current File: " + currentFile + "\n");
            System.out.println("1. Show all tables");
            System.out.println("2. Add table to current table set");
            System.out.println("3. Load table set");
            System.out.println("4. Save table set");
            System.out.println("5. Update current table set");
            System.out.println("6. Delete table set");
            System.out.println("7. Exit");

            option = askOption("\nChoose an option: ");

            switch (option) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("                Tables");
                    System.out.println("---------------------------------------");
                    for (Table standInfo : tables) {
                        System.out.println(standInfo.toString());
                    }
                    break;

                case 2:
                    System.out.println("---------------------------------------");
                    System.out.println("    Add table to current table set");
                    System.out.println("---------------------------------------");
                    int nextId = tables.size();
                    table = new Table();
                    table.enterInfo(nextId);
                    tables.add(table);
                    if (!currentFile.equals("None")) {
                        file.saveStands(tables, currentFile);
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the file to load");
                    fileName = scan.nextLine();
                    tables = file.loadStands(fileName);
                    if (!tables.isEmpty()) {
                        currentFile = fileName;
                    } else {
                        currentFile = "None";
                    }
                    break;

                case 4:
                    System.out.println("Enter the name of the file to save");
                    fileName = scan.nextLine();
                    file.saveStands(tables, fileName);
                    currentFile = fileName;
                    break;

                case 5:
                    System.out.println("---------------------------------------");
                    System.out.println("           table to update");
                    System.out.println("---------------------------------------");
                    if (!currentFile.equals("None")) {
                        for (Table standInfo : tables) {
                            System.out.println(standInfo.toString());
                        }
                        id = askOption("Enter ID of the list: ");
                        try {
                            table = tables.get(id);
                            showUpdateMenu(table);
                            file.saveStands(tables, currentFile);
                        } catch (Exception e) {
                            System.out.println("The ID entered was not found");
                        }
                    } else {
                        System.out.println("First save or load a file");
                    }
                    break;

                case 6:
                    System.out.println("Enter the name of the file to delete");
                    fileName = scan.nextLine();
                    file.deleteStands(fileName);
                    break;

                case 7:
                    break;

                default:
                    System.out.println("Error: Invalid option");
            }

        } while (option != 7);
    }

    public static void showUpdateMenu(Table stand) {
        int option;

        do {
            System.out.println("--------------------------------------");
            System.out.println(stand);
            System.out.println("--------------------------------------");
            System.out.println("1. Modify type of wood");
            System.out.println("2. Modify category");
            System.out.println("3. Delete current table");
            System.out.println("4. Back");

            option = askOption("\nChoose an option: ");

            switch (option) {
                case 1:
                    stand.setWood();
                    break;

                case 2:
                    stand.setCategory();
                    break;

                case 3:
                    tables.remove(stand);
                    System.out.println("The current table was deleted");
                    option = 4;                    
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Error: Invalid option");
            }
        } while (option != 4);
    }

    public static int askOption(String message) {
        int option;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.print(message);
        try {
            option = sc.nextInt();
        } catch (Exception e) {
            option = -1;
        }
        sc.nextLine();

        return option;
    }

}
