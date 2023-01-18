package ec.edu.espe.Food.controller;

import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class CustomerController extends CrudMongoDBController implements CustomerInterface{

    public CustomerController(String mongoCollection) {
        super(mongoCollection);
    } 

    @Override
    public Document RegisterAndBuildDocument(String fullNames, String surnames, String food, String cost, String paymentMethod) {
        Document document = new Document("fullNames", fullNames)
            .append("surnames", surnames)
            .append("food", food)
            .append("cost", cost)
            .append("paymentMethod", paymentMethod);

    return document;
    }
}
