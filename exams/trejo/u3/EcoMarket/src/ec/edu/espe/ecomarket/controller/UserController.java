
package ec.edu.espe.ecomarket.controller;

import org.bson.Document;
import ec.edu.espe.ecomarket.model.User;
/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class UserController extends BasicController<User> {

    public UserController(User object, String collectionName) {
        super(object, collectionName);
    }

    public UserController() {
        super(new User(), "users");
    }
    public Document buildDocument(User user) {
        Document document = new Document();
        document.append("user", user.getUser()).
                append("password", user.getPassword());

        return document;
    }
}
