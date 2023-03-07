package ec.edu.espe.strategy.model;
import ec.edu.espe.strategy.model.Strategy.PaymentMethod;
/**
 *
 * @author alejo
 */
class ShoppingCart {
    private int totalCost;
    private PaymentMethod paymentMethod;

    public void add(int cost) {
        totalCost += cost;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        paymentMethod.pay(totalCost);
    }
}    
