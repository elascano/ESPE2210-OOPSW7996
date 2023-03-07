package ec.edu.espe.tax;

/**
 *
 * @author Elkin Pabon, GitSoft TEAM, DCCO-ESPE
 */

public class Tax {
    
     private float ivaPercentage;
    
    public float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;    
    }

    public float computeIva(float base){
        float iva;
        iva = base * 0.12F;
        return iva;
    }
}
