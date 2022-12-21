package ec.edu.espe.tax;

import java.time.LocalDate;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Tax {

    public static float computeIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }
    
     public static float computeIva(float base) {
        float iva;
        iva = base * 0.12F;//This information must be centrallized somewhere else in the system
        return iva;
    }

    public static float computerGreenTax(float cylinderCapacity, int yearOfTheCar, String typeOfCar) {
        float amountPerCylinder=0;
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int antiquity;
        float percentagePerAntiquity=0;
        float greenTax;
        
        antiquity=currentYear-yearOfTheCar;
        
        if(cylinderCapacity<=1500){amountPerCylinder=0;}
        
        else if
                (cylinderCapacity>1500 && cylinderCapacity<=2000){amountPerCylinder=0.08F;}
        else if
                (cylinderCapacity>2000 && cylinderCapacity<=2500){amountPerCylinder=0.09F;}
        else if
                (cylinderCapacity>2500 && cylinderCapacity<=3000){amountPerCylinder=0.11F;}
        else if
                (cylinderCapacity>3000 && cylinderCapacity<=3500){amountPerCylinder=0.12F;}
        else if
                (cylinderCapacity>3500 && cylinderCapacity<=4000){amountPerCylinder=0.24F;}
        else if
                (cylinderCapacity>4000)                          {amountPerCylinder=0.35F;}
        
        if(typeOfCar.equalsIgnoreCase("gas") || typeOfCar.equalsIgnoreCase("diesel")){
        
            if(antiquity<5){percentagePerAntiquity=0;}
            else if
                    (antiquity>=5 && antiquity <=10){percentagePerAntiquity=0.05F;}
            else if
                    (antiquity>10 && antiquity <=15){percentagePerAntiquity=0.1F;}
            else if
                    (antiquity>15 && antiquity <=20){percentagePerAntiquity=0.15F;}
            else if
                    (antiquity>20){percentagePerAntiquity=0.2F;}

        }else if 
            (typeOfCar.equalsIgnoreCase("hybrid")){
            percentagePerAntiquity=-0.2F;
        }
        greenTax = (cylinderCapacity-1500)*amountPerCylinder*(1+percentagePerAntiquity);
        return greenTax;
    }

    public static float computerRentTax(float monthSalary) {
        float anualSalary;
        float basicTax=0;
        float percentageSurplusTax=0;
        float surplus=0;
        float rentTax;
        
        anualSalary=monthSalary*12;
        
        if(anualSalary>=0 && anualSalary<=11310){
            surplus=11310;
        }else if(anualSalary>11310 && anualSalary<=14410){
            surplus=14410;
            percentageSurplusTax=0.05F;
        }else if(anualSalary>14410 && anualSalary<=18010){
            surplus=18010;
            basicTax=155;
            percentageSurplusTax=0.1F;
        }else if(anualSalary>18010 && anualSalary<=21630){
            surplus=21630;
            basicTax=515;
            percentageSurplusTax=0.12F;
        }else if(anualSalary>21630 && anualSalary<=31630){
            surplus=31630;
            basicTax=949.4F;
            percentageSurplusTax=0.15F;
        }else if(anualSalary>31630 && anualSalary<=41630){
            surplus=41630;
            basicTax=2449.4F;
            percentageSurplusTax=0.2F;
        }else if(anualSalary>41630 && anualSalary<=51630){
            surplus=51630;
            basicTax=4449.4F;
            percentageSurplusTax=0.25F;
        }else if(anualSalary>51630 && anualSalary<=61630){
            surplus=61630;
            basicTax=6949.4F;
            percentageSurplusTax=0.3F;
        }else if(anualSalary>61630 && anualSalary<=100000){
            surplus=100000;
            basicTax=9949.4F;
            percentageSurplusTax=0.35F;
        }else if(anualSalary>100000){
            basicTax=23378.88F;
            percentageSurplusTax=0.37F;
        }
        
        rentTax=(surplus-anualSalary)*percentageSurplusTax+basicTax;
        
        return rentTax;
    }

   
}
