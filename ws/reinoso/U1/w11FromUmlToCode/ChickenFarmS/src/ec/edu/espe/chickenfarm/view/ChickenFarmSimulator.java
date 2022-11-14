package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Jerly Reinoso");
        System.out.println("setters and getters");
        System.out.println("===================");
        
        //data type variable
        int numberOfFeathers;

        //declaration
        //ADT variableName
        Chicken chicken;
        numberOfFeathers = 5;
        System.out.println("The number of feathers is -->" + numberOfFeathers);

        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        System.out.println("chicken --> " + chicken);
        chicken.setId(1998);
        chicken.setName("Linda");
        chicken.setAge(3);
        chicken.setColor("Yellow and Brown ");
        chicken.setIsMolting(false);

        System.out.println("chicken id --> " + chicken.getId());
        System.out.println("chicken name --> " + chicken.getName());
        System.out.println("chicken age --> " + chicken.getAge());
        System.out.println("chicken color--> " + chicken.getColor());
        System.out.println("chicken is molting --> " + chicken.isIsMolting());
    }
}
