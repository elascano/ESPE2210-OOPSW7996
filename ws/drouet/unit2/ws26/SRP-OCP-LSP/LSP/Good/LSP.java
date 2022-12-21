package lsp;

/**
 *
 * @author nicko
 * modified by Stephen Drouet 
 */
public class LSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bird bird;
        bird = new Ostrich();
        bird.eat();
        
        bird = new Duck();        
        bird.eat();
        bird.fly();
    }    
}
