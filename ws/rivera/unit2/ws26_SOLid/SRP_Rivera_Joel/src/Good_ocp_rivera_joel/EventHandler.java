package Good_ocp_rivera_joel;

/**
 *
 * @author nicko
 */
public class EventHandler {
    
    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        
        this.vehicle = vehicle;
    
    }
    
    void changeDrivingMode(final DrivingMode drivingMode) {
        
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
        
    }
    
}
