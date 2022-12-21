package SRP.GOOD;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class GasPump {

    public void reFuel(final Vehicle vehicle){
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }
}
