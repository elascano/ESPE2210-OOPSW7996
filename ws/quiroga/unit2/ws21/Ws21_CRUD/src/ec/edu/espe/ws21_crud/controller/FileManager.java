/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.ws21_crud.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.ws21_crud.model.TVSet;
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
    
    public static void writeJson(ArrayList<TVSet> tvSets, String fileName) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(tvSets);
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
    
    public static void enterTVSet(Scanner scan, ArrayList<TVSet> tvSets) {
        int id;
        String tvBrand;
        String remoteBrand;
        TVSet tvSet = new TVSet();
        System.out.println("=============================");
        System.out.println("Enter the Id of the TVSet: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the Brand of the TV: ");
        tvBrand = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the Brand of the Remote Control: ");
        remoteBrand = scan.nextLine();
        tvSet.setId(id);
        tvSet.setTvBrand(tvBrand);
        tvSet.setRemoteBrand(remoteBrand);
        
        tvSets.add(tvSet);
    }
    
    public static void deleteJson(String fileName){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to delete");
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
    
    public static int searchTVSet(Scanner scan, ArrayList<TVSet> tvSets) {
        int id;
        int box = -1;
        TVSet tvSet;
        System.out.println("Enter the Id of the TVSet you want to print: ");
        id = scan.nextInt();
        for (int i = 0; i < tvSets.size(); i++) {
            tvSet = tvSets.get(i);
            if (id == tvSet.getId()) {
                box = i;
                printTVSet(tvSet);
            }
        }

        if (box == -1) {
            System.out.println("There is no a TVSet with that Id");
        }
        
        return box;
    }
    
    public static void updateTVSet(int box, ArrayList<TVSet> tvSets, String fileName){
        int id;
        String tvBrand;
        String remoteBrand;
        Scanner scan = new Scanner(System.in);
        TVSet tvSet = new TVSet();
        tvSet = tvSets.get(box);
        
        System.out.println("\n=============================");
        System.out.println("Enter the new Id of the TVSet: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("===============================");
        System.out.println("Enter the new Brand of the TV: ");
        tvBrand = scan.nextLine();
        System.out.println("===================================");
        System.out.println("Enter the new Brand of the remote control: ");
        System.out.println("====================================");
        remoteBrand = scan.nextLine();
        tvSet.setId(id);
        tvSet.setTvBrand(tvBrand);
        tvSet.setRemoteBrand(remoteBrand);
        
        writeJson(tvSets, fileName);
        
        System.out.println("\nTVSet Modified succesfully.");
    }
    
    public static void printTVSet(TVSet tvSet) {
        System.out.println("====================================");
        System.out.println("TVSet Id             \t" + tvSet.getId());
        System.out.println("====================================");
        System.out.println("TV Brand           \t" + tvSet.getTvBrand());
        System.out.println("====================================");
        System.out.println("Remote Brand       \t" + tvSet.getRemoteBrand());
        System.out.println("====================================\n");;
    }
    
    public static ArrayList<TVSet> openFile(ArrayList<TVSet> tvSets, String fileName) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
       
        
        try
        {
            Reader readFile = Files.newBufferedReader(Paths.get(fileName + ".json"));
            TypeToken<ArrayList<TVSet>> type = new TypeToken<ArrayList<TVSet>>() {};
            tvSets = gson.fromJson(readFile, type.getType());
            readFile.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("File not Found");
        } catch (IOException ex)
        {
            System.out.println("File not found");
        }
        return tvSets;
    }
    
    public static void printContinents(ArrayList<TVSet> tvSets){
        TVSet tvSet = new TVSet();
        for (int i = 0; i < tvSets.size(); i++) {
            tvSet = tvSets.get(i);
            printTVSet(tvSet);
        }
    }
    
    public static void deleteTVSet(ArrayList<TVSet> tvSets, String fileName){
        int box = -1;
        Scanner scan = new Scanner(System.in);
        box = searchTVSet(scan, tvSets);
        if (box > -1) {
            tvSets.remove(box);
            System.out.println("\nTVSet removed");
        }
        writeJson(tvSets, fileName);
        
    }
    
}
