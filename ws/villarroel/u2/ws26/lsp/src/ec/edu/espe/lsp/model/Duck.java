package ec.edu.espe.lsp.model;

import ec.edu.espe.lsp.model.Bird;

/**
 *
 * @author nicko
 */
public class Duck extends Bird {

    @Override
    public void eat() {
        System.out.println("Duck eating");
    }
    
    @Override
    public void fly() {
        System.out.println("Duck flying");
    }
}
