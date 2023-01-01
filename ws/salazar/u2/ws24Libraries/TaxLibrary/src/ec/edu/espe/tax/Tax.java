package ec.edu.espe.tax;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Tax {
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base*ivaPercentage;
        return iva;
    }
    
    public static float computeGreenIva(float cylinderCapacity,int yearsOfTheVehicle){
        float cylinderTax, yearsTax, greenIva;
        if (cylinderCapacity<=1500) {
            cylinderTax=0.00F;
        }else if(cylinderCapacity<=2000){
            cylinderTax=0.08F;
        }else if(cylinderCapacity<=2500){
            cylinderTax=0.09F;
        }else if(cylinderCapacity<=3000){
            cylinderTax=0.11F;
        }else if(cylinderCapacity<=3500){
            cylinderTax=0.12F;
        }else if(cylinderCapacity<=4000){
            cylinderTax=0.24F;
        }else{
            cylinderTax=0.35F;
        }
        if(yearsOfTheVehicle<=5){
            yearsTax=0.00F;
        }else if (yearsOfTheVehicle<=10) {
            yearsTax=0.05F;
        }else if (yearsOfTheVehicle<=15) {
            yearsTax=0.10F;
        }else if (yearsOfTheVehicle<=20) {
            yearsTax=0.15F;
        }else{
            yearsTax=0.20F;
        }
        greenIva=((cylinderCapacity-1500)*cylinderTax)*(1+yearsTax);
        
        return greenIva;
    }
    
    public static float computeRentTax(float monthlySalary){
        float annualSalary, rentTaxPercentage, basicFractionTax, basicFraction, rentTaxAnnual;
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
        rentTaxAnnual=(annualSalary-basicFraction)*rentTaxPercentage+basicFractionTax;
        
        return rentTaxAnnual;
    }
    
    public static float computeIva(float base){
        float iva;
        iva = base*0.12F;
        return iva;
    }
}
