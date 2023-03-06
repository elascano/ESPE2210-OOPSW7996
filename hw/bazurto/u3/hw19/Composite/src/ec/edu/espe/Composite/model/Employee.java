
package ec.edu.espe.Composite.model;

/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println( title + " " + name );
    }
}
