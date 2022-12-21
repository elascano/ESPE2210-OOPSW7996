
package OCP;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Comfort extends EventHandler{
    
    private static final int POWER = 400;
    private static final int SUSPENSION_HEIGHT = 20;

    public Comfort(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeigh() {
        return SUSPENSION_HEIGHT;
    }
}