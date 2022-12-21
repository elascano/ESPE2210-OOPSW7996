package ec.edu.espe.tax;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Tax {
    
    public static float computeIva (float base, float ivaPorcentage){
        float iva;
        iva = base * ivaPorcentage;
        return iva;
    }
    
    public static float computeGreenTax(float cylinderCapacity, int year){
        float taxValue = 0;
        float adjustmentFactor = 0;
        
        if (cylinderCapacity<=1500)
            taxValue=0;
        else if(cylinderCapacity>1500&&cylinderCapacity<=2000)
            taxValue=0.08F;
        else if(cylinderCapacity>2000&&cylinderCapacity<=2500)
            taxValue=0.09F;
        else if(cylinderCapacity>2500&&cylinderCapacity<=3000)
            taxValue=0.11F;
        else if(cylinderCapacity>3000&&cylinderCapacity<=3500)
            taxValue=0.12F;
        else if(cylinderCapacity>3500&&cylinderCapacity<=4000)
            taxValue=0.24F;
        else if(cylinderCapacity>4000)
            taxValue=0.35F;
        
        if(year<=5)
            adjustmentFactor=0;
        else if(year>5&&year<=10)
            adjustmentFactor=0.05F;
        else if(year>10&&year<=15)
            adjustmentFactor=0.1F;
        else if(year>15&&year<=20)
            adjustmentFactor=0.15F;
        else if(year>20)
            adjustmentFactor=0.2F;
        
        return (((cylinderCapacity-1500)*taxValue)*(1-adjustmentFactor));
    }
    
    public static float computeRentTax(float monthlySalary){
        float annualSalary;
        int baseTax = 0;
        int basicFraction = 0;
        float adjustmentFactor = 0;
        annualSalary=monthlySalary*12;
        
        
        
        if(annualSalary<=11310){
            basicFraction=0;
            baseTax=0;
            adjustmentFactor=0;
        }
        else if (annualSalary>11310&&annualSalary<=14410){
            basicFraction=11310;
            baseTax=0;
            adjustmentFactor=0.05F;
        }
        else if (annualSalary>14410&&annualSalary<=18010){
            basicFraction=14410;
            baseTax=155;
            adjustmentFactor=0.10F;
        }
        else if (annualSalary>18010&&annualSalary<=21630){
            basicFraction=18010;
            baseTax=515;
            adjustmentFactor=0.12F;
        }
        else if (annualSalary>21630&&annualSalary<=31630){
            basicFraction=21630;
            baseTax=949;
            adjustmentFactor=0.15F;
        }
        else if (annualSalary>31630&&annualSalary<=41630){
            basicFraction=31630;
            baseTax=2449;
            adjustmentFactor=0.2F;
        }
        else if (annualSalary>41630&&annualSalary<=51630){
            basicFraction=41630;
            baseTax=4449;
            adjustmentFactor=0.25F;
        }
        else if (annualSalary>51630&&annualSalary<=61630){
            basicFraction=51630;
            baseTax=6949;
            adjustmentFactor=0.30F;
        }
        else if (annualSalary>61630&&annualSalary<=100000){
            basicFraction=61630;
            baseTax=9949;
            adjustmentFactor=0.35F;
        }
        else if (annualSalary>100000){
            basicFraction=100000;
            baseTax=23379;
            adjustmentFactor=0.37F;
        }
        
        
        return (((annualSalary-basicFraction)*adjustmentFactor)+baseTax);
        
    }
    
    public static float computeIva (float base){
        float iva;
        iva = base * 0.12F; //this information must be centrallized somewhere else in the system
        return iva;
    }
}
