package ec.edu.espe.OCP.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Comfort implements DrivingMode{
    private int power=400;
    private int suspensionHeight=20;
    
    @Override
    public int getPower(){
        return power;
    }

    @Override
    public int getSuspensionHeight() {
      return suspensionHeight;
    }
}
