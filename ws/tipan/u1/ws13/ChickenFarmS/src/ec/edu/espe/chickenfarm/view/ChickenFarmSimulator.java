
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println ("Reishel Tipan");
        System.out.println ("Setters and getters");
        System.out.println ("===================");
        
        System.out.println("abs of -5 -->" + Math.abs(-5));
        
        //AD variableName
        Chicken chickenOne;
        Chicken chicken;
        
        int id;
        String name = new String("");
        int age;
        String color = "";
        boolean molting;
        
        chicken = new Chicken();
        printChicken(chicken);
        
        chicken = new Chicken(2,"Lolita","Black",2,true);
        printChicken(chicken);
        
        chicken.setName("maruja");
        printChicken(chicken);
        System.out.println("chicken (from toString -->" + chicken);
        
        chickenOne = new Chicken();
        chickenOne.setId(432);
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and Brown");
        chickenOne.setIsMolting(false);
        printChicken(chickenOne);
        
        //Homework
        
        Chicken chickenTwo;
        chickenTwo = new Chicken();
        Scanner sc = new Scanner(System.in);

    
        System.out.println("\n***************************");
        System.out.println("Insert chicken id:");
        id = sc.nextInt();
        System.out.println("Insert chicken name:");
        name = sc.next();
        System.out.println("Insert the age of the chicken:");
        age = sc.nextInt();
        System.out.println("Insert the colors of the chicken:");
        color = sc.next();
        System.out.println("Is chicken molting?(True/False):\t");
        molting = sc.nextBoolean();
        
        chickenTwo.setId(id);
        chickenTwo.setName(name);
        chickenTwo.setAge(age);
        chickenTwo.setColor(color);
        chickenTwo.setIsMolting(molting);

        printChicken(chickenTwo);
    }

    
    private static void printChicken(Chicken chicken) {
        System.out.println("          Chicken"+ chicken.getId());
        System.out.println("*************************");
        System.out.println("Chicken id:\t" + chicken.getId());
        System.out.println("Chicken name:\t" + chicken.getName());
        System.out.println("Chicken age:\t" + chicken.getAge());
        System.out.println("Chicken color:\t" + chicken.getColor());
        System.out.println("Chicken is Molting:\t" + chicken.isIsMolting());
        System.out.println("*************************");
}
}