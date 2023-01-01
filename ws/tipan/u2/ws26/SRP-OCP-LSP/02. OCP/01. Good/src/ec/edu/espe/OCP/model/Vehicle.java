
package ec.edu.espe.OCP.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Vehicle {
    private int power;
    private int suspensionHeight;

    public Vehicle(int power, int suspensionHeight) {
        this.power = power;
        this.suspensionHeight = suspensionHeight;
    }

    int getPower() {
        return power;
    }

    void setPower(final int power) {
        this.power = power;
    }

    int getSuspensionHeight() {
        return suspensionHeight;
    }

    void setSuspensionHeight(final int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }
}
