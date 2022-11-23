package ec.edu.espe.encasulation.view;

import ec.edu.espe.encasulation.model.Chicken;

//Good Encaptulation

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        System.out.println("-->Silvia Añasco<--");
        System.out.println("Encapsulation and Abstraction");
        Chicken chicken;
        chicken = new Chicken();
        
        chicken.setId(1);
        chicken.setName("Laura");
        chicken.setColor("White");
        chicken.setAge(2);
        chicken.setIsMolting(true);
        
        //System.out.println("Chicken-->"+chicken);
        //System.out.println("Chicken-->"+chicken.toString());
        
        chicken.doStuff(15);
    }
}
