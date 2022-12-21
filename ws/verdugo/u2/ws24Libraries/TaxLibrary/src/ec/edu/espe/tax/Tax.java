
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
    
    public static float computeGreenTax(int cylinderNumber, int antiquityInYears, boolean isHybrid){
        
        float totalTax;
        float cylinderStretchFactor = 0;
        float antiquityInYearsFactor = 0;

        if (cylinderNumber <= 1500 || antiquityInYears < 5) {
            totalTax = 0;
            return totalTax;
        }

        if (cylinderNumber <= 1500) {
            cylinderStretchFactor = 0;

        } else if (cylinderNumber >= 1501 && cylinderNumber <= 2000) {
            cylinderStretchFactor = 0.08F;

        } else if (cylinderNumber >= 2001 && cylinderNumber <= 2500) {
            cylinderStretchFactor = 0.09F;

        } else if (cylinderNumber >= 2501 && cylinderNumber <= 3000) {
            cylinderStretchFactor = 0.11F;

        } else if (cylinderNumber >= 3001 && cylinderNumber <= 3500) {
            cylinderStretchFactor = 0.12F;

        } else if (cylinderNumber >= 3501 && cylinderNumber <= 4000) {
            cylinderStretchFactor = 0.24F;

        } else if (cylinderNumber >= 4000) {
            cylinderStretchFactor = 0.35F;
        }

        if (isHybrid) {
            antiquityInYearsFactor = -0.2F;
        } else if (antiquityInYears < 5) {
            antiquityInYearsFactor = 0;

        } else if (antiquityInYears >= 5 && antiquityInYears <= 10) {
            antiquityInYearsFactor = 0.05F;

        } else if (antiquityInYears >= 11 && antiquityInYears <= 15) {
            antiquityInYearsFactor = 0.1F;

        } else if (antiquityInYears >= 16 && antiquityInYears <= 20) {
            antiquityInYearsFactor = 0.15F;

        } else if (antiquityInYears >= 20) {
            antiquityInYearsFactor = 0.2F;
        }

        totalTax = ((cylinderNumber - 1500) * cylinderStretchFactor) * (1 + antiquityInYearsFactor);

        return (float) Math.round(totalTax * 100) / 100;
    }
    
    public static float computeRentTax(float netIncome, float expenses, float iessDeduction){
       float totalTax;
        float taxableBase;
        float basicFractionTax = 0;
        float basicFraction = 0;
        float surplusFraction;
        float percentageSurplusFraction = 0;

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
    
    public static float computeIva(float base){
        float iva;
        iva = base * 0.12F;// debe estar localizado en otro lado
        return (float) Math.round(iva * 100) / 100;
    }
}
