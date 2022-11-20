/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import static ec.edu.espe.chickenfarm.controller.FilesControl.*;
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) {
        var fileName = "chickens.csv";
        var fileToLoadName = "chickensLoad.csv";
        int id;
        //Using data from Keyboard
        Scanner scan = new Scanner(System.in);

        System.out.println("\t========================");
        System.out.println("\t     Cristian Acalo");
        System.out.println("\t Chicken Farm Simulator");
        System.out.println("\t========================");
        
        int menuOption;
        try {
            //Principal Menu
            do {
                System.out.println("\n***************************************");
                System.out.println("*                MENU                 *");
                System.out.println("***************************************");
                System.out.println("1.\tAdd a chicken");
                System.out.println("2.\tSearch a chicken");
                System.out.println("3.\tPrint actual chickens");
                System.out.println("4.\tLoad data from a csv");
                System.out.println("0.\tExit\n");
                System.out.print("===> Select an option: ");

                menuOption = scan.nextInt();

                switch (menuOption) {
                    case 1 -> addChicken();
                    case 2 -> {
                        try {
                            System.out.print("..:: Enter chicken: ");
                            id = scan.nextInt();
                            searchChicken(fileName,id);
                        } catch (Exception e) {
                            System.out.println("..:: PLEASE ENTER A VALID DATA :::..");
                        }
                    }
                    case 3 -> readFile(fileName);
                    case 4 -> loadFile(fileToLoadName);
                    case 0 -> System.out.println("\n..:: YOU HAVE SUCCESSFULLY EXTED ::..\n");
                    default -> System.out.println("\n*** Invalidated option, try again ***\n");
                }
            } while (menuOption != 0);
            
        } catch (Exception e) {
            System.out.println("\n..:: NO VALID DATA, CLOSING PROGRAM... ::..");
        }
        
    }

    public static void addChicken() {
        Scanner scan = new Scanner(System.in);
        var fileName = "chickens.csv";
        Chicken chicken;
        
        chicken = new Chicken();
        
        int numberOfFeathers;
        int id;
        String name = new String("");
        int age;
        String color = new String("");
        String moltingReadable = new String ("");
        boolean molting=false;
        try {
            System.out.print("..:: Enter chicken id: ");
            id = scan.nextInt();
            System.out.print("..:: Enter chicken name: ");
            name = scan.next();
            System.out.print("..:: Enter chicken color: ");
            color = scan.next();
            System.out.print("..:: Enter chicken age: ");
            age = scan.nextInt();
            System.out.print("..:: Enter chicken molting (yes/no): ");
            moltingReadable = scan.next();
            if ("yes".equals(moltingReadable.toLowerCase())) {
                molting = true;
            } else if ("no".equals(moltingReadable.toLowerCase())) {
                molting = false;
            }
            chicken = new Chicken(id, name, color, age, molting);
            printChicken(chicken);
            editFile(fileName, chicken);
        } catch (Exception e) {
            System.out.println("\n..:: PLEASE ENTER A VALID DATA ::..\n");
        } 
   }
    
    private static void printChicken(Chicken chicken) {
        System.out.println("\n\n***********************************************");
        System.out.println("           Chicken " + chicken.getId() + " Information");
        System.out.println("***********************************************");
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken molting \t--> " + chicken.isIsMolting());
        System.out.println("***********************************************");
    }
}