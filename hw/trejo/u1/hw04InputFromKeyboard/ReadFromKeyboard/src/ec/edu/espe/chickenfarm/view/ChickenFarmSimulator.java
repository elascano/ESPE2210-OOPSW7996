package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;



/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        
        System.out.println("Alex Trejo");
        System.out.println("Setters and getters");
        System.out.println("===================");

        //datatype variable
        int numberOfFeathers;

        //ADT variableName
        Chicken chicken;

        chicken = new Chicken();
        numberOfFeathers=5;
        System.out.println("The number of feathers is -->"+numberOfFeathers);
        System.out.println("chicken -->" + chicken);
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);       
                
        System.out.println("chicken id \t\t-->" + chicken.getId());
        System.out.println("chicken name \t\t-->" + chicken.getName());
        System.out.println("chicken age \t\t-->" + chicken.getAge());
        System.out.println("chicken color \t\t-->" + chicken.getColor());
        System.out.println("chicken is molting\t-->" + chicken.isIsMolting());
        
        Chicken chickentwo=new Chicken();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("Alex Trejo");
        System.out.println("Hw04InputFromKeyboard");
        System.out.println("===================");
        
        System.out.println("-Chicken Farm Registration System-");
        System.out.println("chicken -->" + chicken);
        System.out.print("Enter the chicken id:\t\t");
        chickentwo.setId(scanner.nextInt());
        System.out.print("Enter the name of the chicken:\t");
        chickentwo.setName(scanner.next());
        System.out.print("Enter the age of the chicken:\t");
        chickentwo.setAge(scanner.nextInt());
        System.out.print("Enter the color of the chicken:\t");
        chickentwo.setColor(scanner.next());
        System.out.print("Is molting(true/false):\t\t");
        chickentwo.setIsMolting(scanner.hasNext());
        System.out.println("-----Information ----");
        System.out.println("chicken id \t\t-->" + chickentwo.getId());
        System.out.println("chicken name \t\t-->" + chickentwo.getName());
        System.out.println("chicken age \t\t-->" + chickentwo.getAge());
        System.out.println("chicken color \t\t-->" + chickentwo.getColor());
        System.out.println("chicken is molting\t-->" + chickentwo.isIsMolting());
        
    }
}
