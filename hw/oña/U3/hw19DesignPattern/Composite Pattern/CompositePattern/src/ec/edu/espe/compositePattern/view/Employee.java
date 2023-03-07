
package ec.edu.espe.compositePattern.view;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
abstract class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }
}
