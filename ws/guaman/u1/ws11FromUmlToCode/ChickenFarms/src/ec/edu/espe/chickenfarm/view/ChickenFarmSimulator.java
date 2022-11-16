package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
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
        Chicken chickenOne;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of  feathers is --> " + numberOfFeathers);
        
        //initializing  the chicken
        //creating the instance
        chickenOne = new Chicken();
        
        System.out.println("chicken --> " + chickenOne);
        
        chickenOne.setId(432);
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and Brown");
        chickenOne.setIsMolting(false);
        
        printChicken(chickenOne);
        
        //chickenTwo
        
        Scanner read = new Scanner(System.in);
        
        Chicken chickenTwo;
        
        chickenTwo = new Chicken();
        
        System.out.println("chicken2 --> " + chickenTwo);
        
        System.out.print("type chicken's id : ");
        chickenTwo.setId(read.nextInt());
        read.nextLine();
        System.out.print("type chicken's name : ");
        chickenTwo.setName(read.nextLine());
        System.out.print("type chicken's age : ");
        chickenTwo.setAge(read.nextInt());
        read.nextLine();
        System.out.print("type chicken's color : ");
        chickenTwo.setColor(read.nextLine());
        System.out.print("type chicken is molting: ");
        chickenTwo.setIsMolting(read.nextBoolean());
                
       printChicken(chickenTwo);
        
        
    }   

    private static void printChicken(Chicken chicken) {
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
    }
    
}
