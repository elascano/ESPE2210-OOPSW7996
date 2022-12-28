
package ec.edu.espe.LSP.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Duck extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("The duck is Flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck is Eating");
    }
}
