
package ec.edu.espe.encapsularion.view;

import ec.edu.espe.encapsularion.model.Chicken;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        System.out.println("--- Rivera Joel ---");
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("White and brown");
        chicken.setAge(1);
        chicken.setMolting(true);
        
        System.out.println("chicken --> " + chicken);
        
        chicken.doStuff(4);
       
    }
}
