package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author Joel Rivera, WebMasterTeam, DCCO-ESPE
 */
public class MinimumAmountDue {

    private static MinimumAmountDue instance;
    private float minimunValue;

    private MinimumAmountDue(float aliquotValue) {
        minimunValue = aliquotValue;
    }

    public static MinimumAmountDue getInstance(float aliquotValue) {
        if (instance == null) {
            instance = new MinimumAmountDue(aliquotValue);
        }
        return instance;
    }

    public float getMinimunValue() {
        return minimunValue;
    }
    
}
