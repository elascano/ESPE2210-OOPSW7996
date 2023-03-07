package ec.edu.espe.strategy.model;
import ec.edu.espe.strategy.model.Strategy.PaymentMethod;
/**
 *
 * @author alejo
 */
class CreditCard implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
    }
}

