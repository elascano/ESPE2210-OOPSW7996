package ec.edu.espe.calculator.controller;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class TaxOperation {

    public static DecimalFormat formatter = new DecimalFormat(".0000");

    public static double computeIva(double base, double ivaPercentage) {
        double totalValue;
        totalValue = base + base * ivaPercentage;
         totalValue = (double)Math.round(totalValue * 10000d) / 10000d;
        return totalValue;
    }

    public static double computeIva(double base) {
        double value;
        value = base * 1.12;//This information must be  centrallized somewhere 
        return value;
    }

    public static double computeRentTax(double salary, double costs) {
        double value;
        double iessContribution = (salary * 0.0945) * 12;  //Assuming they are affiliates
        value = (salary * 12) - iessContribution - costs;

        if (value <= 11310.00) {
            value = value * 0;
        }
        if (value > 11310.00 && value <= 14410.00) {
            value = (value - 11310.00) * 0.05;
        }
        if (value > 14410.00 && value <= 18010.00) {
            value = ((value - 14410.00) * 0.10) + 155.00;
        }
        if (value > 18010.00 && value <= 21630.00) {
            value = ((value - 18010.00) * 0.12) + 515.00;
        }
        if (value > 21630.00 && value <= 31630.00) {
            value = ((value - 21630.00) * 0.15) + 949.40;
        }
        if (value > 31630.00 && value <= 41630.00) {
            value = ((value - 31630.00) * 0.20) + 2449.40;
        }
        if (value > 41630.00 && value <= 51630.00F) {
            value = ((value - 41630.00) * 0.25) + 4449.40;
        }
        if (value > 51630.00 && value <= 61630.00) {
            value = ((value - 51630.00) * 0.30) + 6949.40;
        }
        if (value > 61630.00 && value <= 100000.00) {
            value = ((value - 51630.00) * 0.35) + 9949.40;
        }
        if (value > 100000.00) {
            value = ((value - 100000.00) * 0.37) + 23378.88;
        }
        value = (double)Math.round(value * 1000d) / 1000d;
        
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
