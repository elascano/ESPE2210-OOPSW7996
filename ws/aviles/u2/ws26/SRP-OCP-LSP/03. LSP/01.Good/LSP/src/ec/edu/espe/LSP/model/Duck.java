package ec.edu.espe.LSP.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Duck extends FlyingBIrd {

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck eating");
    }
 }

