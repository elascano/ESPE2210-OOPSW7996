
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Matias Suarez");
        System.out.println("Setters and Getters");
        System.out.println("===================");

        int numberOfFeathers;

        Chicken chicken;

        numberOfFeathers = 5;

        System.out.println("The number of the feathers is -->" + numberOfFeathers);

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