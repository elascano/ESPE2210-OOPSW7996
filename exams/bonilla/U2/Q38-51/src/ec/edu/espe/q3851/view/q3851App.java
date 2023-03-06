package ec.edu.espe.q3851.view;

import ec.edu.espe.q3851.model.B;
import ec.edu.espe.q3851.model.D;
import ec.edu.espe.q3851.model.E;
import ec.edu.espe.q3851.model.F;
import java.util.ArrayList;

/**
 *
 * @author Jairo Bonilla, Developer Bears, DCCO-ESPE
 */
public class q3851App {

    public static void main(String[] args) {

        ArrayList<E> e = null;
        ArrayList<F> f = null;
        B b = new B();
        D d = new D(e, f);

        System.out.println(b);
        System.out.println(d);

    }
}
