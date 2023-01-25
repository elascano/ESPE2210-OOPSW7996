package ec.edu.espe.FromUmlToCode.model;

import java.util.ArrayList;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class D extends A{
    private ArrayList<F> f;
    private ArrayList <E> e;


    public D(ArrayList<F> f, ArrayList<E> e, A a) {
        super(a);
        this.f = f;
        this.e = e;
    }

   
    
    public ArrayList<F> getF() {
        return f;
    }

    public void setF(ArrayList<F> f) {
        this.f = f;
    }

    public ArrayList<E> getE() {
        return e;
    }

    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
    
}
