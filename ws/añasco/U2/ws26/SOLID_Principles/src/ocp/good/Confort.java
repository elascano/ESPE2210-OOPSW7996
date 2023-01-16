package ocp.good;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Confort extends DrivingMode{

    @Override
    public int getPower() {
        int power = 400;
        return power;
    }

    @Override
    public int getSuspensionHeight() {
        int suspensionHeight = 20;
        return suspensionHeight;
    }
}
