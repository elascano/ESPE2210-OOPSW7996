
package ocp;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public abstract class Sport implements DrivingMode{
    private static final int POWER=500;
    private static final int SUSPENSION_HEIGHT=10;
    
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
    public int getSsupensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}
