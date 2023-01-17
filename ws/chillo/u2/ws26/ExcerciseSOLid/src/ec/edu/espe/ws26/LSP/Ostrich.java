package ec.edu.espe.ws26.LSP;

/**
 *
 * @author NICO
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