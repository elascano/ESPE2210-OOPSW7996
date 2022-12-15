package ec.edu.espe.catsAdministrator.utils;

/**
 *
 * @author Justin Villarroel, TeamProgress, DCCO-ESPE
 */
public class CustomException extends Exception{
    public static final long serialVersionUID = 700L;
    
    public CustomException(String mensaje){
        super(mensaje);
    }
}
