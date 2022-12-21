
package ec.edu.espe.OCP.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class EventHandler {
    
    private Vehicle vehicle;

    public EventHandler(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(DrivingMode drivingMode) {
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
        
    }
    


}

