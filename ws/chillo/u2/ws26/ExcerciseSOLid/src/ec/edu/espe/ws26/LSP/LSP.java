package ec.edu.espe.ws26.LSP;

/**
 *
 * @author NicolayChillo, Gaman GeekLords at DCOO-ESPE
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal bird = new Bird();
        Animal duck = new Duck();
        Bird ostrich = new Ostrich();
        bird.eat();
        bird.fly();
        duck.eat();
        duck.fly();
        ostrich.eat();
        ostrich.fly();
    }   
}
