package ec.edu.espe.lsp.view;

import ec.edu.espe.lsp.model.Duck;
import ec.edu.espe.lsp.model.Ostrich;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Lsp {
    public static void main(String[] args) {
        Duck duck;
        Ostrich ostrich;
        
        duck = new Duck();
        ostrich = new Ostrich();
        
        System.out.println("==========================");
        System.out.println("Duck");
        duck.fly();
        duck.eat();
        
        System.out.println("==========================");
        System.out.println("Ostrich");
        ostrich.eat();
        System.out.println("==========================");
    }
}
