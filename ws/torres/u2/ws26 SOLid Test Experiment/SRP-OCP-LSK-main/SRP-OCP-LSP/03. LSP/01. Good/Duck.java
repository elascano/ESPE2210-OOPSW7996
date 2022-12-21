package model;

/**
 *
 * @author nicko
 */

public class Duck extends Bird {

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck eating");
    }
 }
