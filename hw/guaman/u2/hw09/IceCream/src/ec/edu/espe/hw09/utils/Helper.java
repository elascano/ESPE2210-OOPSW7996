package ec.edu.espe.hw09.utils;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Helper {

    public Helper() {

    }

    public void validateAddAnother(String addOtherIceCream) throws CustomException {
        if (!"y".equals(addOtherIceCream.toLowerCase())) {
            throw new CustomException("Letter entered not admitted");
        } else if (!"y".equals(addOtherIceCream.toLowerCase())) {
            throw new CustomException("Letter entered not admitted");
        }
    }
}
