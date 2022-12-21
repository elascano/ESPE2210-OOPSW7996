
package OCP;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Sport extends EventHandler{
    
    private static final int POWER = 500;
    private static final int SUSPENSION_HEIGHT = 10;

    public Sport(Vehicle vehicle) {
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
