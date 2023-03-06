package ec.edu.espe.q3851.model;

import java.util.ArrayList;

/**
 *
 * @author Jairo Bonilla, Developer Bears, DCCO-ESPE
 */
public class C extends A {

    private ArrayList<E> e;

    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "C{" + "e=" + e + '}';
    }

    public C(ArrayList<E> e) {
        this.e = e;
    }
    
}
