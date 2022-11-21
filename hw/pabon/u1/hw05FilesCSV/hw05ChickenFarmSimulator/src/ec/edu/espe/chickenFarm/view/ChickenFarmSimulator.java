package ec.edu.espe.chickenFarm.view;

import ec.edu.espe.chickenFarm.model.Chicken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */
public class ChickenFarmSimulator {
   
      public static void main(String[] args) throws IOException {
          
        Chicken chicken;
        chicken = new Chicken();
        int option = 0;
        Scanner scan = new Scanner(System.in);
        
        createFile("Chicken.csv");
        
        System.out.println("== WELCOME TO THE FARM SIMULATOR ==");
        
        do{
          System.out.println(" \nSelect the option you want to do");
          System.out.println("(Type a number from 1 to 3)");
          System.out.println("1. ADD CHICKEN");
          System.out.println("2. READ LIST OF CHICKENS");
          System.out.println("3. EXIT");
          
          option = scan.nextInt();
          
          switch(option){
                case 1:
    
                    writeFile("Chicken.csv","====CHICKEN==== ");
                    System.out.println("\n-Chicken ID:");
                    String id = scan.next();
                    writeFile("Chicken.csv","ID: "+ id);
                    
                    System.out.println("-Chicken name:");
                    String name = scan.next();               
                    writeFile("Chicken.csv", "Name: "+name);
                    
                    System.out.println("-Chicken age:");
                    String age = scan.next();
                    writeFile("Chicken.csv", "Age: "+age);
                    
                    System.out.println("-Chicken color:");
                    String color = scan.next();
                    writeFile("Chicken.csv", "Color: "+color);
 
                    System.out.println("-Chicken is molting?:");
                    String setIsMolting = scan.next();
                    writeFile("Chicken.csv", "Is Molting?: "+setIsMolting);
                    
                    writeFile("Chicken.csv", "----------------------");
                   break;
                   
                case 2:
                    System.out.println("\nList of chickens:");
                   readFile("Chicken.csv");
                   break;
                   
                case 3:
                   break;
                }
            }while(option!=3);              
    }
     
public static void createFile(String fileName) {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(archive);
            exit.close();
           // System.out.println("The file is created");
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        }      
    } 

public static void writeFile(String fileName , String contents) throws IOException {
        File archive = new File(fileName);
        try {
            PrintWriter exit = new PrintWriter(new FileWriter(archive, true));
            exit.println(contents);
            exit.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
     }

public static void readFile(String fileName) {
        File archive = new File(fileName);
        try {
            BufferedReader entry = new BufferedReader(new FileReader(archive));
            String lectura = entry.readLine();
            while(lectura!=null){
                System.out.println(lectura);
                lectura = entry.readLine();
            }
            entry.close();
        } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }   
    }
}