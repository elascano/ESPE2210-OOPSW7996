package ocp;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Vehicle {
    private int power;
    private int suspensionHeight;

    public Vehicle(int power, int suspensionHeight) {
        this.power = power;
        this.suspensionHeight = suspensionHeight;
    }

    /**
     * @return the power
     */
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }

    /**
     * @return the suspensionHeight
     */
    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    /**
     * @param suspensionHeight the suspensionHeight to set
     */
    public void setSuspensionHeight(int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }


}

