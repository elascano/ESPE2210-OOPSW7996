
package ocp.model;

/**
 *
  * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Economy implements DrivingMode {

    private static final int POWER = 300;
    private static final int SUSPENSION_HEIGHT = 20;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeigh() {
        return SUSPENSION_HEIGHT;
    }
}
