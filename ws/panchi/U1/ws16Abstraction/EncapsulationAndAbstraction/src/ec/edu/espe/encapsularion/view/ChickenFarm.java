package ec.edu.espe.encapsularion.view;
import ec.edu.espe.encapsularion.model.Chicken;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("white and brown");
        chicken.setAge(1);
        chicken.setMolting(true);
        System.out.println("chicken -->" + chicken);
        
        chicken.doStuff(8);
    }
    
}
