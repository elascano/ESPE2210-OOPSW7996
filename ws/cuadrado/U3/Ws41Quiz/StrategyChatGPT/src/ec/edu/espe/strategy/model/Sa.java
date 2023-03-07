package ec.edu.espe.strategy.model;
/**
 *
 * @author alejo
 */
public class Sa {
public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    cart.add(100);
    cart.add(200);
    cart.setPaymentMethod(new CreditCard());
    cart.pay();

    cart.setPaymentMethod(new PayPal());
    cart.pay();
}    
}
