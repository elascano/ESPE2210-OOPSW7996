package ec.edu.espe.cable.view;

import ec.edu.espe.cable.controller.FileManagement;
import ec.edu.espe.cable.model.Cable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class CableExcercise {

    public static ArrayList<Cable> cables;

    public static void main(String[] args) {
        cables = new ArrayList<>();

        cableMenu();
    }

    private static void coverInfo() {
        System.out.println("--------------------------------------");
        System.out.println("            CABLE PROGRAM :D      ");
        System.out.println("--------------------------------------");
        System.out.println("          Lindsay Barrionuevo         ");
        System.out.println("--------------------------------------");
    }

    public static void cableMenu() {
        Scanner scan;
        scan = new Scanner(System.in);
        FileManagement file = new FileManagement();
        Cable cable;

        int option;
        int id;
        String fileName;
        String currentFile = "None";

        coverInfo();

        do {
            System.out.println("---------------------------------------");
            System.out.println("              CABLE MENU");
            System.out.println("---------------------------------------");
            System.out.println("Current File: " + currentFile + "\n");
            System.out.println("1. Show Cables: ");
            System.out.println("2. Add new cable: ");
            System.out.println("3. Load file cable: ");
            System.out.println("4. Save file cable: ");
            System.out.println("5. Update all cables: ");
            System.out.println("6. Delete cables: ");
            System.out.println("7. Leave program: ");

            option = askOption("\nChoose an option: ");

            switch (option) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("                Cables");
                    System.out.println("---------------------------------------");
                    for (Cable standInfo : cables) {
                        System.out.println(standInfo.toString());
                    }
                    break;

                case 2:
                    System.out.println("---------------------------------------");
                    System.out.println("            Add new cable");
                    System.out.println("---------------------------------------");
                    int nextId = cables.size();
                    cable = new Cable();
                    cable.enterInfo(nextId);
                    cables.add(cable);
                    if (!currentFile.equals("None")) {
                        file.saveStands(cables, currentFile);
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the file to load cables: ");
                    fileName = scan.nextLine();
                    cables = file.loadStands(fileName);
                    if (!cables.isEmpty()) {
                        currentFile = fileName;
                    } else {
                        currentFile = "None";
                    }
                    break;

                case 4:
                    System.out.println("Enter the name of the file to save cables: ");
                    fileName = scan.nextLine();
                    file.saveStands(cables, fileName);
                    currentFile = fileName;
                    break;

                case 5:
                    System.out.println("---------------------------------------");
                    System.out.println("           Cables to update");
                    System.out.println("---------------------------------------");
                    if (!currentFile.equals("None")) {
                        for (Cable standInfo : cables) {
                            System.out.println(standInfo.toString());
                        }
                        id = askOption("Enter ID of the list: ");
                        try {
                            cable = cables.get(id);
                            showUpdateMenu(cable);
                            file.saveStands(cables, currentFile);
                        } catch (Exception e) {
                            System.out.println("The ID entered was not found");
                        }
                    } else {
                        System.out.println("Please, first save or load a file");
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
                    System.out.println("The option is not valid");
            }

        } while (option != 7);
    }

    public static void showUpdateMenu(Cable cable) {
        int option;

        do {
            System.out.println("--------------------------------------");
            System.out.println(cable);
            System.out.println("--------------------------------------");
            System.out.println("1. Modify type of cable");
            System.out.println("2. Modify type of conductor");
            System.out.println("3. Modify the properties");
            System.out.println("4. Delete all cables");
            System.out.println("5. Back");

            option = askOption("\nPlease, choose an option: ");

            switch (option) {
                case 1:
                    cable.setNameCable();
                    break;

                case 2:
                    cable.setConductor();
                    break;

                case 3:
                    cable.setCableProperty();
                    break;

                case 4:
                    cables.remove(cable);
                    System.out.println("The current cable was deleted");
                    option = 5;                    
                    break;

                case 5:
                    break;

                default:
                    System.out.println("The option is not valid");
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
