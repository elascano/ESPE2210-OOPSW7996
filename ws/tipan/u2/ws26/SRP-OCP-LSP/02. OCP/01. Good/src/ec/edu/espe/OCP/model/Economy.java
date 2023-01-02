
package ec.edu.espe.OCP.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Economy implements DrivingMode {

    private static final int power = 300;
    private static final int suspensionHeight = 20;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeigh() {
        return suspensionHeight;
    }
}
