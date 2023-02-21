
package ec.edu.espe.Singleton.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class USTax {
    private static USTax instance;
    private static final Object lock = new Object();
    
    private USTax(){};

    public static USTax getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new USTax();
                }
            }
        }
        return instance;
    }

    public float salesTotal() {
      return 2500;
    } 
}
