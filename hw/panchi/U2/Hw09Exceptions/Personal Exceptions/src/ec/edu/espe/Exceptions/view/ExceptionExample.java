package ec.edu.espe.Exceptions.view;
import ec.edu.espe.Exceptions.model.Helper;
import ec.edu.espe.Exceptions.exceptions.CustomException;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class ExceptionExample {
    
    public static void main(String[] args) {
        String user, password, repassword;
        user = "Allan2404";
        password = "465654";
        repassword = "231978";
        
        Helper helper = new Helper();
    
        try{
        
        helper.validatePassword(password, repassword);
    
        }catch(CustomException e){
        System.out.println("Can't register the user 'cause:" + e.getMessage());
        }  
    }
}
