package userdefinedexceptions;


/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Validate {

    public Validate() {
    }
    public void validatedBook(int id, int publication) throws CustomException{
        
        if(id < 100 || id > 999 )          
            
           throw new CustomException("Wrong ID "); 
        
        if(publication < 1900 || publication > 2022)   
            
            throw new CustomException("Wrong year of publication");

    }
}
