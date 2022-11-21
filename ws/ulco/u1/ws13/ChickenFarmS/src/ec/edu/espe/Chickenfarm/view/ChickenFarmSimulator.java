/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Chickenfarm.view;

import ec.edu.espe.Chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("Jefferson Ulco");
        System.out.println("Contructors");
        System.out.println("====================");
        //datatype variable
        int numberOfFeathers;
        int id;
        String name = "";
        int age;
        String color = "";
        boolean molting;
        //Declaration
        //ADT vaiableName
        Chicken chicken;
        
        numberOfFeathers = 5;
        System.out.println("The number of feathers is --> " + numberOfFeathers);
                
        chicken = new Chicken();
        System.out.println("Chicken is of class --> "+chicken.getClass().getSimpleName());
        System.out.println("Chicken --> " + chicken);
        //Printnig whithout data
        printChicken(chicken);
        
        //Using setters
        chicken.setId(1);
        chicken.setName("Maruja");
        chicken.setAge(5);
        chicken.setColor("Brown");
        chicken.setIsMolting(true);
        
        printChicken(chicken);
        //Using data from Keyboard
        System.out.println("====================");
        Scanner scan=new Scanner(System.in);
        //hw chicken
        System.out.print("~Enter the Id of the chicken: ");
        id = scan.nextInt();
        System.out.print("~Enter the name of the chicken:");
        name = scan.next();
        System.out.print("~Enter the Age of the chicken:");
        age = scan.nextInt();
        System.out.print("~Enter the Color of the chicken:");
        color = scan.next();
        System.out.print("~Enter (true or false) if the is molting the chicken:");
        molting = scan.nextBoolean();
        
        chicken.setId(id);
        chicken.setName(name);
        chicken.setAge(age);
        chicken.setColor(color);
        chicken.setIsMolting(molting);
        
        printChicken(chicken);
        //Using constructors
        chicken = new Chicken(3, "Lolita", "Black", 2, true);
        
        printChicken(chicken);
    }
    private static void printChicken(Chicken chicken) {
        System.out.println("==============================");
        System.out.println("\t***Chicken "+chicken.getId()+" Information***");
        System.out.println(">Chicken id \t--> " + chicken.getId());
        System.out.println(">Chicken name \t--> " + chicken.getName());
        System.out.println(">Chicken age \t--> " + chicken.getAge());
        System.out.println(">Chicken color \t--> " + chicken.getColor());
        System.out.println(">Chicken molting --> " + chicken.isIsMolting());
        //to string
        System.out.println(chicken);
    }
}
