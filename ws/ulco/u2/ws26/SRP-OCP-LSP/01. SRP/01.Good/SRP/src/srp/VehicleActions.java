
package srp;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class VehicleActions {
    
    Vehicle vehicle;

    public VehicleActions(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void accelerate() {
        int remainingFuel = vehicle.getRemainingFuel();
        remainingFuel--;
    }
    
    public void reFuel() {
        int remainingFuel = vehicle.getRemainingFuel();
        int maxFuel = vehicle.getMaxFuel();
        remainingFuel = maxFuel;
    }

   
}
