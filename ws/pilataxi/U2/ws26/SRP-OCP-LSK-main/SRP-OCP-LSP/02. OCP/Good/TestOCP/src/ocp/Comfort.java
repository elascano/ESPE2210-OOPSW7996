
package ocp;

/**
 *
 * @author Diego Pilataxi, GitSoftTeam, DCCO-ESPE
 */
public class Comfort implements DrivingMode{
    
    private static final int POWER=400;
    private static final int SUSPENSION_HEIGHT=20;
    
    public int getPower(){
        return POWER;
    }
    
    public int getSupensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}
