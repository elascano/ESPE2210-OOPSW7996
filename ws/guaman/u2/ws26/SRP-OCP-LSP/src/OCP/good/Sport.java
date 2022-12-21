package OCP.good;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class Sport implements DrivingMode {

    private static final int POWER = 500;
    private static final int SUSPENSIONHEIGHT = 10;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSIONHEIGHT;
    }
}
