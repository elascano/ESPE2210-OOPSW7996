package ec.edu.espe.SOLid.GoodOCP;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class EventHandler {
    
    private VehicleOCP vehicle;

    public EventHandler(final VehicleOCP vehicle) {
        this.vehicle = vehicle;
    }

   public void changeDrivingMode(final DrivingMode drivingMode) {
        
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());

    }
    
}
