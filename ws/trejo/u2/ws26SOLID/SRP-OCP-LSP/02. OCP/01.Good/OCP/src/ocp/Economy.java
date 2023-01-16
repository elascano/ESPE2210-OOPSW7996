
package ocp;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public abstract class Economy implements DrivingMode{

    private static final int power = 200;
    private static final int suspensionHeifht = 30;

    
    public int getPower() {
        return power;
    }

    public int getSuspensionHeight() {
        return suspensionHeifht;
    }

}
