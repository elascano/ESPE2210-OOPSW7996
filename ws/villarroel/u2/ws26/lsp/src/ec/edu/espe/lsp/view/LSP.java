package ec.edu.espe.lsp.view;

import ec.edu.espe.lsp.model.Bird;
import ec.edu.espe.lsp.model.Duck;
import ec.edu.espe.lsp.model.Ostrich;

/**
 *
 * @author nicko
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bird bird = new Duck();
        bird.eat();
        bird.fly();
        
        bird = new Ostrich();
        bird.eat();
        bird.fly();
        
    }

}
