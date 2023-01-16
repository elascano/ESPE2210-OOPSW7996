
package exam2q38;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class D extends A{
    private E[] es;
    private ArrayList<F> fs;

    public D(ArrayList<A> as, ArrayList<F> fs, E[] es) {
        super(as);
        this.fs = fs;
        this.es = es;
    }

    @Override
    public String toString() {
        return "D{" + "e=" + es + '}';
    }

    /**
     * @return the e
     */
    public E[] getE() {
        return es;
    }

    /**
     * @param e the e to set
     */
    public void setE(E[] e) {
        this.es = e;
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }
    
    
}
