/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;
// import class Chicken
import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class ChickenFarm { 
    public static void main(String[] args) {
        System.out.println("Nahir Carrera");
        System.out.println("Setters and getters");
        System.out.println("===================");
        
        // instance the object (declaration)
        Chicken chickenOne; // Abstract datatype variable
        // initializing the chicken
        chickenOne = new Chicken();
        // set values
        chickenOne.setId(432); //set the chicken id 
        chickenOne.setName("Lucy");
        chickenOne.setAge(4);
        chickenOne.setColor("White and brown");
        chickenOne.setIsMolting(false);
        // get values
        System.out.println("\n\t\t===========================\n\t\t");
        System.out.println("\t\t=        Chicken 1        ="); 
        System.out.println("\n\t\t===========================\n\t\t");
        System.out.println("chicken id -> " + chickenOne.getId()); // get the chicken id
        System.out.println("chicken name -> " + chickenOne.getName());
        System.out.println("chicken age -> "+ chickenOne.getAge());
        System.out.println("chicken color -> " + chickenOne.getColor());
        System.out.println("chicken is molting? -> " + chickenOne.isIsMolting());
  
        // NEW CHICKEN
        Chicken chickenTwo;
        chickenTwo = new Chicken();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease, fill the information below");
        System.out.println("Enter the new chicken id: ");
        chickenTwo.setId(sc.nextInt()); //set the chicken id 
        System.out.println("Enter the new chicken name: ");
        chickenTwo.setName(sc.next());
        System.out.println("Enter the new chicken age: ");
        chickenTwo.setAge(sc.nextInt());
        System.out.println("Enter the new chicken color: ");
        chickenTwo.setColor(sc.next());
        System.out.println("Is the chicken molting?(True/False): ");
        chickenTwo.setIsMolting(sc.nextBoolean());
        
        System.out.println("\n\t\t===========================\n\t\t");
        System.out.println("\t\t=        Chicken 2        ="); 
        System.out.println("\n\t\t===========================\n\t\t");
        System.out.println("chicken id -> " + chickenTwo.getId()); // get the chicken id
        System.out.println("chicken name -> " + chickenTwo.getName());
        System.out.println("chicken age -> "+ chickenTwo.getAge());
        System.out.println("chicken color -> " + chickenTwo.getColor());
        System.out.println("chicken is molting? -> " + chickenTwo.isIsMolting());
 
}}
