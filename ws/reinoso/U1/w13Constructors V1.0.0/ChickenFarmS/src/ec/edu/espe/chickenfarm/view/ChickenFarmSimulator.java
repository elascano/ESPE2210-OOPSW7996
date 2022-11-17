package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Jerly Reinoso");
        System.out.println("setters and getters");
        System.out.println("===================");

        //data type variable
        int numberOfFeathers;
        numberOfFeathers = 5;
        System.out.println("The number of feathers is -->" + numberOfFeathers);

        //declaration
        //ADT variableName
        Chicken chicken;
        int id;
        String name = new String("");
        int age;
        String color = "";
        boolean molting;

        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        printChicken(chicken);
        System.out.println("chicken is of class --> " + chicken.getClass().getSimpleName());

        System.out.println("chicken --> " + chicken);

        chicken.setId(1998);
        chicken.setName("Linda");
        chicken.setAge(3);
        chicken.setColor("Yellow and Brown ");
        chicken.setIsMolting(false);

        printChicken(chicken);
        chicken = new Chicken(2, "Lucy", "brown", 2, true);
        printChicken(chicken);
        chicken.setName("Moli");
        printChicken(chicken);

        // New Chicken
        Chicken chickenTwo;
        chickenTwo = new Chicken();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, fill the information below --> ");
        System.out.println("Enter the new chicken id --> ");
        id = sc.nextInt();
        System.out.println("Enter the new chicken name --> ");
        name = sc.next();
        System.out.println("Enter the new chicken age --> ");
        age = sc.nextInt();
        System.out.println("Enter the new chicken color --> ");
        color = sc.next();
        System.out.println("Is the chicken molting?(True/False) --> ");
        molting = sc.nextBoolean();

        chickenTwo.setId(id);
        chickenTwo.setName(name);
        chickenTwo.setAge(age);
        chickenTwo.setColor(color);
        chickenTwo.setIsMolting(molting);
        printChicken(chickenTwo);
    }
    private static void printChicken(Chicken chicken) {
        System.out.println("--------Chicken data ------------");
        System.out.println("chicken id --> " + chicken.getId());
        System.out.println("chicken name --> " + chicken.getName());
        System.out.println("chicken age --> " + chicken.getAge());
        System.out.println("chicken color--> " + chicken.getColor());
        System.out.println("chicken is molting --> " + chicken.isIsMolting());
    }
}
