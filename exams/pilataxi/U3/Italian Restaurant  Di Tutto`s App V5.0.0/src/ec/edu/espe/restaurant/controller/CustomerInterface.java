package ec.edu.espe.restaurant.controller;

import org.bson.Document;


/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public interface CustomerInterface {
    public Document RegisterAndBuildDocument(String firstName,String lastName, String identification, String cellphone, String email,String food, String cost, String note, String date, String hourOfAttention);
    public void calculateTotalCost();
}


