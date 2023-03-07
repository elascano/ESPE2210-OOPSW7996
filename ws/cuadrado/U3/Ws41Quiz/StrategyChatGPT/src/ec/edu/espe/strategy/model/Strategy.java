package ec.edu.espe.strategy.model;
import java.util.List;
/**
 *
 * @author alejo
 */
public class Strategy {
    interface PaymentMethod {
    void pay(int amount);
    }   
}
