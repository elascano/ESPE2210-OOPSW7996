package srp;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Vehicle {
    private int maxFuel;
    private int remainingFuel;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    /**
     * @return the maxFuel
     */
    public int getMaxFuel() {
        return maxFuel;
    }

    /**
     * @param maxFuel the maxFuel to set
     */
    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    /**
     * @return the remainingFuel
     */
    public int getRemainingFuel() {
        return remainingFuel;
    }

    /**
     * @param remainingFuel the remainingFuel to set
     */
    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }


}
