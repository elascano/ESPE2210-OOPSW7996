
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    
    public static void main(String[] args) {
        System.out.println("Elkin Pabon");
        System.out.println("setters and getters");
        System.out.println("===================");
        System.out.println("===============Chicken Farm Simulator===============");
        
        //datatype variable
        int numberOfFeathers;
         
        //declaration
        //ADT variableName
        Chicken chicken;
                numberOfFeathers = 5;      
        //System.out.println("The number of feathers is: " + numberOfFeathers);      
        //initalizing the chicekn
        // creating the instance
        chicken = new Chicken();
      //  System.out.println("Chicken --> " + chicken);
        
        chicken.setId(4320);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        printChicken(chicken);
       
        chicken = new Chicken(2,"Carmen","Black",1,true);
        
        printChicken(chicken);
    }

    private static void printChicken(Chicken chicken) {
        System.out.println("====CHICKEN====");
        System.out.println("Chicken id -->: " + chicken.getId());
        System.out.println("Chicken name -->: " + chicken.getName());
        System.out.println("Chicken age -->: " + chicken.getAge());
        System.out.println("Chicken color -->: " + chicken.getColor());
        System.out.println("Chicken is Molting? -->: " + chicken.isIsMolting());
    }
}
