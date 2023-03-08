package ec.edu.espe.SingletonGUI.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class USTax {
    private static USTax instance;
    private float ivaPercentage;
    
    private USTax(){}

    public static USTax getInstance() {
        if(instance == null) {
            instance = new USTax();
        }
        return instance;
    }
    
    public float getIvaPercentage() {
        return ivaPercentage;
    }

    public void setIvaPercentage(float ivaPercentage) {
        this.ivaPercentage = ivaPercentage;
    }
}
