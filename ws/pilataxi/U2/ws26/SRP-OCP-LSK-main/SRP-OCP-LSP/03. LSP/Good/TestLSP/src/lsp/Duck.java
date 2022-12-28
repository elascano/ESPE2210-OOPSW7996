
package lsp;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class Duck extends FlyingBird {
    @Override
    void fly() {
        System.out.println("Duck flying");
    }

    @Override
    void eat() {
        System.out.println("Duck eating");
    }
}
