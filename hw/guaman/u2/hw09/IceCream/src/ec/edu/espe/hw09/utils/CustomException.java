package ec.edu.espe.hw09.utils;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class CustomException extends Exception{
    public static final long serialVersionUID = 700L;
    
    public CustomException(String mensaje){
        super(mensaje);
    }
}
