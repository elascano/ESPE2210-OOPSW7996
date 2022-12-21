package ec.edu.espe.OCP.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Economy implements DrivingMode{
    private int power=200;
    private int suspensionHeight=30;
    
    @Override
    public int getPower(){
        return power;
    }

    @Override
    public int getSuspensionHeight() {
      return suspensionHeight;
    }
}