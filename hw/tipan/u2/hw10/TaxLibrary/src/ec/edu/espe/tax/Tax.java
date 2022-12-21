
package ec.edu.espe.tax;

import java.time.LocalDate;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Tax {
    
    public static float computeIva(float base,float ivaPercentage){
        float iva;
        iva=base*ivaPercentage;
        return iva;
    }
    
    public static float computeGreenTax(float cylinderCapacity,int vehicleYear, String vehicleType){
        float amountCylinder=0;
        LocalDate currentDate=LocalDate.now();
        int currentYear=currentDate.getYear();
        int antiquity;
        float percentegePerAntiquity=0;
        float greenTax;
        
        antiquity=currentYear-vehicleYear;
        
        if(cylinderCapacity<=1500){amountCylinder=0;}
        else if(cylinderCapacity>1500 && cylinderCapacity<=2000){
            amountCylinder=0.08F;
        }
        else if(cylinderCapacity>2000 && cylinderCapacity<=2500){
            amountCylinder=0.09F;
        }
        else if(cylinderCapacity>2500 && cylinderCapacity<=3000){
            amountCylinder=0.11F;
        }
        else if(cylinderCapacity>3000 && cylinderCapacity<=3500){
            amountCylinder=0.12F;
        }
        else if(cylinderCapacity>3500 && cylinderCapacity<=4000){
            amountCylinder=0.24F;
        }
        else if(cylinderCapacity>4000){
            amountCylinder=0.35F;
        }
        
        if(vehicleType.equalsIgnoreCase("gas")|| vehicleType.equalsIgnoreCase("diesel")){
            if(antiquity<5){percentegePerAntiquity=0;}
            else if(antiquity>=5 && antiquity <=10){percentegePerAntiquity=0.05F;}
            else if(antiquity>10 && antiquity <=15){percentegePerAntiquity=0.1F;}
            else if(antiquity>15 && antiquity <=20){percentegePerAntiquity=0.15F;}
            else if(antiquity>20){percentegePerAntiquity=0.02F;}
            
        }else if(vehicleType.equalsIgnoreCase("Hybrid")){
            percentegePerAntiquity=-0.2F;
        }
        greenTax=(cylinderCapacity-1500)*amountCylinder*(1+percentegePerAntiquity);
        return greenTax;

    }
    
    public static float computeRentTax(float monthSalary){
        float anualSalary;
        float basicFraction = 0;
        float percentageResidueTax = 0;
        float residue=0;
        float rentTax;
        
        anualSalary=monthSalary*12;
        
        if(anualSalary>=0 && anualSalary<=11310){
            residue=11310;
        }else if(anualSalary>11310 && anualSalary<=14410){
            residue=14410;
            percentageResidueTax=0.05F;
        }else if(anualSalary>14410 && anualSalary<=18010){
            residue=18010;
            basicFraction=155;
            percentageResidueTax=0.1F;
        }else if(anualSalary>18010 && anualSalary<=21630){
            residue=21630;
            basicFraction=515;
            percentageResidueTax=0.12F;
        }else if(anualSalary>31630 && anualSalary<=41630){
            residue=41630;
            basicFraction=2449.4F;
            percentageResidueTax=0.2F;
        }else if(anualSalary>41630 && anualSalary<=51630){
            residue=51630;
            basicFraction=4449.4F;
            percentageResidueTax=0.25F;
        }else if(anualSalary>51630 && anualSalary<=61630){
            residue=61630;
            basicFraction=6949.4F;
            percentageResidueTax=0.3F;
        }
        else if(anualSalary>61630 && anualSalary<=100000){
            residue=100000;
            basicFraction=9949.4F;
            percentageResidueTax=0.35F;
        } else if(anualSalary>100000){
            basicFraction=23378.88F;
            percentageResidueTax=0.37F;
        }
        
        rentTax=(residue-anualSalary)*percentageResidueTax+basicFraction;
        
        return rentTax;
    }
    
    public static float computeIva(float base){
        float iva;
        iva=base*0.12F;//this information mut be centrallized somewhere else in the system
        return iva;
    }
    
}
