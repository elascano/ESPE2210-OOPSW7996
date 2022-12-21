package OCP.good;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Economy implements DrivingMode {

    private static final int POWER = 200;
    private static final int SUSPENSIONHEIGHT = 30;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSIONHEIGHT;
    }
}
