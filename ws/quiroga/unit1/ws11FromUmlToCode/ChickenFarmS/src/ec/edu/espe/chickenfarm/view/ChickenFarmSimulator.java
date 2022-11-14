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
        int numberOfFeathers;
        
        //declaration
        //ADT variable
        Chicken chicken;
        
        numberOfFeathers = 5;
        
        //initializing the chicken
        //creating the instance
        chicken= new Chicken();
        
        System.out.println("chicken --> " + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("Chicken id --> " + chicken.getId());
        System.out.println("Chicken name --> " + chicken.getName());
        System.out.println("Chicken age --> " + chicken.getAge());
        System.out.println("Chicken color --> " + chicken.getColor());
        System.out.println("Chicken is molting --> " + chicken.isIsMolting());
        
        System.out.println("Digit the Id of the chicken: ");
        chicken.setId(scan.nextInt());
        scan.nextLine();
        System.out.println("Digit the name of the chicken: ");
        chicken.setName(scan.nextLine());
        System.out.println("Digit the age of the chicken: ");
        chicken.setAge(scan.nextInt());
        scan.nextLine();
        System.out.println("Digit the color of the chicken: ");
        chicken.setColor(scan.nextLine());
        System.out.println("Is the chicken molting? (True or False): ");
        chicken.setIsMolting(scan.nextBoolean());
        
        System.out.println("Chicken id --> " + chicken.getId());
        System.out.println("Chicken name --> " + chicken.getName());
        System.out.println("Chicken age --> " + chicken.getAge());
        System.out.println("Chicken color --> " + chicken.getColor());
        System.out.println("Chicken is molting --> " + chicken.isIsMolting());
    }
}
