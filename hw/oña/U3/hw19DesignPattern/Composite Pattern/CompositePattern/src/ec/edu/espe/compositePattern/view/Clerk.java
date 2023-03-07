
package ec.edu.espe.compositePattern.view;

import ec.edu.espe.compositePattern.view.Employee;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
class Clerk extends Employee {
    private String name;

    public Clerk(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
    }

    public Clerk() {
        title = "Clerk";
    }
}

