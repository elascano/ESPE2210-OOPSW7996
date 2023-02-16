package ec.edu.espe.uscalculator.controller;

//@author Martín Suquillo, WebMasterTeam, DCCO-ESPE

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
        
        System.out.println("Price: $" + price);
        System.out.println("Tax: $ 4.85%");
        System.out.println("Sales total: " + total);
        return total;
    }
}
