package ocp.model;

/**
 *
 * @author Karla Ansatuña,SCRIPTAL, DCCO-ESPE
 */
public class Comfort implements DrivingMode {

    private static final int POWER = 400;
    private static final int SUSPENSION_HEIGHT = 20;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeigh() {
        return SUSPENSION_HEIGHT;
    }
}
