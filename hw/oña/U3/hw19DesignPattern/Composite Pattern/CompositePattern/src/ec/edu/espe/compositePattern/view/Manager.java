
package ec.edu.espe.compositePattern.view;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
class Manager extends Supervisor {
    public Manager(String aName) {
        this();
        name = aName;
    }

    public Manager() {
        super();
        title = "Manager";
    }

    public void stateName() {
    System.out.println("Name: " + name);
    System.out.println("Title: " + title);
    super.stateName();
}

}
