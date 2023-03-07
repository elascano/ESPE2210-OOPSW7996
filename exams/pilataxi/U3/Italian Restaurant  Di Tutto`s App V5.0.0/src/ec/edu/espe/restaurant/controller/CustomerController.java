package ec.edu.espe.restaurant.controller;

import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class CustomerController extends CrudMongoDBController implements CrudMongoDBInterface{
    
    public CustomerController(String mongoCollection) {
        super(mongoCollection);
    } 
  
    public Document RegisterAndBuildDocument(String firstName, String lastName, String identification, String cellphone, String email, String food, String cost, String note, String date, String hourOfAttention) {
        Document document = new Document("firstName", firstName)
            .append("lastName", lastName)
            .append("identification", identification)
            .append("cellphone", cellphone)
            .append("email", email)
            .append("food", food)
            .append("cost", cost + " $")
            .append("note", note)
            .append("date", date)
            .append("hourOfAttention",hourOfAttention);

    return document;
    }
    public double calculateTotalCost(double cost, double sessions){
        double totalCost;
        return  totalCost = cost*sessions;   
    }
}
