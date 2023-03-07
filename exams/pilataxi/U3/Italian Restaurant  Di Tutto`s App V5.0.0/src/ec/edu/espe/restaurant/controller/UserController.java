package ec.edu.espe.restaurant.controller;

import ec.edu.espe.restaurant.model.User;
import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class UserController extends CrudMongoDBController implements UserInterface{

    public UserController(String mongoCollection) {
        super(mongoCollection);
    }
    
    @Override
    public Document buildDocumentUser(User user) {
        Document document = new Document();
        document.append("username", user.getUsername()).
                append("password", user.getPassword());

        return document;    }   
}
