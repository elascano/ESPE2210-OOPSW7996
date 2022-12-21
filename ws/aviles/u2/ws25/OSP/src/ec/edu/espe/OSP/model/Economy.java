package ec.edu.espe.OSP.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Economy implements DrivingMode{
    private static final int POWER=300;
    private static final int SUSPENSION_HEIGHT=20;
    
    @Override
    public int getPower(){
        return POWER;
    }
    @Override
    public int getSuspensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}
