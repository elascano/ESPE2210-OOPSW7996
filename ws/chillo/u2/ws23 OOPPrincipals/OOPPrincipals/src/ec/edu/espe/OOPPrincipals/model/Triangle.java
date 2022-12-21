package ec.edu.espe.OOPPrincipals.model;

/**
 *
 * @author NicolayChillo Gaman GeekLords at DCOO-ESPE
 */
public class Triangle {
    
    private int baseTriangle;
    private int leftSideTriangle;
    private int rightSideTriangle;
    private int heightTriangle;

    public Triangle(int baseTriangle, int leftSideTriangle, int rightSideTriangle, int heightTriangle) {
        this.baseTriangle = baseTriangle;
        this.leftSideTriangle = leftSideTriangle;
        this.rightSideTriangle = rightSideTriangle;
        this.heightTriangle = heightTriangle;
    }

    @Override
    public String toString() {
        return "Triangle{" + "baseTriangle=" + baseTriangle + ", leftSideTriangle=" + leftSideTriangle + ", rightSideTriangle=" + rightSideTriangle + ", heightTriangle=" + heightTriangle + '}';
    }
    
}
