/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.taxes.controller;

import ec.edu.espe.taxes.model.TaxesUtah;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class UtahCalc {
    public static double computeProductPrice(double price){
        TaxesUtah taxeInstance = TaxesUtah.getInstance();
        double tax = taxeInstance.geTaxValue();
        
        return price+(price*tax)/100;
    }
}
