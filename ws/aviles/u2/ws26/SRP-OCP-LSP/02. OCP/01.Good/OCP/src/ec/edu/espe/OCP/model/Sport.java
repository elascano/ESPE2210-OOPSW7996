package ec.edu.espe.OCP.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Sport implements DrivingMode{    
    private int power=500;
    private int suspensionHeight=10;
    
    @Override
    public int getPower(){
        return power;
    }

    @Override
    public int getSuspensionHeight() {
      return suspensionHeight;
    }
    
}
