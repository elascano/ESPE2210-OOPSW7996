package ec.edu.espe.code.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO-ESPE
 */
public class USATax {

    private static USATax instance;
    private float tax;

    private USATax(){
        tax = 3F;
    }

    public static USATax getInstance() {
        if (instance == null)
        {
            instance = new USATax();
        }
        return instance;
    }
    
    public float getTax() {
        return tax;
    }

}
