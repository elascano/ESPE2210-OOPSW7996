
package taller.principios.srp.ocp.lcp.WrongSRP;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class WrongVehicle {
    private final int maxFuel;
    private int remainingFuel;

    public WrongVehicle( int maxFuel) {
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
