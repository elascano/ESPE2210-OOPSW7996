package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;

import ec.edu.espe.chickenfarm.model.Egg;



/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        
        System.out.println("Alejandro Andrade");
        System.out.println("Setters and getters");
        System.out.println("===================");
        
        Chicken chicken;
        //ADT
        int numberOfFeathers = 5;
        chicken = new Chicken();
        
        System.out.println("The number of feather is ---> " + numberOfFeathers);
        
        System.out.println("chicken ---> " + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(32);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id is ---> " + chicken.getId());
        System.out.println("chicken name is ---> " + chicken.getName());
        System.out.println("chicken age is ---> " + chicken.getAge());
        System.out.println("chicken color is ---> " + chicken.getColor());
        System.out.println("chicken is molting ---> " + chicken.isIsMolting());
        
    }
}
