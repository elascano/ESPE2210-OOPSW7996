package ec.edu.espe.uscalculator.controller;

public class USTax {
    private static USTax instance;
    private float tax;
    private USTax(){
        this.tax = 12.0F;
    }; 
    
    public void modifyTax(float tax){
        this.tax = tax;
    }
    
    public static USTax getInstance() {
        if(instance == null){ 
            instance = new USTax();
        }
        return instance;
    }
    
    public float salesTotal(float price) {
        float tax = price * 0.0485f;
        float total = price + tax;

        return total;
    }
}
