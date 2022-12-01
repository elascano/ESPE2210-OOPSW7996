
package ec.edu.espe.chickenfarm.view;

import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import com.google.gson.Gson;
import java.util.InputMismatchException;



/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList <Chicken> chickens = new ArrayList<Chicken>(); 
        Chicken chicken = new Chicken();
        int option;
        int position[] = new int[1];
        position[0] = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("Ariel Rivadeneira");
            System.out.println("=========");
            System.out.println("=========");
            System.out.println("Homework 06");
            System.out.println("=========");
            System.out.println("=========");
            System.out.println("==========Menu==========");
            System.out.println("1.Enter a chicken");
            System.out.println("2.Exit");
            try {
                System.out.println("Choose an option");
                option = scan.nextInt();
                System.out.println("");
                switch (option) {
                    case 1:
                        dataChicken(chickens, chicken, position);
                        saveJsonData(chickens.get(position[0]));
                        position[0]++;
                        break;
                    case 2:
                        System.out.println("JSON file created successfully");
                        System.out.println("Good bye! :)");
                        exit = true;
                        break;
                    default:
                        System.out.println("the option doesn't exist, please try again");
                        break;

                }
            } catch (InputMismatchException exepcion) {
                exepcion.printStackTrace (System.out);
                scan.next();
            }
        }
}

    private static void dataChicken(ArrayList<Chicken> chickens, Chicken chicken, int position[]) {
        int id;
        String name = "";
        int age;
        String color = "";
        boolean isMolting;
        boolean equal_id;
        Scanner scan = new Scanner(System.in);
        do{
        equal_id=false;
        System.out.println("------NEW DATA------");
        System.out.print("chicken id -->");
        id = scan.nextInt();
        scan.nextLine();
            for (int i = 0; i < chickens.size(); i++) {
                if(chickens.get(i).getId()==id){
            System.out.println("This id was already registered");
            equal_id=true;
                }
            }
        }while(equal_id == true );
        System.out.print("chicken name -->");
        name = scan.next();
        System.out.print("chicken age -->");
        age = scan.nextInt();
        System.out.print("chicken color -->");
        color = scan.next();
        System.out.print("chicken is molting (true/false)-->");
        isMolting = scan.nextBoolean();
         
        chicken = new Chicken(id, name, color, age, isMolting);
        chickens.add(position[0], chicken);
        
        try {
            Thread.sleep(5*20*10);
            System.out.println("=============================");
        
            System.out.println("Data saved successfully!");
        
            System.out.println("=============================");
            Thread.sleep(5*20*10);
        } catch (InterruptedException exepcion) {
            exepcion.printStackTrace (System.out);
        }
        
    }
    
private static void saveJsonData(Chicken chicken) {
    File chickenList = new File("chickens.json");
    Gson gson = new Gson();
    String json = gson.toJson(chicken);
        
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(chickenList, true)); 
            writer.println("");
            writer.print(json);
            writer.close();
        } catch (FileNotFoundException exepcion) {
            exepcion.printStackTrace (System.out); 
        } catch (IOException exepcion) {
            exepcion.printStackTrace (System.out);
        }
    }
}

   