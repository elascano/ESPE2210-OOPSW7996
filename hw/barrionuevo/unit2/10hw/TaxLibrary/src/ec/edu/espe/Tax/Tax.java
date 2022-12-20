
package ec.edu.espe.Tax;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Lindsay Barrionuevo, DeltaTeam, DCCO-ESPE
 */

public class Tax {

    public static float computeIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computeGreenTax(int cylinderCapacity, LocalDate purchaseDate) {
        float value = 0;
        float sectionRate = 0.0F;
        float antiquityFactor = 0.0F;
        Period antiquity = Period.between(purchaseDate, LocalDate.now());

        if (cylinderCapacity <= 1500) {
            sectionRate = 0.0F;
        }
        if (cylinderCapacity > 1500 && cylinderCapacity <= 2000) {
            sectionRate = 0.08F;
        }
        if (cylinderCapacity > 2000 && cylinderCapacity <= 2500) {
            sectionRate = 0.09F;
        }
        if (cylinderCapacity > 2500 && cylinderCapacity <= 3000) {
            sectionRate = 0.11F;
        }
        if (cylinderCapacity > 3000 && cylinderCapacity <= 3500) {
            sectionRate = 0.12F;
        }
        if (cylinderCapacity > 3500 && cylinderCapacity <= 4000) {
            sectionRate = 0.24F;
        }
        if (cylinderCapacity > 4000) {
            sectionRate = 0.35F;
        }
        if (antiquity.getYears() < 5) {
            antiquityFactor = 0;
        }
        if (antiquity.getYears() >= 5 && antiquity.getYears() <= 10) {
            antiquityFactor = 0.05F;
        }
        if (antiquity.getYears() > 10 && antiquity.getYears() <= 15) {
            antiquityFactor = 0.10F;
        }
        if (antiquity.getYears() > 15 && antiquity.getYears() <= 20) {
            antiquityFactor = 0.15F;
        }
        if (antiquity.getYears() > 20) {
            antiquityFactor = 0.20F;
        }

        value = ((cylinderCapacity - 1500) * sectionRate) * (1 + antiquityFactor);
        return value;
    }

    public static float computeRentTax(float income, float billAccount) {
        float value;
        float iessContribution = (income * 0.0945F) * 12;  
        value = (income * 12) - iessContribution - billAccount;

        if (value <= 11310.00F) {
            value = value * 0;
        }
        if (value > 11310.00F && value <= 14410.00F) {
            value = (value - 11310.00F) * 0.05F;
        }
        if (value > 14410.00F && value <= 18010.00F) {
            value = ((value - 14410.00F) * 0.10F) + 155.00F;
        }
        if (value > 18010.00F && value <= 21630.00F) {
            value = ((value - 18010.00F) * 0.12F) + 515.00F;
        }
        if (value > 21630.00F && value <= 31630.00F) {
            value = ((value - 21630.00F) * 0.15F) + 949.40F;
        }
        if (value > 31630.00F && value <= 41630.00F) {
            value = ((value - 31630.00F) * 0.20F) + 2449.40F;
        }
        if (value > 41630.00F && value <= 51630.00F) {
            value = ((value - 41630.00F) * 0.25F) + 4449.40F;
        }
        if (value > 51630.00F && value <= 61630.00F) {
            value = ((value - 51630.00F) * 0.30F) + 6949.40F;
        }
        if (value > 61630.00F && value <= 100000.00F) {
            value = ((value - 51630.00F) * 0.35F) + 9949.40F;
        }
        if (value > 100000.00F) {
            value = ((value - 100000.00F) * 0.37F) + 23378.88F;
        }

        return value;
    }

    public static float computeIva(float base) {
        float iva;
        iva = base * 0.12F; 
        return iva;
    }

}