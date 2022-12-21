package SRP.good;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class AcctionsVehicle {

    private final Vehicle vehicle;

    public AcctionsVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void reFuel() {
        int remainingFuel = vehicle.getRemainingFuel();
        int maxFuel = vehicle.getMaxFuel();

        remainingFuel = maxFuel;
    }

    public void accelerate() {
        int remainingFuel = vehicle.getRemainingFuel();
        remainingFuel--;
    }
}
