
package ocp;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public abstract class Comfort implements DrivingMode{
    
    private static final int POWER = 400;
    private static final int SUSPENSION_HEIGHT = 0;
    
    /**
     *
     * @return
     */
    @Override
    public int getPower(){
        return POWER;
    }
    
    /**
     *
     * @return
     */
    public int getSupensionHeight(){
        return SUSPENSION_HEIGHT;
    }
    
}
