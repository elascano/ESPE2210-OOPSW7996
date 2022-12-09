
package ec.edu.espe.Ex1CodeSkills_QuirogaFrancisco.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.Ex1CodeSkills_QuirogaFrancisco.model.Continent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class FileManager {
    public static void writeJson(ArrayList<Continent> continents, String fileName) {
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
    
    
    
    public static void enterContinent(Scanner scan, ArrayList<Continent> continents) {
        int id;
        String name;
        String country;
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
    
    public static void deleteJson(String fileName){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your new file");
        fileName = scan.next();
        try {
            FileWriter file = new FileWriter(fileName + ".json");

            file.write("[]");

            file.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        System.out.println("Data deleted succesfully.");
    }
    
    public static int searchContinent(Scanner scan, ArrayList<Continent> continents) {
        int id;
        int j = -1;
        Continent continent;
        System.out.println("Enter the Id of the Continent you want to print: ");
        id = scan.nextInt();
        for (int i = 0; i < continents.size(); i++) {
            continent = continents.get(i);
            if (id == continent.getId()) {
                j = i;
                printContinent(continent);
            }
        }

        if (j == -1) {
            System.out.println("There is no a Continent with that Id");
        }
        
        return j;
    }
    
    public static void updateContinent(int box, ArrayList<Continent> continents, String fileName){
        int id;
        String name;
        String country;
        Scanner scan = new Scanner(System.in);
        Continent continent = new Continent();
        continent = continents.get(box);
        
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
        
        writeJson(continents, fileName);
    }
    
    public static void printContinent(Continent continent) {
        System.out.println("====================================");
        System.out.println("Product Id             \t" + continent.getId());
        System.out.println("====================================");
        System.out.println("Product Name           \t" + continent.getName());
        System.out.println("====================================");
        System.out.println("Product Quantity       \t" + continent.getCountry());
        System.out.println("====================================");;
    }
    
    public static ArrayList<Continent> openFile(ArrayList<Continent> mouses, String fileName) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
       
        
        try
        {
            Reader readFile = Files.newBufferedReader(Paths.get(fileName + ".json"));
            TypeToken<ArrayList<Continent>> type = new TypeToken<ArrayList<Continent>>() {};
            mouses = gson.fromJson(readFile, type.getType());
            readFile.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not Found");
        } catch (IOException ex)
        {
            System.out.println("Empty File");
        }
        return mouses;
    }
    
    public static void printContinents(ArrayList<Continent> continents){
        Continent continent = new Continent();
        for (int i = 0; i < continents.size(); i++) {
            continent = continents.get(i);
            printContinent(continent);
        }
    }
}
