
package ec.edu.espe.VehicleRegistration.utils;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class EnterKilometresException extends Exception{
    public EnterKilometresException() {
        super("Kilometres invalido 1 - 200000");
    }
}
