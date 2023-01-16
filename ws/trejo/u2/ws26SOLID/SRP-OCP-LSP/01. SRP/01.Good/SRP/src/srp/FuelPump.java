package srp;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class FuelPump {

    Vehicle vehicle = new Vehicle();

    void reFuel(final Vehicle vehicle) {
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }

}
