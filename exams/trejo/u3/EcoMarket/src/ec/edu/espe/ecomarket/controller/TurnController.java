
package ec.edu.espe.ecomarket.controller;

import org.bson.Document;
import ec.edu.espe.ecomarket.model.Turn;
/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class TurnController extends BasicController<Turn> {

    public TurnController(Turn object, String collectionName) {
        super(object, collectionName);
    }
    public TurnController() {
        super(new Turn(), "turns");
    }
    

    public Document buildDocument(Turn  turn) {
        Document document = new Document();

        document.append("id", turn.getId()).
                append("date", turn.getDate()).
                append("customer", turn.getCustomer()).
                append("service", turn.getService());
                

        return document;
    }
}
