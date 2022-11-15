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
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args){
        Scanner entradaEscaner = new Scanner (System.in);
        System.out.println("Christopher Bazurto");
        System.out.println("Setters and getters");
        System.out.println("========================");
        
        // data type variable
        int numberOfFeathers;
        //declaration
        // ADT variableName
        Chicken chicken;
        numberOfFeathers = 5;
        String name;
        int age;
        String color;
        boolean molting;
       // System.out.println("The number of feathers is  -->" + numberOfFeathers);
        
        //initializing the chicken
        //creating the instance;
        chicken = new Chicken();
       
        System.out.println("chicken Name -->" );
        
        chicken.setName(entradaEscaner.next());
        
        System.out.println("chicken Age -->" );
        chicken.setId(entradaEscaner.nextInt());
        
        System.out.println("chicken Color -->");
        chicken.setColor(entradaEscaner.next());
        
        System.out.println("chicken is molting -->");
        chicken.setIsMolting(entradaEscaner.nextBoolean());
    }
}
