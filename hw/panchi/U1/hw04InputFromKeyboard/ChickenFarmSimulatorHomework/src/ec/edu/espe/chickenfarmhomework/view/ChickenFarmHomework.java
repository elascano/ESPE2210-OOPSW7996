package ec.edu.espe.chickenfarmhomework.view;

import ec.edu.espe.chickenfarmhomework.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ChickenFarmHomework {
    public static void main(String[] args){
        System.out.println("Allan Panchi");
        System.out.println("Homework 04");
        System.out.println("Input from keyboard");
        System.out.println("==================");
        
        int id;
        String name = new String("");
        int age;
        String color = "";
        boolean Ismolting;
        
        Chicken chicken;
        
        chicken = new Chicken();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Chicken's Id:");
        id = sc.nextInt();
        System.out.print("Chicken's name:");
        name = sc.next();
        System.out.print("Chicken's age:");
        age = sc.nextInt();
        System.out.print("Chicken's color:");
        color = sc.next();
        System.out.print("Chicken's molting:");
        Ismolting = sc.nextBoolean();
        
        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(Ismolting);
        
        
        printChicken(chicken);
        
       
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("chicken id -->" + chicken.getId());
        System.out.println("chicken name -->" + chicken.getName());
        System.out.println("chicken age -->" + chicken.getAge());
        System.out.println("chicken color -->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());
    }
}
