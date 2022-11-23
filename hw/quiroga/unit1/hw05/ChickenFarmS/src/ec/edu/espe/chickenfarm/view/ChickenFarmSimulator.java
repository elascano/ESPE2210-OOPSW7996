/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int id;
        String name = new String("");
        int age;
        String color = "";
        boolean IsMolting;
        boolean leave = false;
        int option;
        int position = 0;
        
        Chicken chickens[] = new Chicken[100];
        
        for (int i = 0; i < 100; i++){
          chickens[i] = new Chicken();
        }

        
        
        while (!leave) {

            System.out.println("===== MENU =====");
            System.out.println("1) Enter Chicken");
            System.out.println("2) Print Chicken");
            System.out.println("3) Print all entered Chickens");
            System.out.println("4) Save Chicken in File");
            System.out.println("5) Leave");

            try {

                System.out.println("Enter an option: ");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {
                        
                        enterChicken(chickens[position], scan);
                        position++;
                    }
                    case 2 -> {
                        searchChicken(scan, chickens);
                    }
                    case 3 ->{
                        for (int i = 0; i < position; i++) {
                            printChicken(chickens[i]);
                        }
                    }
                    case 4 ->{
                        saveChicken(chickens,position);
                        System.out.println("The Chicken List has been saved!");
                    }
                    case 5 ->
                        leave = true;
                    default ->
                        System.out.println("Only numbers from 1 to 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scan.next();
            }
        }

    }
    
    
    private static void saveChicken(Chicken[] chickens, int position) {

        try
        {
            FileWriter file = new FileWriter("Chicken File.csv");
            file.write("Id;Name;Age;Color;isMolting");
            for (int i = 0; i < position; i++)
            {
                String id = String.valueOf(chickens[i].getId());
                String age = String.valueOf(chickens[i].getAge());
                String isMolting = String.valueOf(chickens[i].isIsMolting());

                file.write("\n");
                file.write(id);
                file.write(";");
                file.write(chickens[i].getName());
                file.write(";");
                file.write(age);
                file.write(";");
                file.write(chickens[i].getColor());
                file.write(";");
                file.write(isMolting);
            }

            file.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    

    private static void searchChicken(Scanner scan, Chicken[] chickens) {
        int id;
        int j = -1;
        System.out.println("Enter the Id of the chicken you want to print: ");
        id = scan.nextInt();
        for (int i = 0; i < 99; i++) {
            if (id == chickens[i].getId()) {
                j = i;
                printChicken(chickens[j]);
            }
        }
        
        if (j == -1) {
            System.out.println("There is no a Chicken with that Id");
        }
    }

    private static void enterChicken(Chicken chicken, Scanner scan) {
        int id;
        String name;
        int age;
        String color;
        boolean IsMolting;
        
        System.out.println("Digit the Id of the chicken: ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.println("Digit the name of the chicken: ");
        name = scan.nextLine();
        System.out.println("Digit the age of the chicken: ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("Digit the color of the chicken: ");
        color = scan.nextLine();
        System.out.println("Is the chicken molting? (True or False): ");
        IsMolting = scan.nextBoolean();

        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(IsMolting);
        
    }

    private static void printChicken(Chicken chicken){
        System.out.println("======== CHICKEN " + chicken.getId() + " DATA =================");
        System.out.println("Chicken name \t--> " + chicken.getName());
        System.out.println("Chicken age \t--> " + chicken.getAge());
        System.out.println("Chicken color \t--> " + chicken.getColor());
        System.out.println("Chicken is molthing \t--> " + chicken.isIsMolting());
        System.out.println("=====================================================");
    }
    
}


