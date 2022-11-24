package ec.edu.espe.encasulation.view;

import ec.edu.espe.encasulation.model.Chicken;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class ChickenFarm {

    public static void main(String[] args) {
        System.out.println("====Jefferson Ulco====");

        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("lucy");
        chicken.setAge(1);
        chicken.setColor("white and brown");
        chicken.setMolting(true);
        System.out.println("chicken -->" + chicken);

        chicken.doStuff(10);
    }
}
