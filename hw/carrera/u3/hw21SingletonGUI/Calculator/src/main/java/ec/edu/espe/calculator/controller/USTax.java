package ec.edu.espe.calculator.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class USTax {
    private static USTax instance;
    private float taxPercentage;

    private USTax() {
    }

    public float getTaxPercentage() {
        return taxPercentage;
    }

    public void modifyTaxPercentage(float ivaPercentage) {
        this.taxPercentage = ivaPercentage;
    }

    public static USTax getInstance(){
        if(instance == null){
            instance = new USTax();
        }
        return instance;      
    }
        
    public float computeSalesTotal(float price){
        float salePrice;
        salePrice = roundToTwoDecimalPlaces(price + price*taxPercentage/100);
        return salePrice;      
    }
    
    private static float roundToTwoDecimalPlaces(float number){
        BigDecimal bd = new BigDecimal(number);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        float convertedNumber = Float.parseFloat(String.valueOf(roundedNumber));
        return convertedNumber;
    }
}
