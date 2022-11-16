package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Edison Lascano, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        System.out.println("Edison Lascano");
        System.out.println("setters and getters");
        System.out.println("===================");

        //declaration
        //ADT variableName
        Chicken chicken;

        //initializing the chicken
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

    }
}
