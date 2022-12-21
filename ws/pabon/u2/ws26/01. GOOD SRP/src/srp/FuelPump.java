package srp;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class FuelPump {
    
    void reFuel(final Vehicle vehicle){
        int remainingFuel = vehicle.getRemainingFuel();
        int additionalFuel = vehicle.getMaxFuel()-remainingFuel;
        vehicle.setRemainingFuel((remainingFuel+additionalFuel));
    }
    
}
