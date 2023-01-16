
package ec.edu.espe.fromumltocode.model;

import java.util.ArrayList;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class B extends A{
    private ArrayList<H> h = new ArrayList<>();

    /**
     * @return the h
     */
    public ArrayList<H> getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(ArrayList<H> h) {
        this.h = h;
    }

    public B() {
    }

    @Override
    public String toString() {
        return "B{" + "h=" + h + '}';
    }
    
    
    
}
