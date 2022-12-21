package ec.edu.espe.SOLid.GoodSRP;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class FuelPump {
    void reFuel(final VehicleSRP vehicle){
    final int remainingFuel = vehicle.getRemainingFuel();
    final int additionalFuel = vehicle.getMaxFuel()- remainingFuel;
    vehicle.setRemainingFuel(remainingFuel+additionalFuel);
    
    }
}
