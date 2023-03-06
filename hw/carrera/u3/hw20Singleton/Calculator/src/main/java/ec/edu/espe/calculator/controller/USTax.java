package ec.edu.espe.calculator.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class USTax {
    private static USTax instance;
    private float ivaPercentage;

    private USTax() {
    }

    public float getIvaPercentage() {
        return ivaPercentage;
    }

    public void modifyIvaPercentage(float ivaPercentage) {
        this.ivaPercentage = ivaPercentage;
    }

    public static USTax getInstance(){
        if(instance == null){
            instance = new USTax();
        }
        return instance;      
    }
        
    public float computeSalesTotal(float price){
        float priceWithIVA;
        priceWithIVA = roundToTwoDecimalPlaces(price + price*ivaPercentage/100);
        return priceWithIVA;      
    }
    
    private static float roundToTwoDecimalPlaces(float number){
        BigDecimal bd = new BigDecimal(number);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        float convertedNumber = Float.parseFloat(String.valueOf(roundedNumber));
        return convertedNumber;
    }
}
