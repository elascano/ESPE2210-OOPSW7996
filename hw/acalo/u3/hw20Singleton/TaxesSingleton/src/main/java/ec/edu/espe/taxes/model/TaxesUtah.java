/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.taxes.model;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */

public class TaxesUtah {
    private static TaxesUtah instance;
    private double taxValue;
    
    private TaxesUtah() {}
    
    public static TaxesUtah getInstance() {
        if(instance == null) {
            instance = new TaxesUtah();
        }
        return instance;
    }
    
    public void setTaxValue(double taxValue) {
        this.taxValue = taxValue;
    }

    public double geTaxValue() {
        return taxValue;
    }
}
