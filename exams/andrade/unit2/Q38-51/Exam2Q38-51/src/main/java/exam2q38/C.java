
package exam2q38;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class C extends A{
    private ArrayList<E> es;

    public C(ArrayList<A> as, ArrayList<E> es) {
        super(as);
        this.es = es;
    }

    @Override
    public String toString() {
        return "C{" + "es=" + es + '}';
    }

    /**
     * @return the e
     */
    public ArrayList<E> getE() {
        return es;
    }

    /**
     * @param e the e to set
     */
    public void setE(ArrayList<E> e) {
        this.es = e;
    }
    
    
}
