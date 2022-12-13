package ec.edu.espe.cellphone.view;

import ec.edu.espe.cellphone.controller.FileManagement;
import ec.edu.espe.cellphone.model.Cellphone;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GitSoft TEAM, DCCO-ESPE
 */

public class CellphoneAdministrator {

    public static ArrayList<Cellphone> cellphones;

    public static void main(String[] args) {
        cellphones = new ArrayList<>();

        menu();
    }

    public static void menu() {
        Scanner scan;
        scan = new Scanner(System.in);
        FileManagement file = new FileManagement();
        Cellphone cellphone;

        int option;
        int id;
        String fileName;
        String currentFile = "None";

        do {
            System.out.println("======================================");
            System.out.println("|       Cellphone Administrator      |");
            System.out.println("======================================");
            System.out.println("|       1. Print Cellphones          |");
            System.out.println("|       2. Add Cellphone             |");
            System.out.println("|       3. Save file Json            |");
            System.out.println("|       4. Update Cellphone          |");
            System.out.println("|       5. Delete Cellphone          |");
            System.out.println("|       6. Exit                      |");
            System.out.println("======================================");

            option = optionSelected("\n-Please, type an option: ");

            switch (option) {
                case 1:
                    System.out.println("   \n === List of Cellphones ===");
                    for (Cellphone cellphoneInfo : cellphones) {
                        System.out.println(cellphoneInfo.toString());
                    }
                    break;

                case 2:
                    System.out.println(" \n ===  Add Cellphone:  ===");
                    int nextId = cellphones.size();
                    cellphone = new Cellphone();
                    cellphone.enterInfo(nextId);
                    cellphones.add(cellphone);
                    if (!currentFile.equals("None")) {
                        file.saveCellphones(cellphones, currentFile);
                    }
                    break;

                case 3:
                    System.out.print("=== Enter the name of the file to save ===");
                    fileName = scan.nextLine();
                    file.saveCellphones(cellphones, fileName);
                    currentFile = fileName;
                    break;

                case 4:
                    System.out.println(" \n ===  Update Cellphone:  ===");
                    if (!currentFile.equals("None")) {
                        for (Cellphone standInfo : cellphones) {
                            System.out.println(standInfo.toString());
                        }
                        id = optionSelected("Type ID: ");
                        try {
                            cellphone = cellphones.get(id);
                            menuUpdate(cellphone);
                            file.saveCellphones(cellphones, currentFile);
                        } catch (Exception e) {
                            System.out.println("The ID not exist");
                        }
                    } else {
                        System.out.println("Please, save your file");
                    }
                    break;

                case 5:
                    System.out.println("=== Enter the name of the file to delete ===");
                    fileName = scan.nextLine();
                    file.deleteCellphones(fileName);
                    break;

                case 6:
                    break;

                default:
                    System.out.println("ERROR");
            }

        } while (option != 6);
    }

    public static void menuUpdate(Cellphone stand) {
        int option;

        do {

            System.out.println(stand);
            System.out.println("===============================");
            System.out.println("|   1. Modify BRAND           |");
            System.out.println("|   2. Modify MODEL           |");
            System.out.println("|   3. Modify phones          |");
            System.out.println("|   4. Delete cellphone       |");
            System.out.println("|   5. Back                   |");
            System.out.println("===============================");

            option = optionSelected("\n-Please, type an option: ");

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
                    cellphones.remove(stand);
                    System.out.println("== Cellphone was deleted ==");
                    option = 5;                    
                    break;

                case 5:
                    break;

                default:
                    System.out.println("ERROR");
            }
        } while (option != 5);
    }

    public static int optionSelected(String message) {
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
