/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.apanadossystem.controller;

import ec.edu.espe.apanadossystem.model.RestaurantTax;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class TaxCalculatorController {
    
    public static float CalculateTotalPrice (float price){
        float totalPrice;
        RestaurantTax tax = RestaurantTax.getInstance();
        totalPrice = tax.salesTotal(price);
        return totalPrice;
    }
    
    public static float CalculateTaxValue(float price){
        float taxValue;
        RestaurantTax tax = RestaurantTax.getInstance();
        taxValue = tax.salesTotal(price) - price;
        return taxValue;
    }
}
