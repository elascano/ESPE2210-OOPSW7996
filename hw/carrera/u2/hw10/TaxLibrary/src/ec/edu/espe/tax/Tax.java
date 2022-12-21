package ec.edu.espe.tax;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Tax {
    
    public static float computeGreenTax(float cc,int year){
        float greenTax;
        float specificTax;
        specificTax = computeSpecificTax(cc);
        float adjusmentFactor;
        adjusmentFactor = computeAdjusmentFactor(year);
        greenTax = ((cc-1500)*specificTax)*(1+adjusmentFactor);
        return greenTax; 
    } 
    
    private static float computeAdjusmentFactor(int year){
        float adjusmentFactor;
        if (year > 0 && year < 5){
            adjusmentFactor = 0.00F;    
        }else if (year > 5 && year <= 10 ){
            adjusmentFactor= 0.05F; 
        }else if (year > 10 && year <= 15 ){
            adjusmentFactor= 0.10F; 
        }else if (year > 15 && year <= 20 ){
            adjusmentFactor= 0.15F;
        }else if (year > 20){
            adjusmentFactor = 0.20F; 
        }else{
            adjusmentFactor = 0.00F; 
            System.out.println("We can't compute taxes of a negative number");
        }
        return adjusmentFactor;
    }
    
    private static float computeSpecificTax(float cc){
        float specificTax;
        
        if (cc > 0 && cc <1500){
            specificTax = 0.00F;    
        }else if (cc > 1500 && cc <= 2000 ){
            specificTax = 0.08F; 
        }else if (cc > 2000 && cc <= 2500 ){
            specificTax = 0.09F; 
        }else if (cc > 2500 && cc <= 3000 ){
            specificTax = 0.11F;
        }else if (cc > 3000 && cc <= 3500 ){
            specificTax = 0.12F;
        }else if (cc > 3500 && cc <= 4000 ){
            specificTax = 0.24F; 
        }else if (cc > 4000){
            specificTax = 0.35F;
        }else{
            specificTax = 0.00F;
            System.out.println("We can't compute taxes of a negative number");
        }
        return specificTax;
    }
   
    public static float computeRentTax(float annualSalary, float personalExpenses, float withholdings){
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
            basicFraction = 0.00F;
            surplusFraction = 0.00F;
            taxOnBasicFraction = 0.00F;
            taxOnSurplusFraction = 0.00F;
            System.out.println("We can't compute taxes of a negative number");
        }
        rentTax = (surplusFraction * taxOnSurplusFraction) + taxOnBasicFraction - personalExpenses - withholdings ;
        return rentTax;
    }
     
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    
    public static float computeIva(float base){
        float iva;
        iva = base * 0.12F; // this information must be centrallized somewhere lse in the system
        return iva;
    }
}
    