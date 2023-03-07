package ec.edu.espe.restaurant.controller;

import ec.edu.espe.restaurant.model.User;
import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public interface UserInterface {
    public Document buildDocumentUser(User user);
}
