package ec.edu.espe.apanadossystem.model;

import java.util.List;

/**
 *
 * @author Christopher Bazurto, DeltaTeam, DCCO-ESPE
 */
public class VIPOrderCreator extends OrderCreator {

    public VIPOrderCreator(Customer customer, List<Menu> menuItems) {
        super(customer, menuItems);
    }

    @Override
    protected double calculateTotalPrice() {
        double totalPrice = 0;
        for (Menu item : menuItems) {
            totalPrice += item.getPrice() * 0.9;
        }
        return totalPrice;
    }
}
