package lsp.wrong;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Ostrich extends Bird{

    @Override
    void fly() {
        System.out.println("Ostrich can't fly");
    }

    @Override
    void eat() {
        System.out.println("Ostrich eating");
    }
    
}
