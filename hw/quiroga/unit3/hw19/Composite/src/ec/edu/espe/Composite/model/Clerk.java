
package ec.edu.espe.Composite.model;

/**
 *
 *  @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Clerk extends Employee {
    public Clerk( String aName ) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Clerk() {
        title = "Clerk";
    }
}
