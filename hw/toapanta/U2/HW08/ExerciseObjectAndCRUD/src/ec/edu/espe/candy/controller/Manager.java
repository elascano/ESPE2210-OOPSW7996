package ec.edu.espe.candy.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.candy.model.PairOfShoes;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Manager {
    public static void noteJson(ArrayList<PairOfShoes> pairOfShoess, String fileName) {
        Scanner scan = new Scanner(System.in);
        String jsonStructure = new Gson().toJson(pairOfShoess);
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
    
    public static int searchPairOfShoess(Scanner scan, ArrayList<PairOfShoes> printpairOfShoess) {
        int id;
        int j = -1;
        PairOfShoes pairOfShoes;
        System.out.println("Enter the ID of the fork do you search: ");
        id = scan.nextInt();
        for (int i = 0; i < printpairOfShoess.size(); i++) {
            pairOfShoes = printpairOfShoess.get(i);
            if (id == pairOfShoes.getId()) {
                j = i;
                printpairOfShoess(pairOfShoes);
            }
        }

        if (j == -1) {
            System.out.println("Id Not Found");
        }
        
        return j;
    }
    
    public static void updatePairOfShoess(int box, ArrayList<PairOfShoes> pairOfShoess, String fileName){
        int id;
        String color;
        String material;
        Scanner scan = new Scanner(System.in);
        PairOfShoes printpairOfShoes = new PairOfShoes();
        printpairOfShoes = pairOfShoess.get(box);
        
        
        System.out.println("////////////////////////////");
        System.out.println("Enter Id of the Fork: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the color ");
        color = scan.nextLine();
        System.out.println("Enter the material: ");
        material = scan.nextLine();
        System.out.println("////////////////////////////");
        printpairOfShoes.setId(id);
        printpairOfShoes.setColor(color);
        printpairOfShoes.setMaterial(material);

        
        noteJson(pairOfShoess, fileName);
    }
   
        public static void enterpairOfShoess(Scanner scan, ArrayList<PairOfShoes> forks) {
        int id;
        String color;
        String material;
        PairOfShoes pairOfShoes = new PairOfShoes();
        
        System.out.println("////////////////////////////");
        System.out.println("Enter Id of the Fork: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the color ");
        color = scan.nextLine();
        System.out.println("Enter the material: ");
        material = scan.nextLine();
        System.out.println("////////////////////////////");
        pairOfShoes.setId(id);
        pairOfShoes.setColor(color);
        pairOfShoes.setMaterial(material);
        
        forks.add(pairOfShoes);
    }
        
    public static void printpairOfShoess(PairOfShoes candy) {
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("The ID of your pair Of Shoes is:        \t" + candy.getId());
        System.out.println("The color of your pair Of Shoes is:     \t" + candy.getColor());
        System.out.println("The material of your pair Of Shoes is:  \t" + candy.getMaterial());
        System.out.println("//////////////////////////////////////////////////");
    }
    
        public static void printpairOfShoess(ArrayList<PairOfShoes> pairOfShoess){
        PairOfShoes pairOfShoes = new PairOfShoes();
        for (int i = 0; i < pairOfShoess.size(); i++) {
            pairOfShoes = pairOfShoess.get(i);
            printpairOfShoess(pairOfShoes);
        }
    }
    
    public static ArrayList<PairOfShoes> openFile(ArrayList<PairOfShoes> pairOfShoess, String fileName) {
        Gson gson = new Gson();
        Scanner scan = new Scanner(System.in);
        
        try
        {
            Reader readFile = Files.newBufferedReader(Paths.get(fileName + ".json"));
            TypeToken<ArrayList<PairOfShoes>> type = new TypeToken<ArrayList<PairOfShoes>>() {};
            pairOfShoess = gson.fromJson(readFile, type.getType());
            readFile.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("Sorry, File not Found");
        } catch (IOException ex)
        {
            System.out.println("Empty File");
        }
        return pairOfShoess;
    }
}