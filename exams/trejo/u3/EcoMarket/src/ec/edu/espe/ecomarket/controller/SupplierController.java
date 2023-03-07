
package ec.edu.espe.ecomarket.controller;

import org.bson.Document;
import ec.edu.espe.ecomarket.model.Supplier;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class SupplierController extends BasicController<Supplier> {

    public SupplierController(Supplier object, String collectionName) {
        super(object, collectionName);
    }
    public SupplierController() {
        super(new Supplier(), "suppliers");
    }

    public Document buildDocument(Supplier supplier) {
        Document document = new Document();

        document.append("number", supplier.getNumber()).
                append("name", supplier.getName()).
                append("pendingPayment", supplier.getPendingPayment()).
                append("address", supplier.getAddress());

        return document;
    }

}