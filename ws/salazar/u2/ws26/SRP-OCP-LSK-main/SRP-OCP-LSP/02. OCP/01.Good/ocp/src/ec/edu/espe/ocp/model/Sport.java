package ec.edu.espe.ocp.model;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class Sport implements DrivingMode{
    
    private static final int POWER=600;
    private static final int SUSPENSION_HEIGHT=10;
    
    @Override
    public int getPower(){
        return POWER;
    }
    
    @Override
    public int getSuspensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}
