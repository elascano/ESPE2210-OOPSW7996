package ec.edu.espe.lsp.model;

import ec.edu.espe.lsp.model.Bird;

/**
 *
 * @author nicko
 */
public class Ostrich extends Bird {

    @Override
    public void eat() {
        System.out.println("Ostrich eating");
    }

    @Override
    public void fly() {
        System.out.println("Ostriches can't fly");
    }

}
