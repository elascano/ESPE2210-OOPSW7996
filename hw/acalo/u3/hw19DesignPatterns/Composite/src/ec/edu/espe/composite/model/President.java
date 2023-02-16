package ec.edu.espe.composite.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class President extends Supervisor{
    private static President president = new President();
    private President(String aName){
        this();
        name=aName;
    }
    
    private President(){
        super();
        title="Presiden";
    }
    
    @Override
    public void stateName(){
        super.stateName();
    }
    
    public static President getPresident(String aName){
        president.name=aName;
        return President.president;
    }
}
