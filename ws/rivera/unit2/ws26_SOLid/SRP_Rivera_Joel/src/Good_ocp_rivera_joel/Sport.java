package Good_ocp_rivera_joel;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Sport extends DrivingMode {
    
    private static int power = 500;
    private static int suspensionHeight = 500;

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public int getSuspensionHeight() {
        return suspensionHeight;
    }
    
}
