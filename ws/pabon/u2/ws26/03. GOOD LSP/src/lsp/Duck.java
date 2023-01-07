package lsp;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Duck extends Bird{
    
    @Override
    void fly() {
        System.out.println("Duck flying");
    }

    @Override
    void eat() {
        System.out.println("Duck eating");
    }    
}
