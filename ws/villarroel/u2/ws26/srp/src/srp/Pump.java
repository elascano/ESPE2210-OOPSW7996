
package srp;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Pump {
    void reFuel (final Vehicle vehicle){
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel()-remainingFuel;
        vehicle.setRemainingFuel(remainingFuel+additionalFuel);
    }
}

