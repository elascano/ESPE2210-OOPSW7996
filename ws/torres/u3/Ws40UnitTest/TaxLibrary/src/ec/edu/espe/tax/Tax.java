 
package ec.edu.espe.tax;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Tax {
    
    
    public static float computeIva(float base, float ivaPercentage){
        
        float iva;
        iva = base * ivaPercentage;
        return iva;

}
    
    public static float computeGreenTax(int numberOfCylindrical, LocalDate purchaseDate){
        
        float value;
        float sectionRate = 0.0F;
        float antiquityFactor = 0.0F;
        Period antiquity = Period.between(purchaseDate, LocalDate.now());

        if (numberOfCylindrical <= 1500) {
            sectionRate = 0.0F;
        }
        if (numberOfCylindrical > 1500 && numberOfCylindrical <= 2000) {
            sectionRate = 0.08F;
        }
        if (numberOfCylindrical > 2000 && numberOfCylindrical <= 2500) {
            sectionRate = 0.09F;
        }
        if (numberOfCylindrical > 2500 && numberOfCylindrical <= 3000) {
            sectionRate = 0.11F;
        }
        if (numberOfCylindrical > 3000 && numberOfCylindrical <= 3500) {
            sectionRate = 0.12F;
        }
        if (numberOfCylindrical > 3500 && numberOfCylindrical <= 4000) {
            sectionRate = 0.24F;
        }
        if (numberOfCylindrical > 4000) {
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

        value = ((numberOfCylindrical - 1500) * sectionRate) * (1 + antiquityFactor);
        return value;
        
    }
    
    public static float computeRentTax(float monthlySalary, float costs){
       float value;
        float iessContribution = (monthlySalary * 0.0945F) * 12;  //Assuming they are affiliates
        value = (monthlySalary * 12) - iessContribution - costs;

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
    
    public static float computeIva(float base){
        
        float iva;
        iva = base * 0.12F;
        return iva;

}
    
}
