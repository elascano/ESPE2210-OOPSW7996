
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Diego Pilataxi");
        System.out.println("Setters and Getters");
        System.out.println("====================");
        
        //datatype variable
        int numberOfFeathers;
        
        //declaration
        int id;
        String name;
        int age;
        String color;
        boolean molting;
        
        //ADT variableName
        Chicken chicken;
        Chicken chickenTwo;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of Feathers is ---> " + numberOfFeathers);
        
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken ---> " + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        printChicken(chicken);
        
        chicken = new Chicken(2, "Lolita", "black", 2, true);
        
        printChicken(chicken);
        
        chicken.setName("Maruja");
        
        printChicken(chicken);
        
        chickenTwo = new Chicken();
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter the number Id: ");
        id = read.nextInt();
        
        
        System.out.println("Enter the Chicken Name: ");
        name = read.next();
        
        System.out.println("Enter the Chicken Age: ");
        age = read.nextInt();
        
        System.out.println("Enter the Color Chicken: ");
        color = read.next();
        
        System.out.println("¿Chicken is Molting?: ");
        molting = read.nextBoolean();
        
        chickenTwo.setId(id);
        chickenTwo.setName(name);
        chickenTwo.setAge(age);
        chickenTwo.setColor(color);
        chickenTwo.setIsMolting(molting);
        
        System.out.println("chicken id \t---> " + chickenTwo.getId());
        System.out.println("chicken name \t---> " + chickenTwo.getName());
        System.out.println("chicken age \t---> " + chickenTwo.getAge());
        System.out.println("chicken color \t---> " + chickenTwo.getColor());
        System.out.println("chicken is molting \t---> " + chickenTwo.isIsMolting());
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("----------Chicken data----------");
        System.out.println("chicken id \t---> " + chicken.getId());
        System.out.println("chicken name \t---> " + chicken.getName());
        System.out.println("chicken age \t---> " + chicken.getAge());
        System.out.println("chicken color \t---> " + chicken.getColor());
        System.out.println("chicken is molting \t---> " + chicken.isIsMolting());
    }
}
