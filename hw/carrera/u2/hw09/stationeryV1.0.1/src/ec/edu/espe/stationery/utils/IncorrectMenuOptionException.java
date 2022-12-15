package ec.edu.espe.stationery.utils;
import ec.edu.espe.stationery.view.Stationery;
import java.util.InputMismatchException;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class IncorrectMenuOptionException extends InputMismatchException  {

    public IncorrectMenuOptionException(String message) {
        System.err.println(message);
        Stationery.runMenu();
    }  
}
