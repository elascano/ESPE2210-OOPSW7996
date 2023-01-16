package lsp.good;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Duck extends FlyingBird{

    public Duck() {
    }

    @Override
    void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    void fly() {
        System.out.println("Duck is flying");
    }
    
}
