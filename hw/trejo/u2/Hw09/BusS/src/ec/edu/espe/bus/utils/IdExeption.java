package ec.edu.espe.bus.utils;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class IdExeption extends Exception {

    public static boolean IdExeption(int id) {

        try {
            if (id < 0) {
                throw new IdExeption("Error id value must be positive");
            }

        } catch (IdExeption ex) {
            System.out.println("The id could not be registered because there is a :" + ex.getMessage());
            return true;
        }
        return false;

    }

    public IdExeption(String message) {
        super(message);
    }
}
