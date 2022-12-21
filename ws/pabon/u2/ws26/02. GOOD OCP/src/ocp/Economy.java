package ocp;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Economy implements DrivingMode {
    
    private static final int POWER = 300;
    private static final int SUSPENSION_HEIGHT = 20;
    

    public int getPower(){
        return POWER;
    }
    
    public int getSsupensionHeight(){
        return SUSPENSION_HEIGHT;
    }

    @Override
    public int getSuspensionHeight() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
