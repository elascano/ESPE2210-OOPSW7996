package lsp.model;

/**
 *
 * @author Karla Ansatuña,SCRIPTAL, DCCO-ESPE
 */
public class Duck extends FlyingBird {


    @Override
    public void fly() {
        System.out.println("This Duck is flying...");
    }

    @Override
    public void eat() {
        System.out.println("This Duck is eating...");
    }
}
