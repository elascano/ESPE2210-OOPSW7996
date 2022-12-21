
package ec.edu.espe.SRP.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class FuelBomb {
    
    public void reFuel(final Vehicle vehicle){
    
    final int remainingFuel = vehicle.getRemainingFuel();
    final int additionalFuel=vehicle.getMaxFuel()-remainingFuel;
    
    vehicle.setRemainingFuel(remainingFuel+additionalFuel);
    
    }
}
