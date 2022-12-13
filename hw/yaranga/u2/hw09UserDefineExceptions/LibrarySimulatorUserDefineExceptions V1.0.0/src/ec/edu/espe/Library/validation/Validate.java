
package ec.edu.espe.Library.validation;

import ec.edu.espe.Library.exceptions.IdLessThanOneException;
/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Validate {
    
    public static int validateId(int id) throws IdLessThanOneException{
        if(id<1){
           throw new IdLessThanOneException("Invalid Id");
              }
        return id;
    }
      
}
