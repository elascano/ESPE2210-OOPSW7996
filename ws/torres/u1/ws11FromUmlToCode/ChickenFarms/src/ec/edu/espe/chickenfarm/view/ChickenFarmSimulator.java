/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.*;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) {
        System.out.println("Carlos Torres");
        System.out.println("Setters and Getters");
        System.out.println("===================");
        
        int numberOfFeathers;
        
        Chicken chicken;
        
        numberOfFeathers = 5;
        
        
        System.out.println("The number of feathers is ----->" + numberOfFeathers);
        
        //inicializing the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken ---->" + chicken);
        
        chicken.setId(246);
        chicken.setName("Rita");
        chicken.setAge(2);
        chicken.setColor("White");
        chicken.setIsMolting(true);
        
        System.out.println("chicken id -->" + chicken.getId());
        System.out.println("chicken name -->" + chicken.getName());
        System.out.println("chicken age -->" + chicken.getAge());
        System.out.println("chicken color -->" + chicken.getColor());
        System.out.println("chicken is molting -->" + chicken.isIsMolting());

        
        
    }
    
}
