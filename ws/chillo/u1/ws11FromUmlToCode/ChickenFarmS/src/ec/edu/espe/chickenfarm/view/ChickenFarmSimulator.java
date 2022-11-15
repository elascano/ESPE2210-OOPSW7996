/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args){
        System.out.println("-----------------------");
        System.out.println("Nicolay Chillo");
        System.out.println("Setters and Getters");
        System.out.println("-----------------------");
        
        int numberOfFeathers;
        
        Chicken chicken;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of feathers is -->" + numberOfFeathers);
        
        chicken = new Chicken();
        System.out.println("chicken -->" + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
                
        System.out.println("chicken id  \t-->" + chicken.getId());
        System.out.println("chicken name  \t-->" + chicken.getName());
        System.out.println("chicken age  \t-->" + chicken.getAge());
        System.out.println("chicken color  \t-->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());

    }
}
