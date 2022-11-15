
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        System.out.println("Diego Pilataxi");
        System.out.println("Setters and Getters");
        System.out.println("====================");
        
        //datatype variable
        int numberOfFeathers;
        
        //declaration
        //ADT variableName
        Chicken chicken;
        
        numberOfFeathers = 5;
        
        System.out.println("The number of Feathers is ---> " + numberOfFeathers);
        
        
        //initializing the chicken
        //creating the instance
        chicken = new Chicken();
        
        System.out.println("chicken ---> " + chicken);
        
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
        
        System.out.println("chicken id \t---> " + chicken.getId());
        System.out.println("chicken name \t---> " + chicken.getName());
        System.out.println("chicken age \t---> " + chicken.getAge());
        System.out.println("chicken color \t---> " + chicken.getColor());
        System.out.println("chicken is molting \t---> " + chicken.isIsMolting());
    }
}
