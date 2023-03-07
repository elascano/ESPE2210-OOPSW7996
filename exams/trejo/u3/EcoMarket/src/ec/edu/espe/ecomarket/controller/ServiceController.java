
package ec.edu.espe.ecomarket.controller;
import org.bson.Document;
import ec.edu.espe.ecomarket.model.Position;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class ServiceController extends BasicController<Position> {
     public ServiceController(Position object, String collectionName) {
        super(object, collectionName);
    }
    
    public ServiceController() {
        super(new Position(), "services");
    }

    public Document buildDocument(Position service) {
        Document document = new Document();

        document.append("price", service.getPrice()).
                append("name", service.getName()).
                append("availableStylist", service.getAvailableStylist())
                .append("available", service.isAvailable());

        return document;
    }
 
}
