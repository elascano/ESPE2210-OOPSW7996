package Good_ocp_rivera_joel;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Economy extends DrivingMode {
    
    private static int power = 300;
    private static int suspensionHeight = 20;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeight() {
        return suspensionHeight;
    }
    
}
