package ec.edu.espe.encasulation.view;

import ec.edu.espe.encasulation.model.Chicken;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class ChickenFarm {

    public static void main(String[] args) {
        System.out.println("---Jerly Reinoso---");
        System.out.println("Encapsulation and Abstraction");
        Chicken chicken;
        chicken = new Chicken();
        chicken.setId(1);
        chicken.setName("Lulu");
        chicken.setAge(1);
        chicken.setColor("White and Brown");
        chicken.setMolting(true);
        System.out.println("chicken -->" + chicken);
        
        chicken.doStuff(4);
    }
}
