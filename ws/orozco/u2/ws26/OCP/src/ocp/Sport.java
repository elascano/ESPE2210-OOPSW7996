package ocp;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public abstract class Sport implements DrivingMode{
    private static final int POWER=500;
    private static final int SUSPENSION_HEIGHT=10;
    
    @Override
    public int getPower(){
        return POWER;
    }
    
    public int getSsupensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}
