package ec.edu.espe.chickenfarms.view;

import ec.edu.espe.chickenfarms.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Miguel Gutiérrez, Pythons, DCCO-ESPE
 */    

public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Miguel Gutiérrez");
        System.out.println("setters and getters");
        System.out.println("====================");
        
        int numberOfFeathers;
        
        Chicken chicken, chickenhw;
        int id, age;
        String name, color;
        boolean isMolting ;
     
        numberOfFeathers = 5;
      
        System.out.println("The number of feather is  ---> " + numberOfFeathers);
        
        chicken = new Chicken();
        
        System.out.println("=chicken ---> "+ chicken);
    
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        chicken = new Chicken(432,"Lucy","White and Brown",4,false);
    
        chickenhw = new Chicken();
        printChicken(chicken);
    
        Scanner scan = new Scanner (System.in); 
        System.out.println("Enter the chicken id:");
        id = scan.nextInt();
        chickenhw.setId(id);
        System.out.println("Enter the chicken name:");
        name = scan.next();
        chickenhw.setName(name);
        System.out.println("Enter the chicken age:");
        age = scan.nextInt();
        chickenhw.setAge(age);
        System.out.println("Enter the chicken color:");
        color = scan.next();
        chickenhw.setColor(color);
        System.out.println("Enter the chicken molting (true/false):");
        isMolting = scan.nextBoolean();
        chickenhw.setIsMolting(isMolting);
        
      }  
    
    private static void printChicken (Chicken chicken) {
        System.out.println("chicken id\t---> " + chicken.getId());
        System.out.println("chicken name\t---> " + chicken.getName());
        System.out.println("chicken age\t---> " + chicken.getAge());
        System.out.println("chicken color\t---> " + chicken.getColor());
        System.out.println("chicken molting\t---> " + chicken.isIsMolting());
        System.out.println("===========================");
    }
}
