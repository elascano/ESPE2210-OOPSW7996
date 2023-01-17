package ocp.good;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Economy extends DrivingMode{

    @Override
    public int getPower() {
        int power = 200;
        return power;
    }

    @Override
    public int getSuspensionHeight() {
        int suspensionHeight = 30;
        return suspensionHeight;
    }   
}
