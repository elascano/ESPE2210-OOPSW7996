package ec.edu.espe.uscalculator.controller;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class USTax {
    private float tax;
    private static USTax instance;
    
    private USTax(float taxValue){
        tax = taxValue;
    }
    
    public static USTax getInstance(float taxValue) {
        if(instance == null){
            instance = new USTax(taxValue);
        }else{
            System.out.println("This variable has already been instantied");
        }
        return instance;
    }
    public float salesTotal(float purchaseValue) {
        float totalValue;
        totalValue = purchaseValue + purchaseValue*tax;
        return totalValue;
    }

    public float getTax() {
        return tax;
    }
}
