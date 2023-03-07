package ec.edu.espe.Tax.controller;

/**
 *
 * @author NICOLAY CHILLO, Gaman GeekLords at DCOO-ESPE
 */
public class Tax {
    
    public static float computeIVA(float base){
        float iva;
        float ivaTwoDecimal;
        iva = base * 0.12F;
        ivaTwoDecimal = Math.round(iva * 100.0F)/ 100.0F;
        return ivaTwoDecimal;
    }
    
     public static float computeSurplusFractionTax(float monthlySalary){
        float surplusFractionTax;
        float annualSalary;
        float surplusFractionTax2Decimal;
        surplusFractionTax = 0.00F;
        annualSalary = monthlySalary * 12;
        if(annualSalary < 11310){
            surplusFractionTax = (11310 - annualSalary) * 0.00F;
        }else if(annualSalary >= 11310 & annualSalary < 14410){
            surplusFractionTax = (14410 - annualSalary) * 0.05F;
        }else if(annualSalary >= 14410 & annualSalary < 18010){
            surplusFractionTax = (18010 - annualSalary) * 0.10F;
        }else if(annualSalary >= 18010 & annualSalary < 21630){
            surplusFractionTax = (21630 - annualSalary) * 0.12F;
        }else if(annualSalary >= 21630 & annualSalary < 31630){
            surplusFractionTax = (31630 - annualSalary) * 0.15F;
        }else if(annualSalary >= 31630 & annualSalary < 41630){
            surplusFractionTax = (41630 - annualSalary) * 0.20F;
        }else if(annualSalary >= 41630 & annualSalary < 51630){
            surplusFractionTax = (51630 - annualSalary) * 0.25F;
        }else if(annualSalary >= 51630 & annualSalary < 61630){
            surplusFractionTax = (61630 - annualSalary) * 0.30F;
        }else if(annualSalary >= 61630 & annualSalary < 100000){
            surplusFractionTax = (100000 - annualSalary) * 0.35F;
        }else if(annualSalary >= 100000){
            surplusFractionTax = annualSalary * 0.37F;
        }
        
        surplusFractionTax2Decimal = Math.round(surplusFractionTax * 100.0F)/100.0F;
        return surplusFractionTax2Decimal;
    }
    
    public static float computeRentTax(float monthlySalary, float surplusFractionTax){
        float rentTax;
        float rentTaxTwoDecimal;
        float annualSalary;
        rentTax = 0.00F;
        annualSalary = monthlySalary * 12;
        if(annualSalary < 11310){
            rentTax = 0.00F; 
        }else if(annualSalary >= 11310 & annualSalary < 14410){
            rentTax = 0.00F + surplusFractionTax;
        }else if(annualSalary >= 14410 & annualSalary < 18010){
            rentTax = 155.00F + surplusFractionTax;
        }else if(annualSalary >= 18010 & annualSalary < 21630){
            rentTax = 515.00F + surplusFractionTax;
        }else if(annualSalary >= 21630 & annualSalary < 31630){
            rentTax = 949.40F + surplusFractionTax;
        }else if(annualSalary >= 31630 & annualSalary < 41630){
            rentTax = 2449.39F + surplusFractionTax;
        }else if(annualSalary >= 41630 & annualSalary < 51630){
            rentTax = 4449.39F + surplusFractionTax;
        }else if(annualSalary >= 51630 & annualSalary < 61630){
            rentTax = 6949.39F + surplusFractionTax;
        }else if(annualSalary >= 61630 & annualSalary < 100000){
            rentTax = 9949.39F + surplusFractionTax;
        }else if(annualSalary >= 100000){
            rentTax = 23378.88F;
        }
        
        rentTaxTwoDecimal= Math.round(rentTax * 100.0F)/100.0F;
        return rentTaxTwoDecimal;
    }

}
