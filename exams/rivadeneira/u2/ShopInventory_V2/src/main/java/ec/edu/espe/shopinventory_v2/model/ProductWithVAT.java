/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.model;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public abstract class ProductWithVAT extends Product {

    /**
     * @return the priceWithVAT
     */
    public float getPriceWithVAT() {
        return priceWithVAT;
    }

    /**
     * @param pricesWithVAT the priceWithVAT to set
     */
    public void setPriceWithVAT(float pricesWithVAT) {
        this.priceWithVAT = pricesWithVAT;
    }
    
    private float priceWithVAT;

    
    
    public static float computeVAT(float base) {
        float iva;
        iva = base * 1.12F;
        
        return iva;
    }
    
}
