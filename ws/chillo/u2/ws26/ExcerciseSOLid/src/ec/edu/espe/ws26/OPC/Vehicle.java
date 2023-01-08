package ec.edu.espe.ws26.OPC;

/**
 *
 * @author NicolayChillo, Gaman GeekLords at DCOO-ESPE
 */
public class Vehicle {
    private int power;
    private int suspensionHeight;

    public Vehicle(int power, int suspensionHeight) {
        this.power = power;
        this.suspensionHeight = suspensionHeight;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "power=" + power + ", suspensionHeight=" + suspensionHeight + '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setSuspensionHeight(int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }
    
    
}