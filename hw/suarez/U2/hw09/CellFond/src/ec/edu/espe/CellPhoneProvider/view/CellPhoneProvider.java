package ec.edu.espe.CellPhoneProvider.view;

import ec.edu.espe.CellPhoneProvider.model.CellPhone;
import ec.edu.espe.CellPhoneProvider.controller.FileManager;
import static ec.edu.espe.CellPhoneProvider.controller.FileManager.find;
import static ec.edu.espe.CellPhoneProvider.controller.FileManager.printLine;
import ec.edu.espe.CellPhoneProvider.utils.DataNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */


public class CellPhoneProvider {

    private static void header() {

        System.out.println("********************");
        System.out.println("|||Matias Suarez|||");
        System.out.println("********************");
    }

    public static void main(String[] args) {

        int option;
        String json;
        boolean confirmation;
        json = "";
        option = 0;
        confirmation = (false);
        CellPhone cell =  new CellPhone();
        ArrayList<CellPhone> cells = new ArrayList<>(); 
        FileManager JsonManager = new FileManager();    
        Scanner sc = new Scanner(System.in);
        JsonManager.openFile(confirmation);

        header();

        do {

            Option();
            option = sc.nextInt();
            optionVerifier(option);

            switch (option) {
                case 1 -> {
                    
                    cell = new CellPhone();
                    registerCup(cell, sc);
                    cells.add(cell);
                    JsonManager.saveJson(json, cells);

                }                               
                case 2 -> {
                    System.out.println("/////////////////////////");
                    findOneCamera(cells);
                    System.out.println("/////////////////////////");
                }
                case 3 -> {
                    System.out.println("-------------------------");
                    System.out.println("Thank you for using our system");
                    System.out.println("-------------------------");
                }

            }

        } while (option != 3);

    }
    
    private static void findOneCamera(ArrayList<CellPhone> actualCellPhoneData) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\nInsert the id of the Cell Phone: ");
            idToSearch = sc.nextInt();

            try {
                int cameraFoundPosition = find(actualCellPhoneData, idToSearch);
                System.out.println("\nID  \t|Model   \t|color   \t|Amount|");
                printLine(actualCellPhoneData.get(cameraFoundPosition));
            } catch (DataNotFoundException ex) {
                System.out.println("Error: ");
                System.out.println(ex.getMessage());
            }

        } catch (Exception e) {
            System.out.println("||| INCORRECT DATA, TRY AGAIN |||");
        }
    }

    private static void optionVerifier(int option) {

        if (option < 1 || option > 3) {
            System.out.println("========================================== ");
            System.out.println("====Invalid option, please enter again==== ");
            System.out.println("========================================== ");
        }

    }

    private static void registerCup(CellPhone forks, Scanner sc) {

        System.out.println("|||||||||||||||||||||||||");
        System.out.println("-------------------------");

        System.out.print("Enter cell phone id--> ");
        forks.setId(sc.nextInt());
        while (forks.getId() < 100 || forks.getId() > 1000) {
            System.out.print("Invalid ID, please write again--> ");
            forks.setId(sc.nextInt());
        }
        System.out.print("Enter cell phone material--> ");
        forks.setCellPhoneBrand(sc.next());

        System.out.print("Enter the colors of the cell phone--> ");
        forks.setColor(sc.next());

        System.out.print("Enter the number of cell--> ");
        forks.setNumberOfCellPhones(sc.nextInt());

        System.out.println("|||||||||||||||||||||||||");
        System.out.println("-------------------------");

    }

    private static void Option() {
        System.out.println("#########################");
        System.out.println("||||Cup menu||||");
        System.out.println("1.Enter data cell phone");
        System.out.println("2.Read cell phone information");     
        System.out.println("3.Exit");
        System.out.println("#########################");
        System.out.print("Enter an opinion--> ");

    }

}
