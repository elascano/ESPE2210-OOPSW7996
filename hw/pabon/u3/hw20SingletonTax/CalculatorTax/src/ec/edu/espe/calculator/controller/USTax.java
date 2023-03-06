package ec.edu.espe.calculator.controller;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class USTax {
    
    private static USTax instance;
    private USTax(){}; 
    
    public static USTax getInstance() {
        
        if(instance == null){ 
            instance = new USTax();
        }
        return instance;
        
    }
    
    public float salesTotal(float price) {
        
        float tax = price * 0.0485f;
        float total = price + tax;
        
        System.out.println("- Price: $" + price);
        System.out.println("- Tax:    0.485%");
        System.out.println("- TOTAL: " + total);
        
        return total;
    }
}
