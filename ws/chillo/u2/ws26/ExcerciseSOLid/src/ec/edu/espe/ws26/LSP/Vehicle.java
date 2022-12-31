package ec.edu.espe.ws26.LSP;

/**
 *
 * @author NicolayChillo, Gaman GeekLords at DCOO-ESPE
 */
public class Vehicle {
    private int maxFuel;
    private int remainingFuel;

    public Vehicle(int maxFuel, int remainingFuel) {
        this.maxFuel = maxFuel;
        this.remainingFuel = remainingFuel;
    }
    
    public void aceletation(){
        System.out.println("The vehicle is accelerating");
    }
    
    @Override
    public String toString() {
        return "Vehicle{" + "maxFuel = " + maxFuel + ", remainingFuel = " + remainingFuel + '}';
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }    
}