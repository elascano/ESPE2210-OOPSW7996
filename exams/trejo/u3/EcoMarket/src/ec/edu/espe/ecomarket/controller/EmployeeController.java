
package ec.edu.espe.ecomarket.controller;

import ec.edu.espe.ecomarket.model.Employee;
import org.bson.Document;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class EmployeeController extends BasicController<Employee> {

    public EmployeeController(Employee object, String collectionName) {
        super(object, collectionName);
    }

    public EmployeeController() {
        super(new Employee(), "employee");
    }

    public Document buildDocument(Employee stylist) {
        Document document = new Document();

        document.append("identificationCard", stylist.getIdentificationCard()).
                append("name", stylist.getName()).
                append("number", stylist.getNumber()).
                append("payment", stylist.getPayment()).
                append("service", stylist.getService()).
                append("address", stylist.getAddress());

        return document;
    }

}
