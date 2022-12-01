package ec.edu.espe.chickenfarm.view;

import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Chicken;

import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Alejandro Andrade");
        System.out.println("Setters and getters");
        System.out.println("===================");
        
        Chicken chicken;
        chicken = new Chicken();
        
        Chicken chickenTwo;
        chickenTwo = new Chicken(2, "lola", "Black", 2, true);
        
        int id = 0;
        String name = "";
        int age = 0;
        String color = "";
        boolean isMolting = false;
        int numberOfFeathers = 5;
        
        System.out.println("Chicken ---> " + chicken);
        
        System.out.println("Chicken One:");
        //InChicken(chicken, sc);
        printChicken(chicken);
        
        System.out.println("Chicken Two");
        //InChicken(chickenTwo, sc);
        System.out.println("Chicken (To String) ---> " + chickenTwo);
    }

    private static void InChicken(Chicken chicken, Scanner sc) {
        System.out.println("Enter the chicken id");
        chicken.setId(sc.nextInt());
        System.out.println("Enter the chicken name");
        chicken.setName(sc.next());
        System.out.println("Enter the chicken age");
        chicken.setAge(sc.nextInt());
        System.out.println("Enter the chicken color");
        chicken.setColor(sc.next());
        System.out.println("Enter true or false if the chicken is molting");
        chicken.setIsMolting(sc.nextBoolean());
    }

    private static void printChicken(Chicken chicken) {
        
        System.out.println("=============================");
        System.out.println("        Chicken " + chicken.getId());
        System.out.println("=============================");
        System.out.println("chicken id is ---> " + chicken.getId());
        System.out.println("chicken name is ---> " + chicken.getName());
        System.out.println("chicken age is ---> " + chicken.getAge());
        System.out.println("chicken color is ---> " + chicken.getColor());
        System.out.println("chicken is molting ---> " + chicken.isIsMolting());
    }
}
