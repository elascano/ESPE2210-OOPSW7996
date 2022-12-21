
package OCP;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public abstract class EventHandler implements DrivingMode {
    
    private final Vehicle vehicle;

    public EventHandler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(DrivingMode drivingMode) {
       
       vehicle.setPower(drivingMode.getPower());
       vehicle.setSuspensionHeight(drivingMode.getSuspensionHeigh());

    }
}