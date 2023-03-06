
package ec.edu.espe.Composite.model;

/**
 *
 *  @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class Teller extends Employee {
    public Teller( String aName ) {
        this();
        aName = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Teller() {
        title = "Teller";
    }
}
