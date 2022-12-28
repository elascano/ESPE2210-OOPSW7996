package LSPWrong;

/**
 *
 * @author nicko
 */
public class Ostrich extends Bird {

    @Override
    void eat() {
        System.out.println("Ostrich eating");
    }

    @Override
    void fly() {
        System.out.println("Ostriches can't fly");
    }

}
