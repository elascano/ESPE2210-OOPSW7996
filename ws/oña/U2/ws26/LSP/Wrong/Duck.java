package lsp;

/**
 *
 * @author nicko
 */

public class Duck extends Bird {

    @Override
    void fly() {
        System.out.println("Duck flying");
    }

    @Override
    void eat() {
        System.out.println("Duck eating");
    }
 }
