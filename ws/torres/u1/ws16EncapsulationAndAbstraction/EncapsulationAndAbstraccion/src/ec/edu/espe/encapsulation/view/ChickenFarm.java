
package ec.edu.espe.encapsulation.view;

import ec.edu.espe.encapsulation.model.Chicken;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class ChickenFarm {
    
    public static void main(String[] args) {
        
        System.out.println("Carlos Alexander Torres");
        System.out.println("Encapsulation and Abstraction");
        Chicken chicken;
        chicken= new Chicken();
        chicken.setId(1);
        chicken.setAge(0);
        chicken.setColor("");
        chicken.setMolting(false);
        System.out.println("chicken --> "+chicken);
        chicken.doStuff(4);
        
    }
    
    
}
