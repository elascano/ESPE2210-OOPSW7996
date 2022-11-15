/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    //Aquí podemos declarar variables estáticas
    
    
    public static void main(String[] args) {
        System.out.println(" Juan Pablo Pinza");
        System.out.println("WS13 Constructors");
        System.out.println("====================");

        //declaration
        //ADT variableName
        Chicken chicken;

        int id = 0;
        String name = new String("");
        int age = 0;
        String color = new String("");
        boolean molting; 

        //initializing the chicken / creating the instance.
        chicken = new Chicken();

        //Set Values
        chicken.setId(432);
        chicken.setName("Lola");
        chicken.setAge(3);
        chicken.setColor("Gray");
        chicken.setIsMolting(false);

        printChicken(chicken);

        //read from the keyboard the information for a new chicken HW04
        //CREATION OF A NEW CHICKEN
        Chicken chicken2;
        chicken2 = new Chicken();

        //Scanner Option to get keyboard data
        Scanner read = new Scanner(System.in);

        // READ FROM THE KEYBOARD
        System.out.print("Please, type the Chicken's ID: ");
        id = read.nextInt();
        read.nextLine();

        System.out.print("Please, type the Chicken's name: ");
        name = read.nextLine();
        
        System.out.print("Please, type the Chicken's age: ");
        age = read.nextInt();
        read.nextLine();
        
        System.out.print("Please, type the Chicken's color: ");
        color = read.nextLine();
        
        System.out.print("Is the Chicken molting? :");
        molting = read.nextBoolean();
        
        
        chicken2.setId(id);
        chicken2.setName(name);
        chicken2.setAge(age);
        chicken2.setColor(color);
        chicken2.setIsMolting(molting);

        printChicken(chicken2);
       


    }

    private static void printChicken(Chicken chicken) {
        //Print the values.
        System.out.println("== CHICKEN "+ chicken.getId() + " ==");
        System.out.println("chicken id \t-> " + chicken.getId());
        System.out.println("chicken name \t-> " + chicken.getName());
        System.out.println("chicken age \t-> " + chicken.getAge());
        System.out.println("chicken color \t-> " + chicken.getColor());
        System.out.println("chicken is molting \t-> " + chicken.isIsMolting());
    }
}
