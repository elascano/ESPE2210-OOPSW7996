package srp;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle() {
        maxFuel = 0;
        remainingFuel = 0;
    }

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

   
    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }

}
