package ec.edu.espe.composite.model;

import java.util.Vector;

/**
 *
 * @author Alejandro Cuadrado,DCCO-ESPE
 */
public abstract class Supervisor extends Employee {

    protected Vector directReports = new Vector();

    @Override
    public void stateName() {
        super.stateName();	// print name of this employee first 
        if (!directReports.isEmpty()) // be sure there are elements
        {
            for (int i = 0; i < directReports.size(); ++i) {
                ((Employee) directReports.elementAt(i)).stateName();
            }
        }
    }

    public void add(Employee anEmployee) {
        this.directReports.addElement(anEmployee);
    }

}
