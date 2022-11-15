
package ec.edu.espe.chickenfarm.view;

import java.util.Scanner;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Ariel Rivadeneira");
        System.out.println("setters and getters");
        System.out.println("==================");
        
        //datatype varible
        int numberOfFeathers;
     
        //declaration
        //ADT varible name
        Chicken chicken;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of feathers is -->"+ numberOfFeathers);
        
        //initializing the chicken
        //create the instance
        chicken = new Chicken();
        
        System.out.println("chicken -->"+ chicken);
        
        chicken.setId(423);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id\t -->"+ chicken.getId());
        System.out.println("chicken name\t -->"+ chicken.getName());
        System.out.println("chicken age\t -->"+ chicken.getAge());
        System.out.println("chicken color\t -->"+ chicken.getColor());
        System.out.println("chicken is molting\t -->"+ chicken.isIsMolting());
        
        System.out.println("=========");
        System.out.println("=========");
        System.out.println("Homework");
        System.out.println("=========");
        System.out.println("=========");
        
        //homework
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("chicken id -->");
        chicken.setId(scan.nextInt());
        System.out.print("chicken name -->");
        chicken.setName(scan.next());
        System.out.print("chicken age -->");
        chicken.setAge(scan.nextInt());
        System.out.print("chicken color -->");
        chicken.setColor(scan.next());
        System.out.print("chicken is molting -->");
        chicken.setIsMolting(scan.nextBoolean());
    }
}
