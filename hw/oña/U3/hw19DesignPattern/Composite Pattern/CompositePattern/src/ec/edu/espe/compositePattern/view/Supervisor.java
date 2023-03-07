
package ec.edu.espe.compositePattern.view;

import ec.edu.espe.compositePattern.view.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
abstract class Supervisor extends Employee {
    protected List<Employee> directReports = new ArrayList<Employee>();

    public void stateName() {
        super.stateName(); // print name of this employee first
        if (directReports.size() > 0) { // be sure there are elements
            for (Employee employee : directReports) {
                employee.stateName();
            }
        }
    }

    public void add(Employee anEmployee) {
        this.directReports.add(anEmployee);
    }
}

