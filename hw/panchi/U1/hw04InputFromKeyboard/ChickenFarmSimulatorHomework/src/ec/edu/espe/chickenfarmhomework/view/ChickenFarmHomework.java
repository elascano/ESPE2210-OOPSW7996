package ec.edu.espe.chickenfarmhomework.view;

import ec.edu.espe.chickenfarmhomework.model.Chicken;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ChickenFarmHomework {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        System.out.println("Allan Panchi");
        System.out.println("Homework 05");
        System.out.println("Menu options");
        int option;
        int position = 0;
        
        Chicken[] chicken = new Chicken[100];
        
        for (int i = 0; i < 100; i++) {
            chicken[i] = new Chicken();
        }
        
        
        do{
            System.out.println("============================");
            System.out.println("Read and choose and option");
            System.out.println("1. Enter a chicken");
            System.out.println("2. Print the chicken");
            System.out.println("3. Save chicken data in a file");
            System.out.println("4. Exit");
            System.out.println("Please, enter a number:");
            option = sc.nextInt();
             
            while(option < 1 ^ option > 4) {
                System.out.println("Please enter a valid number");
                option = sc.nextInt();
            }
            switch(option){
                case 1 -> {
                    
                    enterChicken(chicken[position]);
                    position++;
                    
                    break;
               }
                case 2 -> {        
                    
                    for (int i = 0; i < position; i++) {
                    
                        printChicken(chicken[i]);
                        
                    }
                    
                    break;
                }
                case 3 -> {
                    
                    chickenFile(position, chicken);
                    
                    break;
                }
                case 4 -> {
                    break;
                }
            }
        }while(option!=4);
    }

    private static void chickenFile(int i, Chicken[] chicken) {
        try
        {
            FileWriter file = new FileWriter("Chickenlist.csv");
            file.write("Id;Name;Age;Color;Molting");
            for (int j = 0; j < i; j++)
            {
                String id = String.valueOf(chicken[j].getId());
                String age = String.valueOf(chicken[j].getAge());
                String isMolting = String.valueOf(chicken[j].isIsMolting());
                
                file.write("\n");
                file.write(id);
                file.write(";");
                file.write(chicken[j].getName());
                file.write(";");
                file.write(age);
                file.write(";");
                file.write(chicken[j].getColor());
                file.write(";");
                file.write(isMolting);
            }
            file.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    private static void enterChicken(Chicken chicken) {
        int id;
        String name = new String("");
        int age;
        String color = "";    
        boolean Ismolting;
        System.out.print("Chicken's Id:");
        id = sc.nextInt();
        System.out.print("Chicken's name:");
        name = sc.next();
        System.out.print("Chicken's age:");
        age = sc.nextInt();
        System.out.print("Chicken's color:");
        color = sc.next();                
        System.out.print("Chicken's molting:");
        Ismolting = sc.nextBoolean();
        chicken.setId(id);                
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(Ismolting);
    }
    
    private static void printChicken(Chicken chicken) {
        System.out.println("================================1");
        System.out.println("chicken id -->" + chicken.getId());
        System.out.println("chicken name -->" + chicken.getName());
        System.out.println("chicken age -->" + chicken.getAge());
        System.out.println("chicken color -->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());
    }
}
