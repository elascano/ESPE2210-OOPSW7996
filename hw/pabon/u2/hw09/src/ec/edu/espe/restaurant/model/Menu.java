
package ec.edu.espe.restaurant.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */
public class Menu {
    
    private String food;
    private String price;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" + "food=" + food + ", price=" + price + '}';
    }
     
    
    
}
