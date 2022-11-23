package ec.edu.espe.encapsulation.view;

import ec.edu.espe.encapsulation.model.Chicken;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class ChickenFarm {

    public static void main(String[] args) {
        System.out.println("-->\tErick Lasluisa\t<--");
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setAge(1);
        chicken.setColor("White");
        chicken.setMolting(true);
        System.out.println("chicken --> " + chicken);
        
        //chicken.cluck();
        
        chicken.doStuff(4);
        
    }
}
