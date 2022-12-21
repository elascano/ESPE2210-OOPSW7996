package ec.edu.espe.SRP.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Fuel {
    int remainingFuel;
    int additionalFuel;
    public void reFuel (Vehicle vehicle){
        remainingFuel = vehicle.getRemainingFuel();
        additionalFuel = vehicle.getMaxFuel()-remainingFuel;
        vehicle.setRemainingFuel(remainingFuel+additionalFuel);
    }

}
