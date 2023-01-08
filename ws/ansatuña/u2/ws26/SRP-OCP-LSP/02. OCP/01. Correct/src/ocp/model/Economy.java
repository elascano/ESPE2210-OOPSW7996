package ocp.model;

/**
 *
 * @author Karla Ansatuña,SCRIPTAL, DCCO-ESPE
 */
public class Economy implements DrivingMode {

    private static final int POWER = 200;
    private static final int SUSPENSION_HEIGHT = 30;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeigh() {
        return SUSPENSION_HEIGHT;
    }
}
