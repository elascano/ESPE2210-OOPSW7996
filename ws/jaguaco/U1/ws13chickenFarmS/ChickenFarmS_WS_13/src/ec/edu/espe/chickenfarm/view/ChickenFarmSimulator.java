package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) {
        System.out.println("\t======================================");
        System.out.println("\t\tJonathan Jaguaco");
        System.out.println("\t\tSetters and Getters");
        System.out.println("\t\tChicken Farm Simulator");
        System.out.println("\t======================================");
 
       //declaration
        //ADT variable name
        Chicken chicken;
                
        int id;
        String name = "";
        int age;
        String color = "";
        boolean  molting;
                       
         //initializaing the chicken
         //creating the instance
         chicken = new Chicken();
         
         System.out.println("Chicken -->" + chicken);
         
         chicken.setId(432);
         chicken.setName("Lucy");
         chicken.setAge(4);
         chicken.setColor("White and Brown");
         chicken.setisMolting(false);
         
         printChicken(chicken);//llamado de la funcion printchicken
         
         //second chicken
        chicken = new Chicken(325, "Lolita", "Black", 2, true);
        printChicken(chicken);
         
        // third chicken
        chicken = new Chicken(584, "Maruja", "Red", 1, true);
        printChicken(chicken);
         
    // new chicken 
    
        Chicken chickenTwo; 
        chickenTwo = new Chicken();
        Scanner sc = new Scanner (System.in);
        System.out.println("\t\t* COMPLETE THE INFORMATION ABOUT THE CHICKEN *");
        
        System.out.println("Id of the chicken:");
        id = sc.nextInt();
        System.out.println("Name of the chicken:");
        name = sc.next();
        System.out.println("Enter the age:");
        age = sc.nextInt();
        System.out.println("Enter the color of the chicken:");
        color = sc.next();
        System.out.println("The chicken is moolting? (true/false)"); 
        molting = sc.nextBoolean();
       
        chickenTwo.setId(id);
        chickenTwo.setName(name);        
        chickenTwo.setAge(age);
        chickenTwo.setColor(color);
        chickenTwo.setisMolting(molting);
        
        printChicken(chickenTwo);
                               
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("\n\n=================================================");
        System.out.println("\t--------------------------------------\t");
        System.out.println(" \t\t! Chicken Data ID:" +  chicken.getId() + " !");
        System.out.println("\t--------------------------------------\t");
        System.out.println("Chicken id: ---> "+ chicken.getId());
        System.out.println("Chicken name: ---> "+ chicken.getName());
        System.out.println("Chicken age: ---> "+ chicken.getAge());
        System.out.println("Chicken color: ---> "+ chicken.getColor());
        System.out.println("Chicken is molting? ---> "+ chicken.getisMolting());
        System.out.println("\n\n=================================================");
    }

    
}
