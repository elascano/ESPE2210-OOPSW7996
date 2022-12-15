package ec.edu.espe.Exceptions.model;
import ec.edu.espe.Exceptions.utils.CustomException;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Helper {

    public Helper() {
    }
    public void validateIdCard(int provinceCode, int idCard) throws CustomException{

        
        if((idCard/10)>999999999 || idCard<1000000000 ){
                throw new CustomException("The ID does not contain 10 digits"); 
        }
        
        if((idCard/100000000) != provinceCode){
            
            throw new CustomException("The ID does not belong to the Pichincha province");
            
        }
        
        
    }
}
