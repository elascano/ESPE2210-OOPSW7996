
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Reishel Tipan");
        System.out.println ("Setters and getters");
        System.out.println ("===================");
        
        //AD variableName
        Chicken chicken;
        
        //creating the instance
        chicken = new Chicken();

        System.out.println ("Chicken --> " + chicken );
        
        System.out.println("Insert chicken id:");
        chicken.setId(sc.nextInt());
       
        System.out.println("Insert chicken name:");
        chicken.setName(sc.next());
        
        System.out.println("Insert chicken age:");
        chicken.setAge(sc.nextInt());
        
        System.out.println("Insert chicken color:");
        chicken.setColor(sc.next());
        
        System.out.println("Is chicken molting?:\t");
        chicken.setIsMolting(sc.nextBoolean());
        System.out.println("*************************");
        System.out.println("Chicken id: \t" + chicken.getId());
        System.out.println("Chicken name:\t" + chicken.getName());
        System.out.println("Chicken age: \t" + chicken.getAge());
        System.out.println("Chicken color: \t" + chicken.getColor());
        System.out.println("Chicken is Molting: \t" + chicken.isIsMolting());
        System.out.println("*************************");
        //read fron the keyboard the information for a new chicken
         
    }   
}
