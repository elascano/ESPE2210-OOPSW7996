/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import java.util.Scanner;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class ChikenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("Cristian Acalo");
        System.out.println("Setters and getters");
        System.out.println("====================");
        //datatype variable
        int numberOfFeathers;
        //Declaration
        //ADT vaiableName
        Chicken chicken;
        numberOfFeathers = 5;
        System.out.println("The number of feathers is --> " + numberOfFeathers);
        
        chicken = new Chicken();
        System.out.println("Chicken --> " + chicken);
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter chicken id: ");
        chicken.setId(scan.nextInt());
        
        System.out.print("Enter chicken name: ");
        chicken.setName(scan.next());
        
        System.out.print("Enter chicken age: ");
        chicken.setAge(scan.nextInt());
        
        System.out.print("Enter chicken color: ");
        chicken.setColor(scan.next());
        
        System.out.print("Enter chicken molting (true/false): ");
        chicken.setIsMolting(scan.nextBoolean());
        System.out.println("***********************************************");
        System.out.println("*             Chicken Information              ");
        System.out.println("***********************************************");
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken molting \t--> " + chicken.isIsMolting());
        System.out.println("***********************************************");
    }
}
