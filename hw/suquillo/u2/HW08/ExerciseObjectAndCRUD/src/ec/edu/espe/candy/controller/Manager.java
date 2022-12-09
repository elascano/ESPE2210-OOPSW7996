package ec.edu.espe.candy.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.candy.model.Fork;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Suquillo Martín, WebMasterTeam , DCCO-ESPE
 */
public class Manager {
    public static void noteJson(ArrayList<Fork> forks, String fileName) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(forks);
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
    
    public static void deleteJson(String fileName){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name your file: ");
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
        System.out.println("It has been successfully removed");
    }
    
    public static int searchFork(Scanner scan, ArrayList<Fork> forks) {
        int id;
        int j = -1;
        Fork fork;
        System.out.println("Enter the ID of the fork do you search: ");
        id = scan.nextInt();
        for (int i = 0; i < forks.size(); i++) {
            fork = forks.get(i);
            if (id == fork.getId()) {
                j = i;
                printFork(fork);
            }
        }

        if (j == -1) {
            System.out.println("Id Not Found");
        }
        
        return j;
    }
    
    public static void updateFork(int box, ArrayList<Fork> forks, String fileName){
        int id;
        String color;
        String material;
        Scanner scan = new Scanner(System.in);
        Fork fork = new Fork();
        fork = forks.get(box);
        
        
        System.out.println("////////////////////////////");
        System.out.println("Enter Id of the Fork: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the color ");
        color = scan.nextLine();
        System.out.println("Enter the material: ");
        material = scan.nextLine();
        System.out.println("////////////////////////////");
        fork.setId(id);
        fork.setColor(color);
        fork.setMaterial(material);

        
        noteJson(forks, fileName);
    }
   
        public static void enterFork(Scanner scan, ArrayList<Fork> forks) {
        int id;
        String color;
        String material;
        Fork fork = new Fork();
        
        System.out.println("////////////////////////////");
        System.out.println("Enter Id of the Fork: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the color ");
        color = scan.nextLine();
        System.out.println("Enter the material: ");
        material = scan.nextLine();
        System.out.println("////////////////////////////");
        fork.setId(id);
        fork.setColor(color);
        fork.setMaterial(material);
        
        forks.add(fork);
    }
        
    public static void printFork(Fork candy) {
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("The ID of your Fork is:        \t" + candy.getId());
        System.out.println("The color of your Fork is:     \t" + candy.getColor());
        System.out.println("The material of your fork is:  \t" + candy.getMaterial());
        System.out.println("//////////////////////////////////////////////////");
    }
    
        public static void printForks(ArrayList<Fork> forks){
        Fork fork = new Fork();
        for (int i = 0; i < forks.size(); i++) {
            fork = forks.get(i);
            printFork(fork);
        }
    }
    
    public static ArrayList<Fork> openFile(ArrayList<Fork> forks, String fileName) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
        
        try
        {
            Reader readFile = Files.newBufferedReader(Paths.get(fileName + ".json"));
            TypeToken<ArrayList<Fork>> type = new TypeToken<ArrayList<Fork>>() {};
            forks = gson.fromJson(readFile, type.getType());
            readFile.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("Sorry, File not Found");
        } catch (IOException ex)
        {
            System.out.println("Empty File");
        }
        return forks;
    }
}