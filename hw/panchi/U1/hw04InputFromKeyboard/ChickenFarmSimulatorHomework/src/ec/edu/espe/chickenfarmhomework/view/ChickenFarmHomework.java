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
        
        Chicken chicken;
        
        chicken = new Chicken();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Chicken's Id:");
        chicken.setId(sc.nextInt());
        System.out.print("Chicken's name:");
        chicken.setName(sc.next());
        System.out.print("Chicken's age:");
        chicken.setAge(sc.nextInt());
        System.out.print("Chicken's color:");
        chicken.setColor(sc.next());
        System.out.print("Chicken's molting:");
        chicken.setIsMolting(sc.nextBoolean());
        
        System.out.println("chicken id -->" + chicken.getId());
        System.out.println("chicken name -->" + chicken.getName());
        System.out.println("chicken age -->" + chicken.getAge());
        System.out.println("chicken color -->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());
        
       
    }
}
