package lsp;
/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bird ostrich = new Ostrich();
        Duck duck= new Duck();
        Bird bird  = new Bird();
        System.out.println(" -> BIRD");
        bird.eat();
        bird.fly();
        System.out.println("-> OSTRICH");
        ostrich.eat();
        ostrich.fly();
        System.out.println("-> DUCK");
        duck.eat();
        duck.fly();
                
    }   
}
