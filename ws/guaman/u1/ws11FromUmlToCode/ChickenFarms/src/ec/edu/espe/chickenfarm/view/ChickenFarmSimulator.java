package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;


/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Alexander Guaman");
        System.out.println("setters and getters");
        System.out.println("===============");
        
        //datatype variable
        int numberOfFeathers;
        
        //declaration
        //ADT variable name
        Chicken chicken;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of  feathers is --> " + numberOfFeathers);
        
        //initializing  the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken --> " + chicken);
        
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
        
        //read from the keyboard the information for a new chicken
        //declare the variables for input
        //read data from keryboard
        //create a new chicken
        //set the values for the chicken with the data that was entered
        //print the information
        
        Scanner read = new Scanner(System.in);
        
        Chicken chicken2;
        
        chicken2 = new Chicken();
        
        System.out.println("chicken2 --> " + chicken2);
        
        System.out.print("type chicken's id 2: ");
        chicken2.setId(read.nextInt());
        read.nextLine();
        System.out.print("type chicken's name 2: ");
        chicken2.setName(read.nextLine());
        System.out.print("type chicken's age 2: ");
        chicken2.setAge(read.nextInt());
        read.nextLine();
        System.out.print("type chicken's color 2: ");
        chicken2.setColor(read.nextLine());
        System.out.print("type chicken 2 is molting: ");
        chicken2.setIsMolting(read.nextBoolean());
                
        System.out.println("chicken 2 id --> " + chicken2.getId());
        System.out.println("chicken 2 name -->" + chicken2.getName());
        System.out.println("chicken 2 age --> " + chicken2.getAge());
        System.out.println("chicken 2 color -->" + chicken2.getColor());
        System.out.println("chicken 2 is molting --> " + chicken2.isIsMolting());
        
        
    }   
    
}
