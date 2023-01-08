
package ec.edu.espe.LSP.view;

import ec.edu.espe.LSP.model.Bird;
import ec.edu.espe.LSP.model.Duck;
import ec.edu.espe.LSP.model.Ostrich;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird ostrich = new Ostrich();
        Duck duck= new Duck();
        System.out.println("******DUCK******");
        duck.eat();
        duck.fly();
        System.out.println("*****OSTRICH****");
        ostrich.eat();
 

    }
    
}
