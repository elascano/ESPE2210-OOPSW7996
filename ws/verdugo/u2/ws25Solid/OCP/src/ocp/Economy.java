
package ocp;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public abstract class Economy implements DrivingMode {
    
    private static final int POWER = 300;
    private static final int SUSPENSION_HEIGHT = 20;
    
    /**
     *
     * @return
     */
    @Override
    public int getPower() {
        return POWER;
    }

    /**
     *
     * @return
     */
    public int getSupensionHeight() {
        return SUSPENSION_HEIGHT;
    }   
}
