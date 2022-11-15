package ec.edu.espe.chickenSimulator.view;

import ec.edu.espe.chickenSimulator.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */
public class ChickenFarmSimulator {
       
    public static void main(String[] args){
        
        Chicken chicken;
        chicken = new Chicken();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("= Chicken Farm Simulator =");
        
        System.out.println("Type the Id for the chicken: ");
        chicken.setId(scan.nextInt());
        System.out.println("Type the name for the chicken: ");
        chicken.setName(scan.next());
        System.out.println("Type the color for the chicken: ");
        chicken.setColor(scan.next());
        System.out.println("Type the age for the chicken: ");
        chicken.setAge(scan.nextInt());
        System.out.println("Is the chicken molting?: ");
        chicken.setIsMolting(scan.nextBoolean());
       
        System.out.println("===================");
        
        System.out.println("\n Chicken ID: " + chicken.getId());
        System.out.println(" Chicken Name: " + chicken.getName());
        System.out.println(" Chicken Color: " + chicken.getColor());
        System.out.println(" Chicken Age: " + chicken.getAge());
        System.out.println(" Is Molting?: " + chicken.isIsMolting());
        
    }
}
