
package ec.edu.espe.ws21_crud.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import ec.edu.espe.ws21_crud.controller.FileManager;
import ec.edu.espe.ws21_crud.model.TVSet;
/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Ws21_CRUD {

    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        ArrayList<TVSet> tvSets = new ArrayList<TVSet>();
        TVSet tvSet = new TVSet();
        String fileName;
        fileName = "";
        boolean leave = false;
        int option;
        int box;
        box = -1;

        while (!leave) {

            printHeader();

            try {

                System.out.print("> Please, Select an Option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {
                        crateFile(scan, tvSets);
                    }
                    case 2 -> {
                        FileManager.deleteJson(fileName);
                    }
                    case 3 -> {
                        System.out.println("Enter the name of the file you want to open: ");
                        fileName = scan.next();
                        tvSets.clear();
                        tvSets = FileManager.openFile(tvSets, fileName);
                        FileManager.printContinents(tvSets);
                        
                    }
                    case 4 -> {
                        System.out.println("Enter the name of the file you want to open: ");
                        fileName = scan.next();
                        tvSets.clear();
                        tvSets = FileManager.openFile(tvSets, fileName);
                        box = FileManager.searchTVSet(scan, tvSets);
                        FileManager.updateTVSet(box, tvSets, fileName);
                    }
                    case 5 -> {
                        System.out.println("Enter the name of the file you want to open: ");
                        fileName = scan.next();
                        tvSets.clear();
                        tvSets = FileManager.openFile(tvSets, fileName);
                        FileManager.deleteTVSet(tvSets, fileName);
                    }
                    case 6 -> {
                        leave = true;

                    }
                    default -> {
                        System.out.println("\n\tONLY numbers from 1 to 6!!!");
                        System.out.println("\n\tPLEASE, ENTER AGAIN: ");
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("\n\tYou must enter a number");
                scan.next();
            }
        }
        
    }
    
    private static void crateFile(Scanner scan, ArrayList<TVSet> continents) {
        String fileName;
        int enter = 0;
        System.out.println("Enter the name of your new file");
        fileName = scan.next();
        do {
            FileManager.enterTVSet(scan, continents);
            FileManager.writeJson(continents, fileName);
            System.out.println("\n\tDo you want to enter a new TVSet?");
            System.out.println("1) YES");
            System.out.println("2) NO");
            enter = scan.nextInt();
        } while (enter == 1);
    }
    
    
    private static void printHeader() {
        System.out.println("\n\t...............................");
        System.out.println("\t          TVSets");
        System.out.println("\t...............................");
        System.out.println("\n1) Create Json File");
        System.out.println("2) Delete Data");
        System.out.println("3) Print file");
        System.out.println("4) Modify file");
        System.out.println("5) Delete TVSet");
        System.out.println("6) Leave");
    }
}
