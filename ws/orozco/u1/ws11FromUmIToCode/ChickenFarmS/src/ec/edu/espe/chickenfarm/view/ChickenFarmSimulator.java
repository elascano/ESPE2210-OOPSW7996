
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Luis Orozco");
        System.out.println("setters and getters");
        System.out.println("===================");
        
      
        //declaration
        //ADT variableName
        Chicken chicken;
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken --> " + chicken);    
                            
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter chicken id: ");
        chicken.setId(scan.nextInt());
        
        System.out.println("Enter chicken name: ");
        chicken.setName(scan.next());
        
        System.out.println("Enter chicken age: ");
        chicken.setAge(scan.nextInt());
        
        System.out.println("Enter chicken color: ");
        chicken.setColor(scan.next());
        
        System.out.println("Enter chicken molting (True or False)");
        chicken.setIsMolting(scan.nextBoolean());
        
        
        System.out.println("----------------------------------------");
        System.out.println("     HW 04 Chicken Information          ");        
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());    
        System.out.println("chicken age \t--> " + chicken.getAge());   
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
        
    }
    
    
}
