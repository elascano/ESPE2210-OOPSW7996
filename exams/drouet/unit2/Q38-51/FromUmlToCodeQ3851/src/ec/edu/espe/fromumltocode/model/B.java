package ec.edu.espe.fromumltocode.model;

import java.util.ArrayList;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class B extends A{
    private ArrayList<H> hs;

    public B(ArrayList<H> hs, ArrayList<A> a) {
        super(a);
        this.hs = hs;
    }

    

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }
    
    
    
}
