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
        System.out.println ("Jefferson ulco");
        System.out.println ("setters and getters");
        System.out.println ("==============");
    
        //data variables
        int number0fFeathers;
        
        //AD variableName
        Chicken chicken;
        
        number0fFeathers = 5;
        System.out.println ("the number of feathers is -->" + number0fFeathers);
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();

     /*  System.out.println ("chicken --> " + chicken );
       chicken.setId(432);
       chicken.setName(("Lucy"));
       chicken.setAge(4);
       chicken.setColor("White and Brown");
       chicken.setIsMolting(false);
        */
System.out.println ("===========================================");

       //hw
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Id of the chicken:");
        chicken.setId(scan.nextInt());
        System.out.println("Enter the name of the chicken: ");
        chicken.setName(scan.next());
       System.out.println("Enter the Age of the chicken:");
        chicken.setAge(scan.nextInt());
        System.out.println("Enter the Color of the chicken:");
        chicken.setColor(scan.next());
        System.out.println("Enter (true or false) if the is molting the chicken:");
        chicken.setIsMolting(scan.nextBoolean());
       
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());

        //read fron the keyboard the information for a new chicken
        //declare the variale for imput
        //read data from keyboard
        //create a newchicken
        //set the values  
    }
}
