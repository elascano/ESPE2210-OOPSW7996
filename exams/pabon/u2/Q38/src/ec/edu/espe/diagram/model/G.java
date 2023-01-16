package ec.edu.espe.diagram.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class G {
    
    int H;

    public G(int H) {
        this.H = H;
    }

    public int getH() {
        return H;
    }

    public void setH(int H) {
        this.H = H;
    }

    @Override
    public String toString() {
        return "G{" + "H=" + H + '}';
    }
    
}
