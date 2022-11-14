/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Stephen Drouet");
        System.out.println("Setters and getters");
        System.out.println("===================");
        
        //datatype variable
        int numberOfFeathers;
        
        //declaration
        //ADT variableName
        Chicken chicken;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of feathers is -->" + numberOfFeathers);
               
        //initializing the chiken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken --> chicken" + chicken);
        
        chicken.setId(534);
        chicken.setName("Chickenator 3000");
        chicken.setAge(421);
        chicken.setColor("Mellic Grey");
        chicken.setIsMolting(false);
        
        System.out.println("Chicken id --> " + chicken.getId());
        System.out.println("Chicken name --> " + chicken.getName());
        System.out.println("Chicken age --> " + chicken.getAge());
        System.out.println("Chicken color --> " + chicken.getColor());
        System.out.println("Chicken molting --> " + chicken.isIsMolting());  
    }
}
