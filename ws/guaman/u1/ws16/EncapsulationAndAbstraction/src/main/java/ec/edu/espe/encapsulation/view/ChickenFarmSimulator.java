package ec.edu.espe.encapsulation.view;

import ec.edu.espe.encapsulation.model.Chicken;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        System.out.println("--> Alexander Guaman <--");
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("white and brown");
        chicken.setAge(1);
        chicken.setIsMolting(true);
        
        System.out.println("chicken --> " + chicken);
        chicken.doStuff(4);
    }
}
