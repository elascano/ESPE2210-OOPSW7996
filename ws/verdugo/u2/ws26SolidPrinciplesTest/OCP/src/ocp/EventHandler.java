
package ocp;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class EventHandler {

    private final Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode) {
        
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());

    }

}
