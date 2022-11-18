/*
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
//import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class ChickenFarmSimulator {
     public static void main(String[] args){
        System.out.println("Yorman Oña");
        System.out.println("Setters and getters");
        System.out.println("============");
        
        String LastName = new String(" Oña");
        System.out.println("LastName"+ LastName);
        
        
        System.out.println("abs of -5-->" + Math.abs(-5));
       
        Chicken chicken;
        chicken=new Chicken();
        
        printChicken(chicken);
        System.out.println("chiken class-->"+chicken.getClass());
        System.out.println("chiken class-->"+chicken.getClass().getSimpleName());
        System.out.println("Chicken -->"+chicken);
 
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);

        printChicken(chicken);
        chicken = new Chicken(2, "Lolita", "Black", 2, true);
        printChicken(chicken);
        
        chicken.setName("Maruja");
         printChicken(chicken);
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("chicken id\t--->" + chicken.getId());
        System.out.println("chicken name\t--->" + chicken.getName());
        System.out.println("chicken age\t--->" + chicken.getAge());
        System.out.println("chicken color\t--->" + chicken.getColor());
        System.out.println("chicken id molting\t--->" + chicken.isIsMolting());
    }
}
