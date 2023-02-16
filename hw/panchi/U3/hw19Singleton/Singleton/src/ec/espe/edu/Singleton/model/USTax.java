package ec.espe.edu.Singleton.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    
    public static USTax getInstace(){
        if(instance == null)
            instance = new USTax();
        return instance;
    }
    
    public float salesTotal(){
        return 3.00F;
    }
    
}
