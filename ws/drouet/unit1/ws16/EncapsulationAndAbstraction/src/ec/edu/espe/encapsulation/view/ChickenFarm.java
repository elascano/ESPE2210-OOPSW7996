package ec.edu.espe.encapsulation.view;

import ec.edu.espe.encapsulation.model.Chicken;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class ChickenFarm {
    
    public static void main(String[] args) {
        System.out.println("--> Stephen Drouet <--");
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Termin");
        chicken.setAge(2);
        chicken.setColor("brown");
        
        System.out.println("Chicken - " + chicken);
        
        chicken.doStuff(5);
    }
    
    
}
