package lsp.wrong;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Duck extends Bird{

    @Override
    void fly() {
        System.out.println("Duck flying");
    }

    @Override
    void eat() {
        System.out.println("Duck eating");
    }
    
}
