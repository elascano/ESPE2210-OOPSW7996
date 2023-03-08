package ec.edu.espe.apanadossystem.model;

import java.util.List;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public abstract class OrderCreator {

    protected Customer customer;
    protected List<Menu> menuItems;

    public OrderCreator(Customer customer, List<Menu> menuItems) {
        this.customer = customer;
        this.menuItems = menuItems;
    }

    public Order createOrder() {

        Order order = new Order(0, customer.getName(), customer.getEmail(), customer.getID(), calculateTotalPrice(), false);
        return order;
    }

    protected abstract double calculateTotalPrice();
}
