
package ec.edu.espe.encapsulation.view;

import ec.edu.espe.encapsulation.model.Chicken;

/**
 *
 * @author Juan Pablo Pinza, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarm {
    
    

    public static void main(String[] args) {
        
        System.out.println("==Juan Pablo Pinza Armijos ==");
               
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Laura");
        System.out.println("chicken ->" + chicken);
        
        chicken.doStuff(8);
        
        
        //chicken.cluck();
    }

}

//Ya que está encapsulado debemos tener otros medios para acceder.