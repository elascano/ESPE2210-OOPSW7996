package Good_ocp_rivera_joel;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Confort extends DrivingMode{
    
    private static int power = 400;
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
