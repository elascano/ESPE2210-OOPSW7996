
package ec.edu.espe.Composite.model;

/**
 *
 *  @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPED
 */
abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println( title + " " + name );
    }
}
