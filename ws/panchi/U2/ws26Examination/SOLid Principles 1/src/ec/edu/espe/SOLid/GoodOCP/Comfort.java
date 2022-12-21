package ec.edu.espe.SOLid.GoodOCP;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Comfort extends DrivingMode{
    
    private static final int power = 400;
    private static final int suspensionHeight = 20;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeight() {
        return suspensionHeight;
    }
    
}
