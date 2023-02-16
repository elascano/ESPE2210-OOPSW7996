package ec.edu.espe.taxes.model;

/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class TaxesModel {
    private static TaxesModel instance;
    private double tax;
    
    public void setTaxValue(double tax) {
        this.tax = tax;
    }
    private TaxesModel() {}
    
     public double geTaxValue() {
        return tax;
    }
    
    public static TaxesModel getInstance() {
        if(instance == null) {
            instance = new TaxesModel();
        }
        return instance;
    }
    
    

   
}
