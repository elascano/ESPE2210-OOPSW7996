
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Sebastian Verdugo");
        System.out.println("Setters and getters");
        System.out.println("===================");
        
        
        //declaration
        //ADT variableName
        Chicken chicken; //initializing the chicken
        
        chicken = new Chicken();
        
        System.out.println("Chicken " + chicken);
        
        
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        
        System.out.println("==================================");
        System.out.println("chicken id \t---> " + chicken.getId());
        System.out.println("chicken name \t---> " + chicken.getName());
        System.out.println("chicken age \t---> " + chicken.getAge());
        System.out.println("chicken color \t---> " + chicken.getColor());
        System.out.println("chicken is molting \t---> " + chicken.isIsMolting());
        System.out.println("==================================");
        
        //datatype variable
        
        int id;
        String name = new String("");
        int age;
        String color = new String("");
        boolean molting;
        
        
        int numberOfFeathers;
        
        numberOfFeathers = 5;
        System.out.println("Number of Feathers is ---> " + numberOfFeathers);
        
        chicken = new Chicken();
        
        System.out.println("Chicken --->" + chicken);
        System.out.println("Chicken is of class --->" + chicken.getClass().getSimpleName());
        
        //no data print
        printChicken(chicken);
        
        //setters
        chicken.setId(1);
        chicken.setName("Maruja");
        chicken.setAge(5);
        chicken.setColor("Brown");
        chicken.setIsMolting(true);
        
        printChicken(chicken);
        
        //data form keyboard
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("======================");
        
        System.out.println("======================");
        
        
        System.out.println("Insert the chicken id: ");
        id = sc.nextInt();
        System.out.println("Insert chicken name: ");
        name = sc.next();
        System.out.println("Insert chicken age: ");
        age = sc.nextInt();
        System.out.println("Insert chicken color: ");
        color = sc.next();
        System.out.println("Insert if the chicken is molting: ");
        molting = sc.nextBoolean();
        
        System.out.println("======================");
        
        System.out.println("======================");
        
        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(molting);
        
        
        printChicken(chicken);
        
        //constructors
        
        
        
        chicken = new Chicken(3, "Lolita", "Black", 2, true);
        
        printChicken(chicken);
          
    }
    
    private static void printChicken(Chicken chicken) {
        System.out.println("==================================");
        System.out.println("           <||Chicken " + chicken.getId() + " Data||> ");
        System.out.println("==================================");
        System.out.println("The chicken id inserted ---> " + chicken.getId());
        System.out.println("Thechicken name inserted ---> " + chicken.getName());
        System.out.println("The chicken age inserted ---> " + chicken.getAge());
        System.out.println("The chicken color inserted ---> " + chicken.getColor());
        System.out.println("Information if the chicken is molting ---> " + chicken.isIsMolting());
        System.out.println("==================================");
        System.out.println(chicken);
    }
}