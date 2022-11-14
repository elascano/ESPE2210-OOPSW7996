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
        //ADT
        int numberOfFeathers = 5;
        chicken = new Chicken();
        
        System.out.println("The number of feather is ---> " + numberOfFeathers);
        System.out.println("chicken ---> " + chicken);
        
        System.out.println("Chicken Id: ");
        chicken.setId(sc.nextInt());
        System.out.println("chicken id is ---> " + chicken.getId());
        
        System.out.println("Chicken name: ");
        chicken.setName(sc.next());
        System.out.println("chicken name is ---> " + chicken.getName());
        
        System.out.println("Chicken Age");
        chicken.setAge(sc.nextInt());
        System.out.println("chicken age is ---> " + chicken.getAge());
        
        System.out.println("Chicken color:");
        chicken.setColor(sc.next());
        System.out.println("chicken color is ---> " + chicken.getColor());
        
        System.out.println("Chicken is molting(true/false):");
        chicken.setIsMolting(sc.nextBoolean());
        System.out.println("chicken is molting ---> " + chicken.isIsMolting());
        
        
    }
}
