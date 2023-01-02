package ocp;

/**
 *
 * @author nicko
 */
public class EventHandler {
    
    private final Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void changeDrivingMode(final DrivingMode drivingMode) {
        switch (drivingMode) {
            case SPORT -> {
                vehicle.setPower(500);
                vehicle.setSuspensionHeight(10);
            }
            case COMFORT -> {
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
            }
            case ECONOMY -> {
                vehicle.setPower(200);
                vehicle.setSuspensionHeight(30);
            }
        }
    }

    enum DrivingMode {
        SPORT, COMFORT, ECONOMY
    }
    
}
