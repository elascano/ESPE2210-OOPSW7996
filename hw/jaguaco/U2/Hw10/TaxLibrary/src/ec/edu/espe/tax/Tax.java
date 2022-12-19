package ec.edu.espe.tax;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Tax {
    private float ivaPorcentage;
     
    public static float computeIva(float base,float ivaPorcentage){
        float iva;
        iva= base*ivaPorcentage;
        return iva;
    }
    public static  float computerGreenTax(float greentax){  
        return greentax;

    }
    public static float computeBaseTax(float personalsalary, float cost, float expense){
        float netincome = 0;
        return netincome;
    }
        
        public static float rentTax(float renttax){           
            return renttax;
        }
    public static float computeIva(float base){
        float iva;
        iva= base*0.12F;
        return iva;
    }

}
