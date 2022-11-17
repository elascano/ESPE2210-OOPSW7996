
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Luis Orozco");
        System.out.println("Setters and Getters");
        System.out.println("===================");
        
        Chicken chicken;
        int id = 0;
        chicken = new Chicken(id);
        
               
        System.out.println("chicken -->" + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("--------------------------------");
        System.out.println("chicken id \t-->" + chicken.getId());
        System.out.println("chicken name \t-->" + chicken.getName());
        System.out.println("chicken age \t-->" + chicken.getAge());
        System.out.println("chicken color \t-->" + chicken.getColor());
        System.out.println("chicken is molting \t-->" + chicken.isIsMolting());
        
        printChicken(chicken);
        
        chicken.setId(1);
        chicken.setName("Lorenza");
        chicken.setAge(5);
        chicken.setColor("white");
        chicken.setIsMolting(true);
        
        printChicken(chicken);
        
        Scanner sc = new Scanner(System.in);
        
            
        System.out.println("----------------------------");
        
        System.out.println("Enter chicken id: ");
        id = sc.nextInt();
        System.out.println("Enter chicken name: ");
        String name = sc.next();
        System.out.println("Enter chicken age: ");
        int age = sc.nextInt();
        System.out.println("Enter chicken color: ");
        String color = sc.next();
        System.out.println("Enter chicken is molting: ");
        boolean molting = sc.nextBoolean();
        
        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(molting);
        
       printChicken(chicken);
       
       chicken = new Chicken(3, "Rafaela", "Brown", 2, true);
       
       
       printChicken(chicken);
       
        
    }
    
    private static void printChicken(Chicken chicken){
        System.out.println("---------------------------");
        System.out.println("chicken Information" + chicken.getId());
        System.out.println("chicken id -->" + chicken.getId());
        System.out.println("chicken name -->" + chicken.getName());
        System.out.println("chicken age -->" + chicken.getAge());
        System.out.println("chicken color -->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());
        
        
    }
}
