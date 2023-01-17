
package srp;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class FuelPump {
    
    public void remainingFuel(final Vehicle vehicle){
        final int remainingFue1 = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel();
        vehicle.setRemainingFuel(remainingFue1 + additionalFuel);
    }
    
}
