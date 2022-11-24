
package ec.edu.espe.encapsulation.view;

import ec.edu.espe.encapsulation.model.Chicken;
/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class ChickenFarm {
    
    public static void main(String[] args) {
        
        System.out.println("--> Reishel Tipan <--\t");
        System.out.println("Encapsulation and Abstraction\t");
        System.out.println("*****************************\t");
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("White and brown");
        chicken.setAge(12);
        chicken.setisMolting(true);
        System.out.println("chicken ----->" + chicken);
        
        chicken.doStuff(5);
        
        
 
    }
    
    
}
