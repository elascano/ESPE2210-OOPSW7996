package ec.edu.espe.cellphone.view;

import ec.edu.espe.cellphone.controller.FileManagement;
import ec.edu.espe.cellphone.model.Cellphone;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class CellphoneExcercise {

    public static ArrayList<Cellphone> cellphone;

    public static void main(String[] args) {
        cellphone = new ArrayList<>();

        cableMenu();
    }

    private static void coverInfo() {
        System.out.println("--------------------------------------");
        System.out.println("          CELLPHONE PROGRAM :D      ");
        System.out.println("--------------------------------------");
        System.out.println("          Lindsay Barrionuevo         ");
        System.out.println("--------------------------------------");
    }

    public static void cableMenu() {
        Scanner scan;
        scan = new Scanner(System.in);
        FileManagement file = new FileManagement();
        Cellphone cellphone;

        int option;
        int id;
        String fileName;
        String currentFile = "None";

        coverInfo();

        do {
            System.out.println("---------------------------------------");
            System.out.println("            CELLPHONE MENU");
            System.out.println("---------------------------------------");
            System.out.println("Current File: " + currentFile + "\n");
            System.out.println("1. Show add Cellphone: ");
            System.out.println("2. Add new Cellphone: ");
            System.out.println("3. Load file cellphone: ");
            System.out.println("4. Save file cellphone: ");
            System.out.println("5. Update all cellphones: ");
            System.out.println("6. Delete file cellphones: ");
            System.out.println("7. Leave program: ");

            option = askOption("\nChoose an option: ");

            switch (option) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("                Cellphone");
                    System.out.println("---------------------------------------");
                    for (Cellphone standInfo : CellphoneExcercise.cellphone) {
                        System.out.println(standInfo.toString());
                    }
                    break;

                case 2:
                    System.out.println("---------------------------------------");
                    System.out.println("           Add new cellphone");
                    System.out.println("---------------------------------------");
                    int nextId = CellphoneExcercise.cellphone.size();
                    cellphone = new Cellphone();
                    cellphone.enterInfo(nextId);
                    CellphoneExcercise.cellphone.add(cellphone);
                    if (!currentFile.equals("None")) {
                        file.saveStands(CellphoneExcercise.cellphone, currentFile);
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the file to load cellphones: ");
                    fileName = scan.nextLine();
                    CellphoneExcercise.cellphone = file.loadStands(fileName);
                    if (!CellphoneExcercise.cellphone.isEmpty()) {
                        currentFile = fileName;
                    } else {
                        currentFile = "None";
                    }
                    break;

                case 4:
                    System.out.println("Enter the name of the file to save cellphones: ");
                    fileName = scan.nextLine();
                    file.saveStands(CellphoneExcercise.cellphone, fileName);
                    currentFile = fileName;
                    break;

                case 5:
                    System.out.println("---------------------------------------");
                    System.out.println("             Update Cellphone");
                    System.out.println("---------------------------------------");
                    if (!currentFile.equals("None")) {
                        for (Cellphone standInfo : CellphoneExcercise.cellphone) {
                            System.out.println(standInfo.toString());
                        }
                        id = askOption("Enter ID of the list: ");
                        try {
                            cellphone = CellphoneExcercise.cellphone.get(id);
                            showUpdateMenu(cellphone);
                            file.saveStands(CellphoneExcercise.cellphone, currentFile);
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

    public static void showUpdateMenu(Cellphone cellphone) {
        int option;

        do {
            System.out.println("--------------------------------------");
            System.out.println(cellphone);
            System.out.println("--------------------------------------");
            System.out.println("1. Modify brand cellphone");
            System.out.println("2. Modify model cellphone");
            System.out.println("3. Modify the properties");
            System.out.println("4. Delete all cellphones");
            System.out.println("5. Back");

            option = askOption("\nPlease, choose an option: ");

            switch (option) {
                case 1:
                    cellphone.setBrandPhone();
                    break;

                case 2:
                    cellphone.setModelPhone();
                    break;

                case 3:
                    cellphone.setCellphoneProperty();
                    break;

                case 4:
                    cellphone.remove(cellphone);
                    System.out.println("The current cellphone was deleted");
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
