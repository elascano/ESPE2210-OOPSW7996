package ocp;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class EventHandler {
    
    private final Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void changeDrivingMode(final DrivingMode drivingMode) {
        
        
    }

    enum DrivingMode {
        SPORT, COMFORT, ECONOMY
    }
    


}
