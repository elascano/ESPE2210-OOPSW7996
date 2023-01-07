package ocp;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Sport implements DrivingMode{
    
    private static int POWER = 500;
    private static int SUSPENSION_HEIGHT = 10;
    
    
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
