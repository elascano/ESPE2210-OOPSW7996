package ec.edu.espe.encapsulation.view;

import ec.edu.espe.encapsulation.model.Chicken;
import java.util.HashSet;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ChickenFarm {

    public static void main(String[] args) {
        System.out.println("----------Justin Villarroel------------");
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(0);
        chicken.setName("Ramon");
        chicken.setColor("Green");
        chicken.setAge(2);
        System.out.println("chicken ----> " + chicken);
        chicken.doStuff(15);
        
    }
}
