package ec.edu.espe.cellphoneregister.view;

import static ec.edu.espe.cellphoneregister.controller.FileManager.*;
import ec.edu.espe.cellphoneregister.model.CellPhone;
import ec.edu.espe.cellphoneregister.utils.DataNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class CellPhoneRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option;
        Scanner sc = new Scanner(System.in);
        ArrayList<CellPhone> actualCellPhonesData = new ArrayList<>();
        String fileName = "CellPhones.json";

        do {
            actualCellPhonesData = read(actualCellPhonesData, "CellPhones.json");

            System.out.println("*        CELL PHONE REGISTER       *");
            System.out.println("------------------------------------------");
            System.out.println("\t\t1.Insert new CellPhone");
            System.out.println("\t\t2.Find a CellPhone");
            System.out.println("\t\t3.Print CellPhone");
            System.out.println("\t\t0.Exit");
            System.out.println("------------------------------------------");
            System.out.print("Select an option --> ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    addCellPhone(actualCellPhonesData);
                    create(actualCellPhonesData, fileName);
                    System.out.println("\n\n*** CELL PHONE ADDED SUCCESSFULLY ***\n");
                }

                case 2 -> {
                    findOneCellPhone(actualCellPhonesData);
                }

                case 3 ->
                    printList(actualCellPhonesData);

                case 0 ->
                    System.out.println("YOU HAVE EXITED SUCCESSFULLY!!");

                default ->
                    System.out.println("INVALID OPTION!!");
            }
        } while (option != 0);
        
    }
    
    private static void findOneCellPhone(ArrayList<CellPhone> actualCellPhoneData) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("\nInsert the id of the CellPhone to search: ");
            idToSearch = sc.nextInt();

            try {
                int cellphonesFoundPosition = find(actualCellPhoneData, idToSearch);
                System.out.println("\nID\t|MODEL\t|COLOR|");
                printLine(actualCellPhoneData.get(cellphonesFoundPosition));
            } catch (DataNotFoundException ex) {
                System.out.println("Error: ");
                System.out.println(ex.getMessage());
            }

        } catch (Exception e) {
            System.out.println("INCORRECT DATA, TRY AGAIN");
        }
    }

    public static void addCellPhone(ArrayList<CellPhone> cellphone) {

        Scanner sc = new Scanner(System.in);
        CellPhone cellphones;
        int id;
        String name;
        String color;

        try {
            System.out.println("\n----------------------------------------------");
            System.out.println("*");
            System.out.print("Enter the id of the Cell Phone: ");
            id = sc.nextInt();
            while (validateIdExistance(id)) {
                System.out.print("The id already exists. Please enter again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Enter the model of the Cell Phone: ");
            name = sc.nextLine();

            System.out.print("Enter the color of Cell Phone: ");
            color = sc.nextLine();

            cellphones = new CellPhone(id, name, color);
            System.out.println("*");
            System.out.println("-----------------------------------------------");
            cellphone.add(cellphones);
        } catch (Exception e) {
            System.out.println("INVALID DATA, PLEASE INSERT AGAIN");
        }
    }
    
    public static boolean validateIdExistance(int id) {
        ArrayList<CellPhone> cellphone = new ArrayList<>();
        cellphone = read(cellphone, "CellPhones.json");
        CellPhone cellphones = new CellPhone();

        for (int i = 0; i < cellphone.size(); i++) {
            cellphones = cellphone.get(i);
            if (id == cellphones.getId()) {
                return true;
            }
        }
        return false;
    }
    
}
