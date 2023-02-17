package ec.espe.edu.calculator.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class USTax {
    private static USTax instance;
    private static float ivaPercentage;

    private USTax() {
    }

    public float getIvaPercentage() {
        return roundToTwoDecimalPlaces(ivaPercentage * 100.00F);
    }

    public void setIvaPercentage(float ivaPercentage) {
        USTax.ivaPercentage = ivaPercentage;
    }

    public static USTax getInstance(){
        if(instance == null){
            instance = new USTax();
        }
        return instance;      
    }
        
    public float computeSalesTotal(float price){
        float priceWithIVA;
        priceWithIVA = roundToTwoDecimalPlaces(price+ price*ivaPercentage);
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
