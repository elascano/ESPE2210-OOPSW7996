package ec.edu.espe.tax;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Tax {
    private float ivaPorcentage;
     
    public static float computeIva(float base, float ivaPorcentage){
        float iva;
        iva= base*ivaPorcentage;
        return iva;
    }
        public static  float computerGreenTax(){
            return 0.0F;
        }
        
        public static float rentTax(){
            return 0;
        } 
    public static float computeIva(float base){
        float iva;
        iva= base*0.12F;
        return iva;
    } 
}
