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

        System.out.println("\n===============HOMEWORK 04===============\n");
        System.out.println("Sheylee Enriquez");
        System.out.println("Setters and getters\n");
        System.out.println("===========================================");
        System.out.println("Please enter the chicken information.");
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChicken ID: ");
        chicken.setId(sc.nextInt());

        sc.nextLine();
        System.out.println("\nChicken name: ");
        chicken.setName(sc.nextLine());

        System.out.println("\nChicken age: ");
        chicken.setAge(sc.nextInt());

        sc.nextLine();
        System.out.println("\nChicken color: ");
        chicken.setColor(sc.nextLine());

        System.out.println("\nChicken is molting (true/false): ");
        chicken.setIsMolting(sc.nextBoolean());
        
        System.out.println("\n==========Chicken Information============\n");
        System.out.println("Chicken ID:\t\t --> " + chicken.getId());
        System.out.println("Chicken name:\t\t --> " + chicken.getName());
        System.out.println("Chicken age:\t\t --> " + chicken.getAge());
        System.out.println("Chicken color:\t\t --> " + chicken.getColor());
        System.out.println("Chicken is molting:\t --> " + chicken.isIsMolting());
    }
}
