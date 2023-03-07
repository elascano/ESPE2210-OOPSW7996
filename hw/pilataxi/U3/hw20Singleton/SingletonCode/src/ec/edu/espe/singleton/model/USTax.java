
package ec.edu.espe.singleton.model;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private float tax;
    private USTax(){        
        this.tax = 12.0F;
    }
    
    public void modifyTax(float tax){
        this.tax = tax;
    }
    
    public static USTax getInstance(){
        if (instance == null)
            instance = new USTax();
        return instance;
    }
    
    public float salesTotal(float sales){
        float taxReal = sales * this.tax/100;
        float total = sales + taxReal;        
        return total;
    }

    public float getTax() {
        return tax;
    }
}
