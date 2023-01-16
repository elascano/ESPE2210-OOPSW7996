package ec.edu.espe.diagram.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class D {
    
    int E;
    int F;

    public D(int E, int F) {
        this.E = E;
        this.F = F;
    }

    public int getE() {
        return E;
    }

    public void setE(int E) {
        this.E = E;
    }

    public int getF() {
        return F;
    }

    public void setF(int F) {
        this.F = F;
    }

    @Override
    public String toString() {
        return "D{" + "E=" + E + ", F=" + F + '}';
    }
    
    
}
