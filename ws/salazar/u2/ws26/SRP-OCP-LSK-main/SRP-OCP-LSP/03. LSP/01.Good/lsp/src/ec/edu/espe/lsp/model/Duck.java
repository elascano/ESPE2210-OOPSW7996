package ec.edu.espe.lsp.model;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Duck extends FlyingBird{
    
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
    
}
