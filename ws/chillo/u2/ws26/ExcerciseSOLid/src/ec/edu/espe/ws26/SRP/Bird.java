package ec.edu.espe.ws26.SRP;

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
