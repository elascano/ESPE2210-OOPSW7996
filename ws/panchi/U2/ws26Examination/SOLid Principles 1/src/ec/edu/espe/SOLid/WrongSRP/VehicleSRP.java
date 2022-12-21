package ec.edu.espe.SOLid.WrongSRP;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class VehicleSRP {
    private final int maxFuel;
    private int remainingFuel;

    public VehicleSRP(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }
    public void reFuel() {
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
