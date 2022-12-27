package ec.edu.espe.OSP.model;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
class EventHandler {
    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void changeDrivingMode(final DrivingMode drivingMode) {
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());        
    }
}
