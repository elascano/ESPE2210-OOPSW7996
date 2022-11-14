
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;








/**
 *
 * @author NW USER
 */
public class ChickenFarmSimulator {
    public static void main(String[]args){
        System.out.println("===================");
        System.out.println("Karla Ansatuña");
        System.out.println("Setters and Getters");
        System.out.println("===================");
        //datatype variable
        int numberOfFeathers;
        
        //ADT variableName
        Chicken chicken;
        //imported Chicken
        
        numberOfFeathers=5;
        System.out.println("The number of feather is -->"+ numberOfFeathers);
        chicken=new Chicken();
        
        System.out.println("chicken -->"+ chicken);
        chicken.setId(432);
        chicken.setName("Lucy");
        chicken.setAge(4);
        chicken.setColor("White and Brown");
        chicken.setIsMolting(false);
                
        System.out.println("chicken id-->\t"+ chicken.getId());
        System.out.println("chicken name-->\t"+ chicken.getName());
        System.out.println("chicken age-->\t"+ chicken.getAge());
        System.out.println("chicken color-->\t"+ chicken.getColor());
        System.out.println("chicken is Molting-->\t"+ chicken.isIsMolting());
  
        //initializing the chicken
        //creating the instance
        
        
                
    }
}
