package SRPGood;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class FuelStation {

    void reFuel(Vehicle vehicle) {
        int remainingFuel = vehicle.getRemainingFuel();
        int fuelToComplete = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + fuelToComplete);
    }
}
