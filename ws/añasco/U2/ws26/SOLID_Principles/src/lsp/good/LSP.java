package lsp.good;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class LSP {
    public static void main(String[] args) {
        Bird bird;
        FlyingBird flyingBird;
        
        flyingBird = new Duck();
        flyingBird.eat();
        flyingBird.fly();
        
        bird = new Ostrich();
        bird.eat(); 
    }
    
}
