package OCPGood;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Sport extends DrivingMode {
    
    int power = 500;
    int suspensionHeight = 10;
    
    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeigh() {
        return suspensionHeight;
    }

}
