
package ec.edu.espe.singletongui.model;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */

public class Tax {
    
    private double ivaPercentage;

    private Tax() {
        this.ivaPercentage = 12F;
    }

    public static Tax getInstance() {
        Tax instance = null;
        instance = new Tax();
        return instance;
    }

    public double getIvaPersentage() {
        return ivaPercentage;
    }

    public void setIvaPercentage(double ivaPersentage) {
        this.ivaPercentage = ivaPersentage;
    }
    
}
