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

    public static void main(String[] args) {
        System.out.println(" Juan Pablo Pinza");
        System.out.println("setters and getters");
        System.out.println("====================");

        //declaration
        //ADT variableName
        Chicken chicken;

        //initializing the chicken / creating the instance.
        chicken = new Chicken();

        System.out.println("chicken -> " + chicken);

        chicken.setId(432);
        chicken.setName("Lola");
        chicken.setAge(3);
        chicken.setColor("Gray");
        chicken.setIsMolting(false);

        System.out.println("chicken id \t-> " + chicken.getId());
        System.out.println("chicken name \t-> " + chicken.getName());
        System.out.println("chicken age \t-> " + chicken.getAge());
        System.out.println("chicken color \t-> " + chicken.getColor());
        System.out.println("chicken is molting \t-> " + chicken.isIsMolting());

        //read from the keyboard the information for a new chicken HW04
        Scanner read = new Scanner(System.in);

        Chicken chicken2;

        chicken2 = new Chicken();
        chicken = new Chicken(153, Lolita, Brown, 3, true);
        
        
                
        System.out.println("Please, type the Chicken's ID: ");
        chicken2.setId(read.nextInt());
        read.nextLine();
        System.out.println("Please, type the Chicken's name: ");
        chicken2.setName(read.nextLine());
        System.out.println("Please, type the Chicken's age: ");
        chicken2.setAge(read.nextInt());
        read.nextLine();
        System.out.println("Please, type the Chicken's color: ");
        chicken2.setColor(read.nextLine());
        System.out.println("Is the Chicken molting? :");
        chicken2.setIsMolting(read.nextBoolean());
        
        System.out.println("chicken 2 id \t-> " + chicken2.getId());
        System.out.println("chicken 2 name \t-> " + chicken2.getName());
        System.out.println("chicken 2 age \t-> " + chicken2.getAge());
        System.out.println("chicken 2 color \t-> " + chicken2.getColor());
        System.out.println("chicken 2 is molting \t-> " + chicken2.isIsMolting());
        
        
        
        

    }
}
