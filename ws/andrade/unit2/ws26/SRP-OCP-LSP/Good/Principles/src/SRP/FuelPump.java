
package SRP;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class FuelPump {
    
    void reFuel(final Vehicle vehicle){
    final int remainingFuel = vehicle.getRemainingFuel();
    final int extraFuel = vehicle.getMaxFuel() - remainingFuel;
    vehicle.setRemainingFuel(remainingFuel + extraFuel);
    }
}
