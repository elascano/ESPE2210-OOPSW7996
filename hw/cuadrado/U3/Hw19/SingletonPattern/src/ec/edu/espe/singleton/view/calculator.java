package ec.edu.espe.singleton.view;
import ec.edu.espe.singleton.model.USTax;

/**
 *
 * @author alejo
 */
public class calculator {
    public static void main(String args[]) {
        USTax tax = USTax.getInstance();
        System.out.println("Sales Total: " + tax.salesTotal());
    }
}
