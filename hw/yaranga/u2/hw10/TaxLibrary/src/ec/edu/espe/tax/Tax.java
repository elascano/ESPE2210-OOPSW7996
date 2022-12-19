package ec.edu.espe.tax;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Tax {

    public static float computeIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computeIva(float base) {
        float value;
        value = base * 1.12F;//This information must be  centrallized somewhere 
        return value;
    }

    public static float computeRentTax(float salary, float costs) {
        float value;
        float iessContribution = (salary * 0.0945F) * 12;  //Assuming they are affiliates
        value = (salary * 12) - iessContribution - costs;

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

    public static float computeGreenTax(int cilindricalNumber, LocalDate purchaseDate) {
        float value = 0;
        float sectionRate = 0.0F;
        float antiquityFactor = 0.0F;
        Period antiquity = Period.between(purchaseDate, LocalDate.now());

        if (cilindricalNumber <= 1500) {
            sectionRate = 0.0F;
        }
        if (cilindricalNumber > 1500 && cilindricalNumber <= 2000) {
            sectionRate = 0.08F;
        }
        if (cilindricalNumber > 2000 && cilindricalNumber <= 2500) {
            sectionRate = 0.09F;
        }
        if (cilindricalNumber > 2500 && cilindricalNumber <= 3000) {
            sectionRate = 0.11F;
        }
        if (cilindricalNumber > 3000 && cilindricalNumber <= 3500) {
            sectionRate = 0.12F;
        }
        if (cilindricalNumber > 3500 && cilindricalNumber <= 4000) {
            sectionRate = 0.24F;
        }
        if (cilindricalNumber > 4000) {
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

        value = ((cilindricalNumber - 1500) * sectionRate) * (1 + antiquityFactor);

        return value;
    }
}
