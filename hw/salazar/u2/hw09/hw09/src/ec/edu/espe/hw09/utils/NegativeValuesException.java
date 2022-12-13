package ec.edu.espe.hw09.utils;

/**
 *
 * @author Augusto Salazar, WebMasterTeam, DCCO-ESPE
 */
public class NegativeValuesException extends Exception{
    
    private long serialVersionUID = 700L;

    public NegativeValuesException(String message) {
        super(message);
    }
    
}
