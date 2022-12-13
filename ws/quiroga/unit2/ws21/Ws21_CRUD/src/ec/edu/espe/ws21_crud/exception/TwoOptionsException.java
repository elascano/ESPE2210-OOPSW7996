package ec.edu.espe.ws21_crud.exception;

/**
 *
 * @author Francisco Quiroga, Search Engine Bandits , DCCO-ESPE
 */
public class TwoOptionsException extends Exception{
    int enter;
    
    public TwoOptionsException(int enter){
        super("Invalid option, type only the numbers shown");
    }
           
    
}
