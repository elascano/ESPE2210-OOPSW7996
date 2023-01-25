package ec.edu.espe.FromUmlToCode.model;

import java.util.ArrayList;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class C extends A{
    private ArrayList<E> e;

    public C(ArrayList<E> e, A a) {
        super(a);
        this.e = e;
    }

    
    public ArrayList<E> getE() {
        return e;
    }

    public void setE(ArrayList<E> e) {
        this.e = e;
    }
    
}
