
package ec.edu.espe.hw09_Exceptions_GameStore.util;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class InvalidAgeException extends Exception {
    
    private int age;
    
    public InvalidAgeException(int age){
        super("Invalid gamer Age: " + age);
        this.age = age;
    }
    
    public int getId(){
        return age;
    }
}
