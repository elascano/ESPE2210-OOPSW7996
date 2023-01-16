
package exam2q38;

import java.util.ArrayList;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public abstract class A {
    private ArrayList<A> as;

    @Override
    public String toString() {
        return "A{" + "as=" + as + '}';
    }

    public A(ArrayList<A> as) {
        this.as = as;
    }

    /**
     * @return the as
     */
    public ArrayList<A> getAs() {
        return as;
    }

    /**
     * @param as the as to set
     */
    public void setAs(ArrayList<A> as) {
        this.as = as;
    }
    
    
}
