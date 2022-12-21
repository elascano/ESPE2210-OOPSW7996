package Good_srp_rivera_joel;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class FuelPump {
    
    int remainFuel;
    int additionalFuel;
    
    public void replenish(Vehicle vehicle){
        
        remainFuel = vehicle.getRemainingFuel();
        additionalFuel = vehicle.getMaxFuel() - remainFuel;
        vehicle.setRemainingFuel(remainFuel + additionalFuel);
        
    }
    
}
