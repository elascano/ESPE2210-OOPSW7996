package ec.edu.espe.Gummy.utils;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Helper {

    public Helper() {
    }

    public void validateAddAnother(String addOtherGummy) throws CustomException {
        if (!"y".equals(addOtherGummy.toLowerCase())&&!"n".equals(addOtherGummy.toLowerCase())) {
            throw new CustomException("Wrong letter!");
    }
   }
}
