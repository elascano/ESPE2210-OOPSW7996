package ec.edu.espe.tax;

/**
 *
 * @author Nicolay Chillo, Gaman GeekLords at DCOO-ESPE
 */
public class Tax {
    public static float computeIVA(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    public static float computeValueOfEspecificTax(int cylinderCapacity){
       float valueOfEspecificTax;
       valueOfEspecificTax = 0.00F;
       if (cylinderCapacity < 1500){
           valueOfEspecificTax = 0.00F;
       } if (cylinderCapacity > 1500 & cylinderCapacity < 2001){
           valueOfEspecificTax = 0.08F;
       } if (cylinderCapacity > 2000 & cylinderCapacity < 2501){
           valueOfEspecificTax = 0.09F;
       } if (cylinderCapacity > 2500 & cylinderCapacity < 3001){
           valueOfEspecificTax = 0.11F;
       } if (cylinderCapacity > 3000 & cylinderCapacity < 3501){
           valueOfEspecificTax = 0.12F;
       } if (cylinderCapacity > 3500 & cylinderCapacity < 4001){
           valueOfEspecificTax = 0.24F;
       } if (cylinderCapacity > 4000){
           valueOfEspecificTax = 0.35F;
       }
       return valueOfEspecificTax;
    }
    
    public static float computeAdjustmentFactor(int yearsOfTheVehicle, boolean hybrid){
        float adjustmentFactor;
        adjustmentFactor = 0.00F;
        hybrid = true;
        if (yearsOfTheVehicle < 5){
           adjustmentFactor = 0.00F;
        } if (yearsOfTheVehicle >= 5 & yearsOfTheVehicle <= 10){
           adjustmentFactor = 0.05F;
        } if (yearsOfTheVehicle >= 11 & yearsOfTheVehicle <= 15){
           adjustmentFactor = 0.10F;
        } if (yearsOfTheVehicle >= 16 & yearsOfTheVehicle <= 20){
           adjustmentFactor = 0.15F;
        } if (yearsOfTheVehicle > 20){
           adjustmentFactor = 0.20F;
        } if ( hybrid = true){
           adjustmentFactor = 0.20F;
        }
        return adjustmentFactor;
    }
    
    public static float computeGreenTax(int cylinderCapacity, float valueOfEspecificTax, float adjustmentFactor){
        float  greenTax;
        greenTax = ((cylinderCapacity - 1500) * ( valueOfEspecificTax)) * (1 + adjustmentFactor);
        return greenTax;
    }
    
    public static float computeSurplusFractionTax(float monthlySalary){
        float surplusFractionTax;
        float annualSalary;
        surplusFractionTax = 0.00F;
        annualSalary = monthlySalary * 12;
        if(annualSalary < 11310){
            surplusFractionTax = (11310 - annualSalary) * 0.00F;
        } if(annualSalary >= 11310 & annualSalary < 14410){
            surplusFractionTax = (14410 - annualSalary) * 0.05F;
        } if(annualSalary >= 14410 & annualSalary < 18010){
            surplusFractionTax = (18010 - annualSalary) * 0.10F;
        } if(annualSalary >= 18010 & annualSalary < 21630){
            surplusFractionTax = (21630 - annualSalary) * 0.12F;
        } if(annualSalary >= 21630 & annualSalary < 31630){
            surplusFractionTax = (31630 - annualSalary) * 0.15F;
        } if(annualSalary >= 31630 & annualSalary < 41630){
            surplusFractionTax = (41630 - annualSalary) * 0.20F;
        } if(annualSalary >= 41630 & annualSalary < 51630){
            surplusFractionTax = (51630 - annualSalary) * 0.25F;
        } if(annualSalary >= 51630 & annualSalary < 61630){
            surplusFractionTax = (61630 - annualSalary) * 0.30F;
        } if(annualSalary >= 61630 & annualSalary < 100000){
            surplusFractionTax = (100000 - annualSalary) * 0.35F;
        } if(annualSalary >= 100000){
            surplusFractionTax = annualSalary * 0.37F;
        }
        return surplusFractionTax;
    }
    
    public static float computeRentTax(float monthlySalary, float surplusFractionTax){
        float rentTax;
        float annualSalary;
        rentTax = 0.00F;
        annualSalary = monthlySalary * 12;
        if(annualSalary < 11310){
            rentTax = 0.00F;
        } if(annualSalary >= 11310 & annualSalary < 14410){
            rentTax = 0.00F + surplusFractionTax;
        } if(annualSalary >= 14410 & annualSalary < 18010){
            rentTax = 155.00F + surplusFractionTax;
        } if(annualSalary >= 18010 & annualSalary < 21630){
            rentTax = 515.00F + surplusFractionTax;
        } if(annualSalary >= 21630 & annualSalary < 31630){
            rentTax = 949.40F + surplusFractionTax;
        } if(annualSalary >= 31630 & annualSalary < 41630){
            rentTax = 2449.39F + surplusFractionTax;
        } if(annualSalary >= 41630 & annualSalary < 51630){
            rentTax = 4449.39F + surplusFractionTax;
        } if(annualSalary >= 51630 & annualSalary < 61630){
            rentTax = 6949.39F + surplusFractionTax;
        } if(annualSalary >= 61630 & annualSalary < 100000){
            rentTax = 9949.39F + surplusFractionTax;
        } if(annualSalary >= 100000){
            rentTax = 23378.88F;
        }
        return rentTax;
    }
    
    public static float computeIVA(float base){
        float iva;
        iva = base * 0.12F;
        return iva;
    }
}
