
package ocp;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class Economy implements DrivingMode {
    
    private static final int POWER=400;
    private static final int SUSPENSION_HEIGHT=20;
    
    @Override
    public int getPower(){
        return POWER;
        
    }
    
    public int getSuspensionHeight(){
        
        return SUSPENSION_HEIGHT;
    }
}
