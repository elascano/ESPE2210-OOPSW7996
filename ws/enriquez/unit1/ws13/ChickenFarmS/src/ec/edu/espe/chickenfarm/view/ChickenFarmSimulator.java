/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Sheylee Enriquez");
        System.out.println("Setters and getters");
        System.out.println("====================================");

        //declaration
        //ADT variableName
        Chicken chicken;

        //initializing the chicken
        //creating the instance
        chicken = new Chicken();

        System.out.println("chicken \t--> " + chicken);

        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);

        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
        System.out.println("\t====================");

        //datatype variable
        int numberOfFeathers;
        int id;
        String name = new String("");
        int age;
        String color = new String("");
        boolean molting;
        
        numberOfFeathers = 5;
        System.out.println("The number of feathers is --> " + numberOfFeathers);

        chicken = new Chicken();
        System.out.println("Chicken is of class --> " + chicken.getClass().getSimpleName());
        System.out.println("Chicken --> " + chicken);
        
        //Printnig whithout data
        printChicken(chicken);

        //Using setters
        chicken.setId(1);
        chicken.setName("Maruja");
        chicken.setAge(5);
        chicken.setColor("Brown");
        chicken.setIsMolting(true);
        printChicken(chicken);
        
        //Using data from Keyboard
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Type chicken id: ");
        id = scan.nextInt();
        System.out.print("Type chicken name: ");
        name = scan.next();
        System.out.print("Type chicken age: ");
        age = scan.nextInt();
        System.out.print("Type chicken color: ");
        color = scan.next();
        System.out.print("Type chicken molting: ");
        molting = scan.nextBoolean();

        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(molting);

        printChicken(chicken);
        
        //Using constructors
        chicken = new Chicken(3, "Lolita", "Black", 2, true);

        printChicken(chicken);
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("===================");
        System.out.println("           Chicken " + chicken.getId() + " Information");
        System.out.println("***");
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken molting \t--> " + chicken.isIsMolting());
        System.out.println("===================");
        System.out.println(chicken);
    }
}