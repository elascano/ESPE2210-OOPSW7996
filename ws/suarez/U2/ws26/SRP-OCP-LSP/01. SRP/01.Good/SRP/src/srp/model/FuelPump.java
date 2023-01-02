package srp.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class FuelPump {
    void reFuel(final Vehicle vehicle){
    final int remainingFuel = vehicle.getRemainingFuel();
    final int additionalFuel=vehicle.getMaxFuel()-remainingFuel;
    vehicle.setRemainingFuel(remainingFuel+additionalFuel);
    
    }
}
