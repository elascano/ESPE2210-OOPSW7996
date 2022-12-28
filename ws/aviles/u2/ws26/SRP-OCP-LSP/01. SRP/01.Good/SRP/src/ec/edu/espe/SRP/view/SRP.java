package ec.edu.espe.SRP.view;

import ec.edu.espe.SRP.model.Fuel;
import ec.edu.espe.SRP.model.Vehicle;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class SRP {

    public static void main(String[] args) {
        
        int maxFuel = 300;
        Vehicle vehicle;
        vehicle = new Vehicle(maxFuel);
        Fuel fuel;
        System.out.println("Before");
        System.out.println("Max fuel ----> "+vehicle.getMaxFuel());
        System.out.println("Reamining fuel ---->"+vehicle.getRemainingFuel());
        fuel = new Fuel();
        fuel.reFuel(vehicle);
        System.out.println("After");
        System.out.println("Max fuel ----> "+vehicle.getMaxFuel());
        System.out.println("Reamining fuel ---->"+vehicle.getRemainingFuel());
    }
    
}
