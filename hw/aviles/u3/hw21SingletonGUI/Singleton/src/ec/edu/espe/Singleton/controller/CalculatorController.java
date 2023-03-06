/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Singleton.controller;

import ec.edu.espe.Singleton.model;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class CalculatorController {
    
    public static float CalculateTotalPrice (float price){
        float totalPrice;
        USTax tax = USTax.getInstance();
        totalPrice = tax.salesTotal(price);
        return totalPrice;
    }
    
    public static float CalculateTaxValue(float price){
        float taxValue;
        USTax tax = USTax.getInstance();
        taxValue = tax.salesTotal(price) - price;
        return taxValue;
    }
}
