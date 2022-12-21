package ec.edu.espe.LSP.view;

import ec.edu.espe.LSP.model.Bird;
import ec.edu.espe.LSP.model.Duck;
import ec.edu.espe.LSP.model.Ostrich;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class LSP {

    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        Duck duck= new Duck();
        ostrich.eat();
        duck.eat();
        duck.fly();
    }
    
}
