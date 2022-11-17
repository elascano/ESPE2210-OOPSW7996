package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args){
        System.out.println("------------------------------");
        System.out.println("Nicolay Chillo");
        System.out.println("Setters and Getters");
        System.out.println("------------------------------");
        System.out.println("        |Chicken Data|        ");
        System.out.println("------------------------------");
        
        Chicken chickenOne;
        int numberOfFeathers;
        int id;
        String name;
        int age;
        String color;
        boolean molting;
        
        chickenOne = new Chicken();
        numberOfFeathers = 5;
   
        System.out.println("The number of feathers is -->" + numberOfFeathers);
        
        System.out.println("chicken -->" + chickenOne);
        
        chickenOne.setId(432);
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and Brown");
        chickenOne.setIsMolting(false);
        
        printChicken(chickenOne);
        
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("      |Enter Infotmation|      ");
        System.out.println("------------------------------");  
        
        Chicken chickenTwo;
        chickenTwo = new Chicken();

        System.out.println("What is the ID of the chicken?");
        id = scan.nextInt();
        System.out.println("What is the Name of the chicken?");
        name = scan.next();
        System.out.println("What is the Age of the chicken?");
        age = scan.nextInt();
        System.out.println("What is the Color of the chicken?");
        color = scan.next();
        System.out.println("Is chicken Molting? (true/false)");
        molting = scan.nextBoolean();
        
        chickenTwo.setId(id);
        chickenTwo.setName(name); 
        chickenTwo.setAge(age);
        chickenTwo.setColor(color);
        chickenTwo.setIsMolting(molting);
        
        System.out.println("---------------------------------");
        System.out.println("        |Chicken Data|        ");
        System.out.println("---------------------------------");
        printChicken(chickenTwo);
        
        Chicken chickenThree;
        chickenThree = new Chicken(121,"Josefina","white",1,true);

        System.out.println("---------------------------------");
        System.out.println("        |Chicken Data|        ");       
        System.out.println("---------------------------------");
        printChicken(chickenThree);
        
        chickenThree.setName("Jason");
        System.out.println("---------------------------------");
        System.out.println("        |Chicken Data|        ");       
        System.out.println("---------------------------------");
        printChicken(chickenThree);
        System.out.println("---------------------------------");
        
        System.out.println("chicken (from toString)-->" + chickenThree);        
    }
       
    private static void printChicken(Chicken chicken) {
        System.out.println("chicken Id \t-->" + chicken.getId());
        System.out.println("chicken Name \t-->" + chicken.getName());
        System.out.println("chicken Age \t-->" + chicken.getAge());
        System.out.println("chicken Color \t-->" + chicken.getColor());
        System.out.println("chicken is Molting -->" + chicken.isIsMolting());
    }
}
