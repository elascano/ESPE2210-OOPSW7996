package ec.edu.espe.singletongui.model;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class UtahTax {
    
    private double ivaPercentage;

    private UtahTax() {
        this.ivaPercentage = 4.7F;
    }

    public static UtahTax getInstance() {
        UtahTax instance = null;
        instance = new UtahTax();
        return instance;
    }

    public double getIvaPersentage() {
        return ivaPercentage;
    }

    public void setIvaPercentage(double ivaPersentage) {
        this.ivaPercentage = ivaPersentage;
    }
    
}
