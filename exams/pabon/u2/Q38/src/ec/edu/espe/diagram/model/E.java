package ec.edu.espe.diagram.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class E {
    
    int C;
    int D;

    public E(int C, int D) {
        this.C = C;
        this.D = D;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    @Override
    public String toString() {
        return "E{" + "C=" + C + ", D=" + D + '}';
    }
    
    
    
}
