package ocp.good;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Sport extends DrivingMode{

    @Override
    public int getPower() {
        int power = 500;
        return power;
    }

    @Override
    public int getSuspensionHeight() {
        int suspensionHeight = 10;
        return suspensionHeight;
    }
}
