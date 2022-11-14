/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Allan Panchi");
        System.out.println("Setters and Getters");
        System.out.println("===================");
        
        
        Chicken chicken;
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken -->" + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        
        
        System.out.println("chicken id -->" + chicken.getId());
        System.out.println("chicken name -->" + chicken.getName());
        System.out.println("chicken age -->" + chicken.getAge());
        System.out.println("chicken color -->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());
       
    }
    
}
