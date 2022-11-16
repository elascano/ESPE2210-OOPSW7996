package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    static void printChickenInfo(Chicken chicken){
        System.out.println("=========================================");
        System.out.println("chicken --> chicken" + chicken);
        System.out.println("=========================================");
        
        if (chicken.getName() != null) {            
            System.out.println("Chicken id --> " + chicken.getId());
            System.out.println("Chicken name --> " + chicken.getName());
            System.out.println("Chicken age --> " + chicken.getAge());
            System.out.println("Chicken color --> " + chicken.getColor());
            System.out.println("Chicken is molting --> " + chicken.isIsMolting()); 
        } else {
            System.out.println("Chicken info is empty");
        }        
    }
    
    static void enterChickenInfo(Chicken chicken) {
        int id;
        String name;
        int age;
        String color;
        String isMolting;
        
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Write chicken Name: ");
            name = sc.nextLine();
            System.out.print("Write chicken ID: ");
            id = sc.nextInt();
            System.out.print("Write chicken age: ");
            age = sc.nextInt();
            sc.nextLine(); // Empty buffer
            System.out.print("Write chicken color: ");
            color = sc.nextLine();
            System.out.print("Chicken is Molting? (s/n): ");
            isMolting = sc.nextLine();

            chicken.setId(id);
            chicken.setName(name);
            chicken.setAge(age);
            chicken.setColor(color);
            
            if (isMolting.toLowerCase().equals("s")) {
                chicken.setIsMolting(true);
            } else {
                chicken.setIsMolting(false);
            }
        } catch (Exception e) {
            System.out.println("=============================================");
            System.out.println("Error: some data entered for chicken is wrong");
            System.out.println("=============================================");
        }
 
    }
    
    public static void main(String[] args) {
        System.out.println("Stephen Drouet");
        System.out.println("Setters, getters and Input from keyboard ");
        System.out.println("=========================================");
        
        //declaration
        //ADT variableName
        Chicken chicken;
                             
        //initializing the chiken
        //creating the instance
        chicken = new Chicken();
        
        enterChickenInfo(chicken);
        
        printChickenInfo(chicken);
    }
    
}
