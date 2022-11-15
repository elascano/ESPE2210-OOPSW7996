
package ec.edu.espe.chickenfarms.view;
/**
 *
 * @author Miguel Gutiérrez, Pythons, DCCO-ESPE
 */
import ec.edu.espe.chickenfarms.model.Chicken;
import java.util.Scanner;
        
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Miguel Gutiérrez");
        System.out.println("setters and getters");
        System.out.println("====================");
        
        int numberOfFeathers;
        
        Chicken chicken;
      numberOfFeathers = 5;
      
    System.out.println("The number of feather is  --->" + numberOfFeathers);
    chicken = new Chicken();
    System.out.println("=chicken ---> "+ chicken);
    
     chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id\t---> " + chicken.getId());
        System.out.println("chicken name\t---> " + chicken.getName());
        System.out.println("chicken age\t---> " + chicken.getAge());
        System.out.println("chicken color\t---> " + chicken.getColor());
        System.out.println("chicken id molting\t---> " + chicken.isIsMolting());
        System.out.println("===========================");
        
    Scanner scan = new Scanner (System.in); 
    System.out.println("Enter the chicken id:");
         chicken.setId(scan.nextInt());
         System.out.println("Enter the chicken name:");
         chicken.setName(scan.next());
         System.out.println("Enter the chicken age:");
         chicken.setAge(scan.nextInt());
         System.out.println("Enter the chicken color:");
         chicken.setColor(scan.next());
         System.out.println("Enter the chicken molting (true/false):");
         chicken.setIsMolting(scan.nextBoolean());
        
      }  
}
