package LSP.good;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Duck extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck eating");
    }
}
