package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Bernardo Aldaz");
        System.out.println("setters and getters");
        System.out.println("===============");

        int numberOfFeathers;
        
        
        Chicken chicken;
        numberOfFeathers = 5;
        
        System.out.println("The number of feathers is --> "+ numberOfFeathers);
        
        
        chicken = new Chicken();
        System.out.println("Chicken --> " + chicken);
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter the id of the chicken:");
        chicken.setId(scan.nextInt());
        
        System.out.println("Enter the name of the chicken:");
        chicken.setName(scan.next());
        
        System.out.println("Enter the age of the chicken:");
        chicken.setAge(scan.nextInt());
        
        System.out.println("Enter the color of the chicken:");
        chicken.setColor(scan.next());
        
        System.out.println("Enter here if your chicken is molting or not:");
        chicken.setIsMolting(scan.nextBoolean());
        
        System.out.println("=================================");
        System.out.println("    Homework 04 Chicken Farm     ");
        System.out.println("=================================");
        
        System.out.println("Id \t :" + chicken.getId());
        System.out.println("Name \t :" + chicken.getName());
        System.out.println("Age \t :" + chicken.getAge());
        System.out.println("Color \t :" + chicken.getColor());
        System.out.println("Molting \t :" + chicken.isIsMolting());
    }
}
