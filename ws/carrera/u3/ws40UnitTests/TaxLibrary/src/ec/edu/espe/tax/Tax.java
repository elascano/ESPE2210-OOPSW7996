package ec.edu.espe.tax;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Tax {
   
    public static float computeNatualPersonIncomeTax(float annualSalary, float personalExpenses, float withholdings) throws ParseException{
        float basicFraction;
        float surplusFraction;
        float taxOnBasicFraction;
        float taxOnSurplusFraction;
        float rentTax;
        if(annualSalary > 0 && annualSalary <= 11310.00){
            basicFraction = 0.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 0.00F;
            taxOnSurplusFraction = 0.00F;   
        } else if (annualSalary > 11310.00 && annualSalary <= 14410.00){
            basicFraction = 11310.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 0.00F;
            taxOnSurplusFraction = 0.05F; 
        }else if (annualSalary > 14410.00 && annualSalary <= 18010.00){
            basicFraction = 14410.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 155.00F;
            taxOnSurplusFraction = 0.10F; 
        }else if (annualSalary > 18010.00 && annualSalary <= 21630.00){
            basicFraction = 18010.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 515.00F;
            taxOnSurplusFraction = 0.12F;
        }else if (annualSalary > 21630.00 && annualSalary <= 31630.00){
            basicFraction = 21630.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 949.40F;
            taxOnSurplusFraction = 0.15F;
        }else if (annualSalary > 31630.00 && annualSalary <= 41630.00){
            basicFraction = 31630.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 2449.40F;
            taxOnSurplusFraction = 0.20F;
        }else if (annualSalary > 41630.00 && annualSalary <= 51630.00){
            basicFraction = 41630.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 4449.40F;
            taxOnSurplusFraction = 0.25F;
        }else if (annualSalary > 51630.00 && annualSalary <= 61630.00){
            basicFraction = 51630.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 6949.40F;
            taxOnSurplusFraction = 0.30F;
        }else if (annualSalary > 61630.00 && annualSalary <= 100000.00){
            basicFraction = 61630.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 9949.40F;
            taxOnSurplusFraction = 0.35F;
        }else if (annualSalary > 100000.00){
            basicFraction = 100000.00F;
            surplusFraction = annualSalary - basicFraction;
            taxOnBasicFraction = 23378.90F;
            taxOnSurplusFraction = 0.37F;
        }else{
            System.out.println("We can't compute taxes of a negative number");
            return 0;
        }
        rentTax = (surplusFraction * taxOnSurplusFraction) + taxOnBasicFraction - personalExpenses - withholdings;
        DecimalFormat df = new DecimalFormat("#.##");
        String formatedRentTax = df.format(rentTax);
        Number roundedRentTax = df.parse( formatedRentTax);
        float convertedRentTax = roundedRentTax.floatValue();
        return convertedRentTax;
    }
     
    
    public static float computeIva(float base, float ivaPercentage) throws ParseException{
        float baseWithIva;
        if(base > 0){
        baseWithIva = base + base * ivaPercentage;
        DecimalFormat df = new DecimalFormat("#.##");
        String formatedRenTax = df.format(baseWithIva);
        Number roundedRentTax = df.parse(formatedRenTax);
        float convertedBaseWithIva = roundedRentTax.floatValue();
        return convertedBaseWithIva;
        }else{
            return 0;
        }
        
    }
    
}
    