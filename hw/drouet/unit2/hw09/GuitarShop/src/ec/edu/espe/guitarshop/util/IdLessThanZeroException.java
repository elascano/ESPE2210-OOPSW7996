package ec.edu.espe.guitarshop.util;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class IdLessThanZeroException extends Exception {    

    public IdLessThanZeroException() {
        super("Error: The number entered is less than zero");
    }           
}
