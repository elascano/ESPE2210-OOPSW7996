package lsp;

/**
 *
 * @author DCCO-ESPE Pythons Jonathan Jaguaco
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird ostrich = new Ostrich();
        Duck duck= new Duck();
        ostrich.fly();
        ostrich.eat();
        duck.eat();
        duck.fly();
    }

    
}
