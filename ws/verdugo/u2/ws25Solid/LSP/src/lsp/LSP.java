
package lsp;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class LSP {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        Duck duck = new Duck();
        ostrich.eat();
        duck.eat();
        duck.fly();
    }
}
