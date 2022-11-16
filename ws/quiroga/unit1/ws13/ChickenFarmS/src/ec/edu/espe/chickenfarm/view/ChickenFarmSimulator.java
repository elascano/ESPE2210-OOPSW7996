/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;


/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Francisco Quiorga");
        System.out.println("setters and getters");
        System.out.println("=======================");
        
        //dataType variable
        
        
        //declaration
        //ADT variable
        Chicken chickenOne;
        Chicken chickenTwo;
        Chicken chickenThree;
        int id;
        String name = new String("");
        int age;
        String color = "";
        boolean IsMolting;
        
        
        //initializing the chicken
        //creating the instance
        chickenOne = new Chicken();
        
        
        chickenOne.setId(432);
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and Brown");
        chickenOne.setIsMolting(false);

        printChicken(chickenOne);
        
        chickenTwo = new Chicken();
        
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
        
        
        chickenTwo.setId(id);
        chickenTwo.setName(name);
        chickenTwo.setAge(age);
        chickenTwo.setColor(color);
        chickenTwo.setIsMolting(IsMolting);
        
        printChicken(chickenTwo);
        
        
        chickenThree = new Chicken();
        printChicken(chickenThree);
        
       
        chickenOne = new Chicken(123, "Pedro", 4, "Black", false);
        printChicken(chickenOne);
        
        System.out.println("from string" + chickenOne);
        
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("-------chicken data------------------");
        System.out.println("chicken --> " + chicken);
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molthing \t--> " + chicken.isIsMolting());
    }
}
