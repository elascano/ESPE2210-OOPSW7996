package ec.edu.espe.taxes.controller;

import ec.edu.espe.taxes.model.taxesUtah;

/**
 *
 * @author Jerly Reinoso, Search Engine Bandits, DCCO-ESPE
 */
public class utahCalc {
    public static double computeProductPrice(double price){
        taxesUtah taxeInstance = taxesUtah.getInstance();
        double tax = taxeInstance.geTaxValue();
        
        return price+(price*tax)/100;
    }
}