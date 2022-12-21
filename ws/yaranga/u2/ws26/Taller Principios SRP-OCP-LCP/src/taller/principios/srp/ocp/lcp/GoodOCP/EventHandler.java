
package taller.principios.srp.ocp.lcp.GoodOCP;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class EventHandler {

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

   public void changeDrivingMode(final DrivingMode drivingMode) {
        
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeigh());

    }
   
}
