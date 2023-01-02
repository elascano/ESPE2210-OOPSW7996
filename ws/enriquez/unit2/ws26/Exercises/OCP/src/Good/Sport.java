
package Good;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Sport implements DrivingMode {

    private static final int POWER = 500;
    private static final int SUSPENSION_HEIGHT = 10;

    @Override
    public int getPower() {
        return POWER;
    }
    
    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }
}
