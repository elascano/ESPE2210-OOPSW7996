
package ec.edu.espe.OCP.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Sport implements DrivingMode {

    private static final int power = 500;
    private static final int suspensionHeight = 10;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeigh() {
        return suspensionHeight;
    }
}
