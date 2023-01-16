package ec.edu.espe.restaurant.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Order {
    
    private String product;
    private int price;
    private int amount;
    private String nameOfCustomer;

    public Order(String product, int price, int amount, String nameOfCustomer) {
        this.product = product;
        this.price = price;
        this.amount = amount;
        this.nameOfCustomer = nameOfCustomer;
    }

    @Override
    public String toString() {
        return "Order{" + "product=" + product + ", price=" + price + ", amount=" + amount + ", nameOfCustomer=" + nameOfCustomer + '}';
    }    
    
    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the nameOfCustomer
     */
    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    /**
     * @param nameOfCustomer the nameOfCustomer to set
     */
    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }
    
    
    
    
}
