
package ec.edu.espe.diagram.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */
public abstract class H {
    
    int G;

    public H(int G) {
        this.G = G;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        this.G = G;
    }

    @Override
    public String toString() {
        return "H{" + "G=" + G + '}';
    }
    
}
