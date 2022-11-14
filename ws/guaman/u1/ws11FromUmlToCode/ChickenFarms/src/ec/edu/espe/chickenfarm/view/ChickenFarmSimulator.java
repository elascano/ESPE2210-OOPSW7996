package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;


/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Alexander Guaman");
        System.out.println("setters and getters");
        System.out.println("===============");
        
        //datatype variable
        int numberOfFeathers;
        
        //declaration
        //ADT variable name
        Chicken chicken;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of  feathers is --> " + numberOfFeathers);
        
        //initializing  the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken --> " + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id \t--> " + chicken.getId());
        System.out.println("chicken name \t--> " + chicken.getName());
        System.out.println("chicken age \t--> " + chicken.getAge());
        System.out.println("chicken color \t--> " + chicken.getColor());
        System.out.println("chicken is molting \t--> " + chicken.isIsMolting());
        
        //read from the keyboard the information for a new chicken
        //declare the variables for input
        //read data from keryboard
        //create a new chicken
        //set the values for the chicken with the data that was entered
        //print the information
    }   
    
}
