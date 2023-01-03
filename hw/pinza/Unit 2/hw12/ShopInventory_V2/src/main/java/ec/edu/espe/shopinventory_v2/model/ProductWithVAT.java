/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shopinventory_v2.model;

/**
 *
 * @author Juan Pinza, Search Engine Bandits , DCCO-ESPE
 */
public abstract class ProductWithVAT extends Product {

    
    
   
    public static float computeVAT(float base) {
        float iva;
        iva = base * 0.12F;
        return iva;
    }
    
}
