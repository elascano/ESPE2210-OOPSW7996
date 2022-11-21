package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Erick Lasluisa");
        System.out.println("Setters and getters");
        System.out.println("====================");
        

        Chicken chickenOne;
        chickenOne = new Chicken(); //initializing the chicken
        printChicken(chickenOne);
        System.out.println("Chicken is of class --> " + chickenOne.getClass().getSimpleName());
        System.out.println("Chicken --> " + chickenOne);
        Scanner console = new Scanner(System.in);
        int id;
        String name="";
        int age;
        String color="";
        Boolean isMolting;

        System.out.println("Enter the id:");
        id = console.nextInt();
        System.out.println("Enter the name:");
        name = console.next();
        System.out.println("Enter the age:");
        age = console.nextInt();
        System.out.println("Enter the color:");
        color = console.next();
        System.out.println("Is the Chicken Molting? (True or False)");
        isMolting = console.nextBoolean();
        
        chickenOne.setId(id);
        chickenOne.setName(name);        
        chickenOne.setAge(age);
        chickenOne.setColor(color);
        chickenOne.setIsMolting(isMolting);

        printChicken(chickenOne);
        
        chickenOne = new Chicken(2, "Lolita", "white", 22, true);
        
        printChicken(chickenOne);
        
        chickenOne.setName("Maruja");
        printChicken(chickenOne);
        
        System.out.println("chickenOne (from ToString) --> " + chickenOne);
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("====\tChicken " + chicken.getId() + "\t====");
        System.out.println("Chicken id \t--> " + chicken.getId());
        System.out.println("Chicken name \t--> " + chicken.getName());
        System.out.println("Chicken age \t--> " + chicken.getAge());
        System.out.println("Chicken color \t--> " + chicken.getColor());
        System.out.println("Chicken Is Molting \t--> " + chicken.isIsMolting());
    }
}
