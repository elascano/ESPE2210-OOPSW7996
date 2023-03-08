package ec.edu.espe.Singleton.model;

public class USTax {
    private static USTax instance;
    private float ivaPercentage;
    
    private USTax(){}

    public static USTax getInstance() {
        if(instance == null) {
            instance = new USTax();
        }
        return instance;
    }
    
    public float getIvaPercentage() {
        return ivaPercentage;
    }

    public void setIvaPercentage(float ivaPercentage) {
        this.ivaPercentage = ivaPercentage;
    }
    
    public float salesTotal(float price) {
        float total;
        float iva;
        float roundedTotal;
        
        iva = price * ivaPercentage;
        total = price + iva;
        roundedTotal = (float) (Math.round(total * 100.0) / 100.0);
        
        return roundedTotal;
    }   
}