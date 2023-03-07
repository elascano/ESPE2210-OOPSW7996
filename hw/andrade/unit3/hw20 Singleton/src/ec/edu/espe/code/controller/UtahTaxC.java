
package ec.edu.espe.code.controller;

import ec.edu.espe.code.model.USATax;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class UtahTaxC {
    
    public static float calculateTax(float value){
        USATax taxUtah = USATax.getInstance();
        float tax = taxUtah.getTax();
        
        return value + (value * tax) / 100; 
    }
    
}
