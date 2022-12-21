package ocp;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
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

    @Override
    public int getSuspensionHeight() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
