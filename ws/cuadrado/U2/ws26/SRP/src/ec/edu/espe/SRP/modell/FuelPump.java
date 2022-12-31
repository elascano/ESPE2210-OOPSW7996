package ec.edu.espe.SRP.modell;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
public class FuelPump {
    void reFuel (final Vehicle vehicle){
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel()-remainingFuel;
        vehicle.setRemainingFuel(remainingFuel+additionalFuel);
    }
}
