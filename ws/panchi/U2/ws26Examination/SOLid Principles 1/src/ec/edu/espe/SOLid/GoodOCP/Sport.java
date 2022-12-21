package ec.edu.espe.SOLid.GoodOCP;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Sport extends DrivingMode{
    
    private static final int power = 500;
    private static final int suspensionHeight = 10;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeight() {
        return suspensionHeight;
    }
}
