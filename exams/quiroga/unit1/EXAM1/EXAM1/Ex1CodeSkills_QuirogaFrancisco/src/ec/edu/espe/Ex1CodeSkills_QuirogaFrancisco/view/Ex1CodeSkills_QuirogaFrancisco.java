/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.Ex1CodeSkills_QuirogaFrancisco.view;
import ec.edu.espe.Ex1CodeSkills_QuirogaFrancisco.controller.FileManager;
import ec.edu.espe.Ex1CodeSkills_QuirogaFrancisco.model.Continent;
import java.util.*;
import java.io.*;
import com.google.gson.Gson;
import static ec.edu.espe.Ex1CodeSkills_QuirogaFrancisco.controller.FileManager.printContinent;



/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Ex1CodeSkills_QuirogaFrancisco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Continent> continents = new ArrayList<Continent>();
        Continent continent = new Continent();
        String fileName;
        fileName = "";
        boolean leave2 = false;
        int option2;
        int box;
        box = -1;

        while (!leave2) {

            printHeader();

            try {

                System.out.print("> Please, Select an Option: ");
                option2 = scan.nextInt();

                switch (option2) {
                    case 1 -> {
                        crateFile(scan, continents);
                    }
                    case 2 -> {
                        FileManager.deleteJson(fileName);
                    }
                    case 3 -> {
                        System.out.println("Enter the name of the file you want to open: ");
                        fileName = scan.next();
                        continents.clear();
                        continents = FileManager.openFile(continents, fileName);
                        FileManager.printContinents(continents);
                        
                    }
                    case 4 -> {
                        System.out.println("Enter the name of the file you want to open: ");
                        fileName = scan.next();
                        continents.clear();
                        continents = FileManager.openFile(continents, fileName);
                        box = FileManager.searchContinent(scan, continents);
                        FileManager.updateContinent(box, continents, fileName);
                    }
                    case 5 -> {
                        System.out.println("Enter the name of the file you want to open: ");
                        fileName = scan.next();
                        continents.clear();
                        continents = FileManager.openFile(continents, fileName);
                        FileManager.deleteContinent(continents, fileName);
                    }
                    case 6 -> {
                        leave2 = true;

                    }
                    default -> {
                        System.out.println("\n\tONLY numbers from 1 to 2!!!");
                        System.out.println("\n\tPLEASE, ENTER AGAIN: ");
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("\n\tYou must enter a number");
                scan.next();
            }
        }

    }

    private static void crateFile(Scanner scan, ArrayList<Continent> continents) {
        String fileName;
        int enter = 0;
        System.out.println("Enter the name of your new file");
        fileName = scan.next();
        do {
            FileManager.enterContinent(scan, continents);
            FileManager.writeJson(continents, fileName);
            System.out.println("\n\tDo you want to enter a new continent?");
            System.out.println("1) YES");
            System.out.println("2) NO");
            enter = scan.nextInt();
        } while (enter == 1);
    }
    
    
    private static void printHeader() {
        System.out.println("\n\t...............................");
        System.out.println("\t          CONTINENTS");
        System.out.println("\t...............................");
        System.out.println("\n1) Create Json File");
        System.out.println("2) Delete Data");
        System.out.println("3) Print file");
        System.out.println("4) Modify file");
        System.out.println("5) Delete continent");
        System.out.println("6) Leave");
    }

    

}
