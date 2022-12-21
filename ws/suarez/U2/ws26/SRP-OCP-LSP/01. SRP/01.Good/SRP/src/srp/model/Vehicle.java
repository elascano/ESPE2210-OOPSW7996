package srp.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Vehicle {

    private int maxFuel;
    private int remainingFuel;

    public Vehicle(int maxFuel, int remainingFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = remainingFuel;
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
        setRemainingFuel(getRemainingFuel() - 1);
    }    
    
}
