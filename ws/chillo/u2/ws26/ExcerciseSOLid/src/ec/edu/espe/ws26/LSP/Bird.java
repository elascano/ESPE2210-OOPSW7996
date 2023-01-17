package ec.edu.espe.ws26.LSP;

/**
 *
 * @author NICO
 */
public class Bird extends Animal{
    
    @Override
    public void eat(){
        System.out.println("Bird eating");
    }
    public void fly(){
        System.out.println("Bird flying");
    }
}
