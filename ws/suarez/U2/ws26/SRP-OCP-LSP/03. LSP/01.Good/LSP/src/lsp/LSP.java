
package lsp;

import lsp.model.Bird;
import lsp.model.Duck;
import lsp.model.Ostrich;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird ostrich = new Ostrich();
        Duck duck= new Duck();
        ostrich.eat();
        duck.eat();
        duck.fly();

    }
    
}
