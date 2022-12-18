
package ec.edu.espe.tax;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 *  @author christopher bazurto, DeltaTeam,DCCO-ESPE
 */
public class Tax {
    public static float computeIva (float base,float ivaPercentage){
        float iva;
        iva = base*ivaPercentage;
        return iva;
    }
    public static float computeIva (float base){
        float iva;
        iva = base*0.12F;
        return iva;
    }
     public static float computeGreenTax(int ccNumber, LocalDate shopDate) {
        float greenTax = 0;
        float ccNumberRate = 0;
        float ancientFactor = 0;
        
        Period ancient = Period.between(shopDate, LocalDate.now());
        
        if (ccNumber <= 1500) {
            ccNumberRate = 0.0F;
        }else if (ccNumber > 1500 && ccNumber <= 2000) {
            ccNumberRate = 0.08F;
        }else if (ccNumber > 2000 && ccNumber <= 2500) {
            ccNumberRate = 0.09F;
        }else if (ccNumber > 2500 && ccNumber <= 3000) {
            ccNumberRate = 0.11F;
        }else  if (ccNumber > 3000 && ccNumber <= 3500) {
            ccNumberRate = 0.12F;
        }else if (ccNumber > 3500 && ccNumber <= 4000) {
            ccNumberRate = 0.24F;
        }else if (ccNumber > 4000) {
            ccNumberRate = 0.35F;
        }
        if (ancient.getYears() < 5) {
            ancientFactor = 0;
        }else if (ancient.getYears() >= 5 && ancient.getYears() <= 10) {
            ancientFactor = 0.05F;
        }else if (ancient.getYears() > 10 && ancient.getYears() <= 15) {
            ancientFactor = 0.10F;
        }else if (ancient.getYears() > 15 && ancient.getYears() <= 20) {
            ancientFactor = 0.15F;
        }else if (ancient.getYears() > 20) {
            ancientFactor = 0.20F;
        }

        greenTax = ((ccNumber - 1500) * ccNumberRate) * (1 + ancientFactor);

        return greenTax;
    }
    public static float computeRentTax(float salary, float spent) {
        float value;
        float iessContribution; 
        float rentTax=0;
        iessContribution = (salary * 0.0945F) * 12;
        value = (salary * 12) - iessContribution - spent;

        if (value <= 11310.00F) {
            rentTax = value * 0;
        }else if (value > 11310.00F && value <= 14410.00F) {
            rentTax = (value - 11310.00F) * 0.05F;
        }else if (value > 14410.00F && value <= 18010.00F) {
            rentTax = ((value - 14410.00F) * 0.10F) + 155.00F;
        }else if (value > 18010.00F && value <= 21630.00F) {
            rentTax = ((value - 18010.00F) * 0.12F) + 515.00F;
        }else if (value > 21630.00F && value <= 31630.00F) {
            rentTax = ((value - 21630.00F) * 0.15F) + 949.40F;
        }else if (value > 31630.00F && value <= 41630.00F) {
            rentTax = ((value - 31630.00F) * 0.20F) + 2449.40F;
        }else if (value > 41630.00F && value <= 51630.00F) {
            rentTax = ((value - 41630.00F) * 0.25F) + 4449.40F;
        }else if (value > 51630.00F && value <= 61630.00F) {
            rentTax = ((value - 51630.00F) * 0.30F) + 6949.40F;
        }else if (value > 61630.00F && value <= 100000.00F) {
            rentTax = ((value - 51630.00F) * 0.35F) + 9949.40F;
        }else if (value > 100000.00F) {
            rentTax = ((value - 100000.00F) * 0.37F) + 23378.88F;
        }

        return rentTax;
    }
}
