package ec.edu.espe.shopinventory_v2.model;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public abstract class ProductWithVAT extends Product { 
   
    public static float computeVAT(float base) {
        float iva;
        iva = base * 0.12F;
        return iva;
    }
    
}
