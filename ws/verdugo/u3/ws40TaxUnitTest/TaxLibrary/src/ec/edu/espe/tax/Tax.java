
package ec.edu.espe.tax;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Tax {
    
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    
    public static float computeRentTax(float netIncome, float expenses, float iessDeduction){
       float totalTax;
        float taxableBase;
        float basicFractionTax = 0;
        float basicFraction = 0;
        float surplusFraction;
        float percentageSurplusFraction = 0;

        if(netIncome < 0 || expenses < 0 || iessDeduction <0){
            return -1;
        }
        
        taxableBase = netIncome - expenses - iessDeduction;

        if (taxableBase <= 11310.00F) {
            basicFraction = 0;
            basicFractionTax = 0;
            percentageSurplusFraction = 0;

        } else if (taxableBase >= 11310.01F && taxableBase <= 14410.00F) {
            basicFraction = 11310.01F;
            basicFractionTax = 0;
            percentageSurplusFraction = 0.05F;

        } else if (taxableBase >= 14410.01F && taxableBase <= 18010.00F) {
            basicFraction = 14410.01F;
           basicFractionTax = 155;
           percentageSurplusFraction = 0.1F;

        } else if (taxableBase >= 18010.01F && taxableBase <= 21630.00F) {
            basicFraction = 18010.01F;
            basicFractionTax = 515;
            percentageSurplusFraction = 0.12F;

        } else if (taxableBase >= 21630.01F && taxableBase <= 31630.00F) {
            basicFraction = 21630.01F;
            basicFractionTax = 949;
            percentageSurplusFraction = 0.15F;            

        } else if (taxableBase >= 31630.01F && taxableBase <= 41630.00F) {
            basicFraction = 31630.01F;
            basicFractionTax = 2449;
            percentageSurplusFraction = 0.2F;

        } else if (taxableBase >= 41630.01F && taxableBase <= 51630.00F) {
            basicFraction = 41630.01F;
            basicFractionTax = 4449;
            percentageSurplusFraction = 0.25F;

        } else if (taxableBase >= 51630.01F && taxableBase <= 61630.00F) {
            basicFraction = 51630.01F;
            basicFractionTax = 6949;
            percentageSurplusFraction = 0.3F;

        } else if (taxableBase >= 61630.01F && taxableBase <= 100000.00F) {
            basicFraction = 61630.01F;
            basicFractionTax = 9949;
            percentageSurplusFraction = 0.35F;

        } else if (taxableBase >= 100000.01F) {
            basicFraction = 100000.01F;
            basicFractionTax = 23379;
            percentageSurplusFraction = 0.37F;
        }

        surplusFraction = (taxableBase - basicFraction) * percentageSurplusFraction;

        totalTax = surplusFraction + basicFractionTax;        

        return  (float) Math.round(totalTax * 100) / 100;
    } 
    
}
