package ec.edu.espe.tax;

import java.time.LocalDate;
import java.time.Period;


public class Tax {
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        iva = Math.round(iva * 100.0F) / 100.0F;
        return iva;
    }
    
   public static float computeRentTax(float monthlySalary){
        float annualSalary, rentTaxPercentage, basicFractionTax, basicFraction, rentTaxAnnual = 0;
        annualSalary = monthlySalary*12;
        if (annualSalary<=11310.00F) {
            basicFraction=0.00F;
            rentTaxPercentage=0.00F;
            basicFractionTax=0.00F;
        }else if (annualSalary<=14410.00F){
            basicFraction=11310.01F;
            rentTaxPercentage=0.05F;
            basicFractionTax=0.00F;
        }else if (annualSalary<=18010.00F){
            basicFraction=14410.01F;
            rentTaxPercentage=0.10F;
            basicFractionTax=155.00F;
        }else if (annualSalary<=21630.00F){
            basicFraction=18010.01F;
            rentTaxPercentage=0.12F;
            basicFractionTax=515.00F;
        }else if (annualSalary<=31630.00F){
            basicFraction=21630.01F;
            rentTaxPercentage=0.15F;
            basicFractionTax=949.00F;
        }else if (annualSalary<=41630.00F){
            basicFraction=31630.01F;
            rentTaxPercentage=0.20F;
            basicFractionTax=2449.00F;
        }else if (annualSalary<=51630.00F){
            basicFraction=41630.01F;
            rentTaxPercentage=0.25F;
            basicFractionTax=4449.00F;
        }else if (annualSalary<=61630.00F){
            basicFraction=51630.01F;
            rentTaxPercentage=0.30F;
            basicFractionTax=6949.00F;
        }else if (annualSalary<=100000.00F){
            basicFraction=61630.01F;
            rentTaxPercentage=0.35F;
            basicFractionTax=9949.00F;
        }else{
            basicFraction=100000.01F;
            rentTaxPercentage=0.37F;
            basicFractionTax=23379.00F;
        }
        rentTaxAnnual=Math.round(rentTaxAnnual * 100.0F) / 100.0F;
        rentTaxAnnual= Math.round(rentTaxAnnual * 100.0F) / 100.0F;

        return rentTaxAnnual;
    }
    
    
}
