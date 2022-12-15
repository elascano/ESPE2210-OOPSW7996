package ec.edu.espe.ws09.controller;

import ec.edu.espe.ws09.model.Customer;
import ec.edu.espe.ws09.model.Sandwich;
import java.util.ArrayList;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class MoneyManager {
    public static float calculateTotalPurchase(ArrayList<Sandwich> sandwiches){
        float total;
        total = 0;
        
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();
        }
        return total;
    }
    
    public static float calculateChange(Customer customer, float total){
        float change;
        change = customer.getCash()-total;
        
         return change;
    }
}
