/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;


/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] arg){
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Martin Suquillo");
        System.out.println("setters and getters");
        System.out.println("===================");
        
        Chicken chicken = new Chicken();
        
        int id;
        String name;
        int age;
        String color;
        boolean isMolting;
        
        chicken.setId(757);
        chicken.setName("Carlos");
        chicken.setColor("White and brown");
        chicken.setAge(5);
        chicken.setIsMolting(false);
        
        printChicken(chicken);
        
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        
        chicken = new Chicken(456, "Juanita", "White", 14, true);
        printChicken(chicken);
        
        Chicken chicken2 = new Chicken();
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("======CHICKEN======");
        System.out.println("Enter id: ");
        id =scan.nextInt();
        System.out.println("Enter name: ");
        name = scan.next();
        System.out.println("Enter age: ");
        age =scan.nextInt();
        System.out.println("Enter color: ");
        color = scan.next();
        System.out.println("Enter molting: ");
        isMolting = scan.nextBoolean();
        
        chicken2.setId(id);
        chicken2.setName(name);
        chicken2.setAge(age);
        chicken2.setColor(color);
        chicken2.setIsMolting(isMolting);
        
        System.out.println("Chicken(from toString -->)" +chicken);
    }
    private static void printChicken(Chicken chicken) {
        System.out.println("chicken id \t-->" +chicken.getId());
        System.out.println("chicken name\t-->" +chicken.getName());
        System.out.println("chicken age\t-->" +chicken.getAge());
        System.out.println("chicken color\t-->" +chicken.getColor());
        System.out.println("chicken molting\t-->" +chicken.isIsMolting());
    }
}
     