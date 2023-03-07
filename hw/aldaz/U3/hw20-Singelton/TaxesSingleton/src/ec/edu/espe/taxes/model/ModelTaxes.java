package ec.edu.espe.taxes.model;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class ModelTaxes {
    private static ModelTaxes instance;
    private double tax;
    
    public void setTaxValue(double tax) {
        this.tax = tax;
    }
    private ModelTaxes() {}
    
     public double geTaxValue() {
        return tax;
    }
    
    public static ModelTaxes getInstance() {
        if(instance == null) {
            instance = new ModelTaxes();
        }
        return instance;
    }
    
    

   
}
