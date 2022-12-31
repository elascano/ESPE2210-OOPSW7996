
package SRP;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class FuelPum {
    void refuel (final Vehicle vehicle){
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel()-remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }
}
