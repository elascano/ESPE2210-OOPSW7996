package ec.edu.espe.tax;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Tax {
    
   
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    
    public static float computeIva(float base){
        float iva;
        iva = base * 0.12F;
        return iva;
    }
    
    public static float computeRenTax(float wage, float costs){
        float total;
        float contribution;
        contribution = (wage * 0.0945F) * 12;
        total = (wage * 12) - contribution - costs;
        if (total <= 11310.00F) {
            total = total * 0;
        }else if (total > 11310.00F && total <= 14410.00F) {
            total = (total - 11310.00F) * 0.05F;
        }else if (total > 14410.00F && total <= 18010.00F) {
            total = ((total - 14410.00F) * 0.10F) + 155.00F;
        }else if (total > 18010.00F && total <= 21630.00F) {
            total = ((total - 18010.00F) * 0.12F) + 515.00F;
        }else if (total > 21630.00F && total <= 31630.00F) {
            total = ((total - 21630.00F) * 0.15F) + 949.40F;
        }else if (total > 31630.00F && total <= 41630.00F) {
            total = ((total - 31630.00F) * 0.20F) + 2449.40F;
        }else if (total > 41630.00F && total <= 51630.00F) {
            total = ((total - 41630.00F) * 0.25F) + 4449.40F;
        }else if (total > 51630.00F && total <= 61630.00F) {
            total = ((total - 51630.00F) * 0.30F) + 6949.40F;
        }else if (total > 61630.00F && total <= 100000.00F) {
            total = ((total - 51630.00F) * 0.35F) + 9949.40F;
        }else if (total > 100000.00F) {
            total = ((total - 100000.00F) * 0.37F) + 23378.88F;
        }
        return total;
    }
    
    public static float computeGreenTax(int numberCylindrical, LocalDate purchaseDate){
        float total = 0.0F;
        float tarrif = 0.0F;
        float antiqueValue = 0.0F;
        Period antiquity = Period.between(purchaseDate, LocalDate.now());
        
        if (numberCylindrical <= 1500) {
            tarrif = 0.0F;
        }
        if (numberCylindrical > 1500 && numberCylindrical <= 2000) {
            tarrif = 0.08F;
        }
        if (numberCylindrical > 2000 && numberCylindrical <= 2500) {
            tarrif = 0.09F;
        }
        if (numberCylindrical > 2500 && numberCylindrical <= 3000) {
            tarrif = 0.11F;
        }
        if (numberCylindrical > 3000 && numberCylindrical <= 3500) {
            tarrif = 0.12F;
        }
        if (numberCylindrical > 3500 && numberCylindrical <= 4000) {
            tarrif = 0.24F;
        }
        if (numberCylindrical > 4000) {
            tarrif = 0.35F;
        }
        
        if (antiquity.getYears() < 5) {
            antiqueValue = 0;
        }else if (antiquity.getYears() >= 5 && antiquity.getYears() <= 10) {
            antiqueValue = 0.05F;
        }else if (antiquity.getYears() > 10 && antiquity.getYears() <= 15) {
            antiqueValue = 0.10F;
        }else if (antiquity.getYears() > 15 && antiquity.getYears() <= 20) {
            antiqueValue = 0.15F;
        }else if(antiquity.getYears() > 20){
            antiqueValue = 0.20F;
        }
        
        total = ((numberCylindrical - 1500) * tarrif) * (1 + antiqueValue);
        
        return total;
    }
    
    
}
