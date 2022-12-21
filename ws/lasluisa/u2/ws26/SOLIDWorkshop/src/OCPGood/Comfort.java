package OCPGood;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Comfort extends DrivingMode{

    int power = 400;
    int suspensionHeight = 20;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeigh() {
        return suspensionHeight;
    }
}
