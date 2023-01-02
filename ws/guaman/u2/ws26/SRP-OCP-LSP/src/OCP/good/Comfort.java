package OCP.good;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Comfort implements DrivingMode {
    
    private static final int POWER=400;
    private static final int SUSPENSIONHEIGHT=20;
    
    @Override
    public int getPower(){
        return POWER;
    }
    
    @Override
    public int getSuspensionHeight(){
        return SUSPENSIONHEIGHT;
    }
}
