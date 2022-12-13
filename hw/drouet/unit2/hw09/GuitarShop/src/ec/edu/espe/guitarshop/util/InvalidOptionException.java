package ec.edu.espe.guitarshop.util;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class InvalidOptionException extends Exception{

    public InvalidOptionException() {
        super("Error: Option entered is invalid.");
    }         
}
