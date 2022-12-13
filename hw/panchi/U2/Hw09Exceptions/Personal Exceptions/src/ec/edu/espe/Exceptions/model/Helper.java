package ec.edu.espe.Exceptions.model;
import ec.edu.espe.Exceptions.exceptions.CustomException;
/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Helper {

    public Helper() {
    }
    public void validatePassword(String password, String repassword) throws CustomException{
        
        if(!password.equals(repassword)){
            
            throw new CustomException("this camps don't match");
            
        }
        
        if(password.length() < 5){
        
            throw new CustomException("the password isn't enough long");
            
        }
    }
}
