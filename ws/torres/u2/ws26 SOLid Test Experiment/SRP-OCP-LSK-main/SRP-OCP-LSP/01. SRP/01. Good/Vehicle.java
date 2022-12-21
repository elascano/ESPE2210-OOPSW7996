package model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Vehicle extends Tank {

    public Vehicle(int maxFuel, int remainingFuel) {
        super(maxFuel, remainingFuel);
    }
    
    public void accelerate(int remainigFuel) {
        remainingFuel--;
    }
}
