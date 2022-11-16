
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) {
        System.out.println("Carlos Alexander Torres");
        System.out.println("Setters and Getters");
        System.out.println("===================");
        System.out.println("Welcome to chicken farm simulator :)");
        
        
        //instance the object (DECLARATION)
        
        Chicken chicken,chickenTwo; //Abstract Datatype variable
        
        
        int numberOfFeathers;
        int id;
        String name;
        int age;
        String color;
        boolean molting;
        
        numberOfFeathers = 5;
        System.out.println("The number of feathers is --> " + numberOfFeathers);
        //initializing the chicken
        chicken = new Chicken();
        
        //set values
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and brown");
        chicken.setIsMolting(false);
        
        printChicken(chicken);
        
        chicken = new Chicken(4,"lolita", "black", 2, true);
        printChicken(chicken);
        
        //NEW CHICKEN
        
        chickenTwo = new Chicken();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please complete the following information about the chicken");
        
        System.out.println("Chicken id: ");
        id = scan.nextInt();
        System.out.println("Chicken name:");
        name = scan.next();
        System.out.println("Chicken age: ");
        age = scan.nextInt();
        System.out.println("Chicken color: ");
        color = scan.next();
        System.out.println("Is the chicken molting?. True or false");
        molting = scan.nextBoolean();

        chickenTwo.setId(id);
        chickenTwo.setName(name);
        chickenTwo.setAge(age);
        chickenTwo.setColor(color);
        chickenTwo.setIsMolting(molting);

        
        printChicken(chickenTwo);
        
    }

    private static void printChicken(Chicken chicken) {
        //Print/ get values
        System.out.println("=============================");
        System.out.println("  Chicken data  "+ chicken.getId());
        System.out.println("-----------------------------");
        System.out.println("chicken id -->" + chicken.getId());
        System.out.println("chicken name -->" + chicken.getName());
        System.out.println("chicken age -->" + chicken.getAge());
        System.out.println("chicken color -->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());
        System.out.println("=============================");
    }
    
}
