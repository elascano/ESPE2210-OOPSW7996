
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args){
        System.out.println("-------------------");
        System.out.println("Lindsay Barrionuevo");
        System.out.println("Setters and getters");
        System.out.println("-------------------");
        
        int numberOfFeathers;
      
        Chicken chicken;
        
        numberOfFeathers = 5;
        System.out.println("The number of feather is --> " + numberOfFeathers);
                
        chicken = new Chicken();
        
        System.out.println("chicken -->\t\t" + chicken);
        
        chicken.setId(432);
        chicken.setName("Vulpess");
        chicken.setAge(2);
        chicken.setColor("Reddish and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id --> \t\t" + chicken.getId());
        System.out.println("chicken name --> \t" + chicken.getName());
        System.out.println("chicken age --> \t" + chicken.getAge());
        System.out.println("chicken color --> \t" + chicken.getColor());
        System.out.println("chicken is  --> \t" + chicken.isIsMolting());
        
        System.out.println("\n\n\t===== HOMEWORK =====\n");
        System.out.println("\tAdd a new Chicken! c:\n");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Chicken ID: ");
        chicken.setId(scan.nextInt());
        System.out.println("The Chicken ID is --> " + chicken.getId());
        scan.nextLine();
        System.out.println("\nChicken name: ");
        chicken.setName(scan.nextLine());
        System.out.println("The Chicken name is --> " + chicken.getName());
        System.out.println("\nChicken age: ");
        chicken.setAge(scan.nextInt());
        System.out.println("The Chicken age is --> " + chicken.getAge());
        scan.nextLine();
        System.out.println("\nChicken color: ");
        chicken.setColor(scan.nextLine());
        System.out.println("The Chicken color is --> " + chicken.getColor());
        System.out.println("\nChicken es molting? True or False: ");
        chicken.setIsMolting(scan.nextBoolean());
        System.out.println("Chicken is molting --> " + chicken.isIsMolting());
              
    }
}
