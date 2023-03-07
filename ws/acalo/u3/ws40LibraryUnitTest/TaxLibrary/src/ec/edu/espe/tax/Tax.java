package ec.edu.espe.tax;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Tax {
    
    public static float computeIva(float base, float ivaPercentage){
        float iva;
        iva = base* ivaPercentage;
        BigDecimal bd = new BigDecimal(iva).setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
    
    public static float computeRentTax(float monthSalary){
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
            surplus=anualSalary;
            basicTax=23378.88F;
            percentageSurplusTax=0.37F;
        }
        
        rentTax=(surplus-anualSalary)*percentageSurplusTax+basicTax;
        
        return rentTax;
    }
    
}
