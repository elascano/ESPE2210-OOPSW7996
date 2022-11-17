
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println ("===================");
        System.out.println ("   Reishel Tipan   ");
        System.out.println ("Setters and getters");
        System.out.println ("===================");
        
        System.out.println("abs of -5 -->" + Math.abs(-5));
        
        //primitive data types ->int,float,char,boolean,
        //user defined data types (Abstract Data Types)->String,Math,Chicken,ChickenFarm,Egg,Poop
        
        //declaration
        //ADT variableName
        Chicken chicken;
        
        int id;
        String name = new String("");
        int age;
        String color = "";
        boolean isMolting;
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        printChicken(chicken);
        
        System.out.println("Chicken is of class -->" + chicken.getClass().getSimpleName());
        System.out.println("Chicken -->" + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        printChicken(chicken);
        //read data from keyboard
        //initialize the object using those arguments
        chicken = new Chicken(2,"Lolita","Black",2,true);
        printChicken(chicken);
        
        chicken.setName("Maruja");
        printChicken(chicken);
        System.out.println("chicken (from toString -->" + chicken);
        
        Scanner write = new Scanner(System.in);

        System.out.println("\n***************************");
        System.out.println("Insert chicken id -->");
        id = write.nextInt();
        System.out.println("Insert chicken name -->");
        name = write.next();
        System.out.println("Insert the age of the chicken -->");
        age = write.nextInt();
        System.out.println("Insert the colors of the chicken -->");
        color = write.next();
        System.out.println("Is chicken molting? -->\t");
        isMolting = write.nextBoolean();
        
        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(isMolting);
        printChicken(chicken);
    }
    
    private static void printChicken(Chicken chicken) {
        System.out.println("*************************");
        System.out.println("      Chicken  Data      ");
        System.out.println("Chicken id:  \t" + chicken.getId());
        System.out.println("Chicken name:  \t" + chicken.getName());
        System.out.println("Chicken age:  \t" + chicken.getAge());
        System.out.println("Chicken color:  \t" + chicken.getColor());
        System.out.println("Chicken is Molting:  \t" + chicken.isIsMolting());
        System.out.println("*************************");
}
}