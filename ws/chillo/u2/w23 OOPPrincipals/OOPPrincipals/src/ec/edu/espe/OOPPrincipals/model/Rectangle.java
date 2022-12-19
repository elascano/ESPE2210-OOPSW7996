package ec.edu.espe.OOPPrincipals.model;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Rectangle {
    
    private int baseRectanguler;
    private int heightRectanguler;

    public Rectangle(int baseRectanguler, int heightRectanguler) {
        this.baseRectanguler = baseRectanguler;
        this.heightRectanguler = heightRectanguler;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "baseRectanguler=" + baseRectanguler + ", heightRectanguler=" + heightRectanguler + '}';
    }
    
    
    
}
