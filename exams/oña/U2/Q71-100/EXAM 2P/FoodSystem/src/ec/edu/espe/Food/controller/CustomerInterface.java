package ec.edu.espe.Food.controller;

import org.bson.Document;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public interface CustomerInterface {
public Document RegisterAndBuildDocument(String fullNames,String surnames,String food, String cost, String paymentMethod);
 
}
