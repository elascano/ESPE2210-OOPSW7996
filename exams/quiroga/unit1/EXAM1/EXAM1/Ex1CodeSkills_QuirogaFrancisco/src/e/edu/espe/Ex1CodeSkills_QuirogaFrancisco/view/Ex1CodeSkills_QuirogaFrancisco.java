/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.edu.espe.Ex1CodeSkills_QuirogaFrancisco.view;

import ec.edu.espe.Ex1CodeSkills_QuirogaFrancisco.model.Continent;
import java.util.*;
import java.io.*;
import com.google.gson.Gson;

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
        boolean leave2 = false;
        int option2;

        while (!leave2) {

            printHeader();

            try {

                System.out.print("> Please, Select an Option: ");
                option2 = scan.nextInt();

                switch (option2) {
                    case 1 -> {
                        int enter = 0;
                        System.out.println("Enter the name of your new file");
                        fileName = scan.next();
                        do {
                            enterContinent(scan, continents);
                            writeJson(continents, fileName);
                            System.out.println("\n\tDo you want to enter a new continent?");
                            System.out.println("1) YES");
                            System.out.println("2) NO");
                            enter = scan.nextInt();
                        } while (enter == 1);
                    }
                    case 2 -> {
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

    private static void printContinent(Continent product) {
        System.out.println("====================================");
        System.out.println("Product Id             \t" + product.getId());
        System.out.println("====================================");
        System.out.println("Product Name           \t" + product.getName());
        System.out.println("====================================");
        System.out.println("Product Quantity       \t" + product.getCountry());
        System.out.println("====================================");;
    }
    
    
    private static void printHeader() {
        System.out.println("\n\t...............................");
        System.out.println("\t          CONTINENTS");
        System.out.println("\t...............................");
        System.out.println("\n1) Create File");
        System.out.println("2) Leave");
    }

    private static void writeJson(ArrayList<Continent> continents, String fileName) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(continents);
        try {
            FileWriter file = new FileWriter(fileName + ".json");

            file.write(jsonStructure);

            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    private static void enterContinent(Scanner scan, ArrayList<Continent> continents) {
        int id;
        String name;
        String country;
        String admissionDate;
        Continent continent = new Continent();
        System.out.println("=============================");
        System.out.println("Enter the Id of the Continent: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the Name of the Continent: ");
        name = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the Country of the Continent: ");
        country = scan.nextLine();
        continent.setId(id);
        continent.setName(name);
        continent.setCountry(country);
        
        continents.add(continent);
    }

}
