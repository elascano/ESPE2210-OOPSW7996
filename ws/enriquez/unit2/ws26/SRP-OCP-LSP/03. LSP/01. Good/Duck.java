
package lsp.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
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
