package ec.edu.espe.OOPPrincipals.model;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Circle {
    
    private double radioCircle;

    public Circle(double radioCircle) {
        this.radioCircle = radioCircle;
    }

    @Override
    public String toString() {
        return "Circle{" + "radioCircle=" + radioCircle + '}';
    }
    
}
