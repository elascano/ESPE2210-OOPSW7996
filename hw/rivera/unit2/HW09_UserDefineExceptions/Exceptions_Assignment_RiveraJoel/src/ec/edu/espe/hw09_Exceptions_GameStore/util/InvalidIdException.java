
package ec.edu.espe.hw09_Exceptions_GameStore.util;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class InvalidIdException extends Exception {
    
    private int id;
    
    public InvalidIdException(int id){
        super("Invalid gamer Id: " + id);
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
}
