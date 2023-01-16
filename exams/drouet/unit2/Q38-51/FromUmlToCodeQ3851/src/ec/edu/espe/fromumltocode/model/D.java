package ec.edu.espe.fromumltocode.model;

import java.util.ArrayList;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class D extends A{
    
    private D[] ds;
    private ArrayList<F> fs;

    public D(D[] ds, ArrayList<F> fs, ArrayList<A> a) {
        super(a);
        this.ds = ds;
        this.fs = fs;
    }    
    

    /**
     * @return the ds
     */
    public D[] getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(D[] ds) {
        this.ds = ds;
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
