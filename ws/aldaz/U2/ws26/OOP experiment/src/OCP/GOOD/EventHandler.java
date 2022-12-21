package OCP.GOOD;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeEventHandler(final Event eventHandler){
        vehicle.setPower(eventHandler.getPower());
        vehicle.setSuspensionHeight(eventHandler.getSuspensionHeight());
    }
}
