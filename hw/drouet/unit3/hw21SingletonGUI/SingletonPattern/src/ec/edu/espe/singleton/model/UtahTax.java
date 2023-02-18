package ec.edu.espe.singleton.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCC-ESPE
 */
public class UtahTax {

    private static UtahTax instance;
    private float ivaPersentage;

    private UtahTax() {
        this.ivaPersentage = 4.7F;
    }

    public static UtahTax getInstance() {
        if (instance == null) {
            instance = new UtahTax();
        }
        return instance;
    }

    public float getIvaPersentage() {
        return ivaPersentage;
    }

    public float salesTotal(float price) {
        float totalPrice;

        totalPrice = price + price * ivaPersentage / 100;

        return totalPrice;
    }

    public void modifyIva(float ivaPersentage) {
        System.out.println("Setting ivaPerssent of UtahTax: " + ivaPersentage + "%");
        this.ivaPersentage = ivaPersentage;
    }

}
