package ec.edu.espe.tax;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class Tax {
    
    public static float computeIva(float base,float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
        
    }
    public static float computeGreenTax(float vehiclePrice){
        float value;
        float iacv=0;
        if(vehiclePrice<=4000){
            value=vehiclePrice-0;
            iacv = value*0.005F+0;
        }else if(vehiclePrice>4001 && vehiclePrice<=8000){
            value=vehiclePrice-4001;
            iacv = value*0.01F+20;
        }else if(vehiclePrice>8001 && vehiclePrice<=12000){
            value=vehiclePrice-8001;
            iacv = value*0.02F+60;
        }else if(vehiclePrice>12001 && vehiclePrice<=16000){
            value=vehiclePrice-12001;
            iacv = value*0.03F+140;
        }else if(vehiclePrice>16001 && vehiclePrice<=20000){
            value=vehiclePrice-16001;
            iacv = value*0.04F+260;
        }else if(vehiclePrice>20001 && vehiclePrice<=24000){
            value=vehiclePrice-20001;
            iacv = value*0.05F+420;
        }else if(vehiclePrice>24001){
            value=vehiclePrice-24001;
            iacv = value*0.06F+620;
        }
        return iacv;   
    
    }
    public static float computeRentTax(float annualSalary){
      float value;
        float rentTax = 0;
        if(annualSalary<=11310.00F){
            value=annualSalary-0;
            rentTax = value*0+0;
        }
        else if (annualSalary>11310.01F && annualSalary<=14410.00f){
            value=annualSalary-11310.01F;
            rentTax = value*0.05F+0;
        }else if(annualSalary>14410.01F && annualSalary<=18010.00F){
            value=annualSalary-14410.01F;
            rentTax = value*0.1F+155;
            
        }else if(annualSalary>18010.01F && annualSalary<=21630.00F){
            value=annualSalary-18010.01F;
            rentTax = value*0.12F+515;
        }else if(annualSalary>21630.01F && annualSalary<=31630.00F){
            value=annualSalary-21630.01F;
            rentTax = value*0.15F+949;
            
        }else if(annualSalary>31630.00F && annualSalary<=41630.00F){
            value=annualSalary-31630.00F;
            rentTax = value*0.20F+2449;
        }else if(annualSalary>41630.00F && annualSalary<=51630.00F){
            value=annualSalary-41630.00F;
            rentTax = value*0.25F+4449;
        }else if(annualSalary>51630.00F && annualSalary<=61630.00F){
            value=annualSalary-51630.00F;
            rentTax = value*0.30F+6949;
    } else if(annualSalary>61630.00F && annualSalary<=100000.00F){
        value=annualSalary-61630.00F ;
            rentTax = value*0.35F+9949;
    }else if(annualSalary>100000.00F){
        value=annualSalary-100000.00F;
            rentTax = value*0.37F+23379;
    }
    return rentTax;  
    }
    public static float computeIva(float base) {
        float iva;
        iva = base * 0.12F; //information must be centralized somewhere else in the system
        return iva;
    } 
}
