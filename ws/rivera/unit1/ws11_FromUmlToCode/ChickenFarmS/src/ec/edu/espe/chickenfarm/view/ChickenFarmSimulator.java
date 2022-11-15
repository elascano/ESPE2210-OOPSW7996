/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Joel Rivera");
        System.out.println("setters and getters");
        System.out.println("-------------------");
        
        //Declaration
        //ADT(Abstract Data Type) variableName
        Chicken chicken;
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken --> " + chicken);
        
        //chicken.id = 432; //Not working because is private
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molthing \t--> " + chicken.isIsMolting());
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("chicken id: ");
        chicken.setId(read.nextInt());
        System.out.println("chicken id is --> " + chicken.getId());
        read.nextLine();//clean buffer
        
        System.out.println("chicken name :");
        chicken.setName(read.nextLine());
        System.out.println("chicken name is --> " + chicken.getName());
        
        System.out.println("chicken age :");
        chicken.setAge(read.nextInt());
        System.out.println("chicken age is --> " + chicken.getAge());
        read.nextLine();
        
        System.out.println("chicken color :");
        chicken.setColor(read.nextLine());
        System.out.println("chicken color is --> " + chicken.getColor());
        
        System.out.println("chicken is molting (true or false) :");
        chicken.setIsMolting(read.nextBoolean());
        System.out.println("chicken is molting --> " + chicken.isIsMolting());
    }
}
