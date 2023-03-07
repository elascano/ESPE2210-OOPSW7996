
package ec.edu.espe.compositePattern.view;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
class Teller extends Employee {
    private String name;

    public Teller(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        System.out.println(title + " " + name);
    }

    public Teller() {
        title = "Teller";
    }
}

