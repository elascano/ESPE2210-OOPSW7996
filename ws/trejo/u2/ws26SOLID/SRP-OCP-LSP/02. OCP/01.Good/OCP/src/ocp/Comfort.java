package ocp;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public abstract class Comfort implements DrivingMode {

    private static final int power = 400;
    private static final int suspensionHeight = 20;

    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }
}
