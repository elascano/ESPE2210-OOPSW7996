package ec.edu.espe.myshop.view;

import ec.edu.espe.myshop.controller.FileManagement;
import ec.edu.espe.myshop.model.Stand;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class MyShop {

    public static ArrayList<Stand> stands;

    public static void main(String[] args) {
        stands = new ArrayList<>();

        showMainMenu();
    }

    private static void showMyInfo() {
        System.out.println("======================================");
        System.out.println("         MyShop - FileManagement");
        System.out.println("======================================");
        System.out.println("-----------Stephen Drouet------------");
    }

    public static void showMainMenu() {
        Scanner scan;
        scan = new Scanner(System.in);
        FileManagement file = new FileManagement();
        Stand stand;

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
            System.out.println("1. Show all Stands");
            System.out.println("2. Add stand to current stand set");
            System.out.println("3. Load stand set");
            System.out.println("4. Save stand set");
            System.out.println("5. Update current stand set");
            System.out.println("6. Delete stand set");
            System.out.println("7. Exit");

            option = askOption("\nChoose an option: ");

            switch (option) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("                Stands");
                    System.out.println("---------------------------------------");
                    for (Stand standInfo : stands) {
                        System.out.println(standInfo.toString());
                    }
                    break;

                case 2:
                    System.out.println("---------------------------------------");
                    System.out.println("    Add stand to current stand set");
                    System.out.println("---------------------------------------");
                    int nextId = stands.size();
                    stand = new Stand();
                    stand.enterInfo(nextId);
                    stands.add(stand);
                    if (!currentFile.equals("None")) {
                        file.saveStands(stands, currentFile);
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the file to load");
                    fileName = scan.nextLine();
                    stands = file.loadStands(fileName);
                    if (!stands.isEmpty()) {
                        currentFile = fileName;
                    } else {
                        currentFile = "None";
                    }
                    break;

                case 4:
                    System.out.println("Enter the name of the file to save");
                    fileName = scan.nextLine();
                    file.saveStands(stands, fileName);
                    currentFile = fileName;
                    break;

                case 5:
                    System.out.println("---------------------------------------");
                    System.out.println("           Stands to update");
                    System.out.println("---------------------------------------");
                    if (!currentFile.equals("None")) {
                        for (Stand standInfo : stands) {
                            System.out.println(standInfo.toString());
                        }
                        id = askOption("Enter ID of the list: ");
                        try {
                            stand = stands.get(id);
                            showUpdateMenu(stand);
                            file.saveStands(stands, currentFile);
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

    public static void showUpdateMenu(Stand stand) {
        int option;

        do {
            System.out.println("--------------------------------------");
            System.out.println(stand);
            System.out.println("--------------------------------------");
            System.out.println("1. Modify stand name");
            System.out.println("2. Modify owner name");
            System.out.println("3. Modify the products");
            System.out.println("4. Delete current stand");
            System.out.println("5. Back");

            option = askOption("\nChoose an option: ");

            switch (option) {
                case 1:
                    stand.setName();
                    break;

                case 2:
                    stand.setOwnerName();
                    break;

                case 3:
                    stand.setProductsName();
                    break;

                case 4:
                    stands.remove(stand);
                    System.out.println("The current stand was deleted");
                    option = 5;                    
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Error: Invalid option");
            }
        } while (option != 5);
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
