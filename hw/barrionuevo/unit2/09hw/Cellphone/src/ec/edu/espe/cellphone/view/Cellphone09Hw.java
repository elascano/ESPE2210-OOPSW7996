
package ec.edu.espe.cellphone.view;

import ec.edu.espe.cellphone.controller.FileManager;
import ec.edu.espe.cellphone.model.Cellphone;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Barrionuevo Lindsay, DeltaTeam, DCCO-ESPE
 */
public class Cellphone09Hw {
     public static void main(String[] args) {
        int option = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        ArrayList<Cellphone> cellphones;
        cellphones = FileManager.loadData();

        
         System.out.println("-------------------------------------");
         System.out.println("            Homework N.09");
         System.out.println("         Lindsay Barrionuevo");
         System.out.println("             Exceptions");
         System.out.println("-------------------------------------");
         
        while (option != 5) {

            System.out.println("\n            MENU:");
            System.out.println("-------------------------------------");
            System.out.println("1. Add a new cellphone");
            System.out.println("2. Show cellphones");
            System.out.println("3. Delete Cellphones");
            System.out.println("4. Update cellphone");
            System.out.println("5. Leave the program");
            System.out.println("-------------------------------------\n");

            System.out.print("Choose an option: ");

            try {
                option = sc.nextInt();
            } catch (Exception e) {
                option = 0;
            }
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    FileManager.addCellphone(cellphones);
                }

                case 2 -> {
                    FileManager.showCellphones(cellphones);
                }

                case 3 -> {
                    FileManager.showCellphones(cellphones);
                    FileManager.deleteCellphone(cellphones);
                }
                
                case 4 -> {
                    FileManager.showCellphones(cellphones);
                    FileManager.changeCellphone(cellphones);
                }
                
                case 5 ->
                    System.out.println("     Thanks!");

                default ->
                    System.out.println("Option is not valid");
            }
        }
    }

    
}
