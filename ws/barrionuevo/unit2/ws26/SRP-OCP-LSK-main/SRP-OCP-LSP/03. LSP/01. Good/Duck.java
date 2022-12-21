package lsp;

/**
 *
 * @author Lindsay Barrionuevo,DeltaTeam, DCCO-ESPE
 */

public class Duck extends FlyingBird {

    @Override
    void fly() {
        System.out.println("Flying");
    }

    void eat() {
        System.out.println("Eating");
    }
}