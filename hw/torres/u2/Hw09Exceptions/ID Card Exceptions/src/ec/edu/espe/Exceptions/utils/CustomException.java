package ec.edu.espe.Exceptions.utils;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class CustomException extends Exception{
    public static final long serialVersionUID = 700L;
    public CustomException(String message){
        super(message);
    }
}
