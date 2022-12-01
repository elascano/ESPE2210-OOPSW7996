
package ec.edu.espe.chickenfarm.view;

import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Ariel Rivadeneira");
        System.out.println("setters and getters");
        System.out.println("==================");
        
        System.out.println("abs of -5 --> " + Math.abs(-5));
        
        //primitive data types -> int, float, 
        //user define data types [Abstract data types]-> String, Math, Chicken, ChickenFarm, Egg, Poop
  
        
        
        //declaration
        //ADT varible name
        Chicken chickenOne;
        
        //initializing the chicken
        //create instance
        chickenOne = new Chicken();
        printChicken(chickenOne);
        int id;
        String name = "";
        int age;
        String color = "";
        boolean Ismolting;
        
        //initializing the chicken
        //create the instance
        chickenOne = new Chicken();
        
        System.out.println("chicken class --> " + chickenOne.getClass().getSimpleName());
        
        System.out.println("chicken -->" + chickenOne);

        
        chickenOne.setId(423);
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and Brown");
        chickenOne.setIsMolting(false);
        
        printChicken(chickenOne);
        
        chickenOne = new Chicken(2, "Lolita", "black", 2,true);
        printChicken(chickenOne);
        
        chickenOne.setName("maruja");
        printChicken(chickenOne);
        
        System.out.println("Chicken (from toString) --> " + chickenOne);
        
        System.out.println("=========");
        System.out.println("=========");
        System.out.println("Homework");
        System.out.println("=========");
        System.out.println("=========");
        
        //homework
        Chicken chickenTwo;
        chickenTwo = new Chicken();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("chicken id -->");
        id = scan.nextInt();
        System.out.print("chicken name -->");
        name = scan.next();
        System.out.print("chicken age -->");
        age = scan.nextInt();
        System.out.print("chicken color -->");
        color = scan.next();
        System.out.print("chicken is molting -->");
        Ismolting = scan.nextBoolean();
    }

    private static void printChicken(Chicken chickentwo) {
        System.out.println("---------chicken data---------- ");
        System.out.println("chicken id\t -->"+ chickentwo.getId());
        System.out.println("chicken name\t -->"+ chickentwo.getName());
        System.out.println("chicken age\t -->"+ chickentwo.getAge());
        System.out.println("chicken color\t -->"+ chickentwo.getColor());
        System.out.println("chicken is molting\t -->"+ chickentwo.isIsMolting());
    }
}
