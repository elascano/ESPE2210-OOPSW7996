
package ec.edu.espe.ecomarket.model;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
 */
public class Product {

    private String name;
    private float price;
    private String expiration;
    private int stock;

    public Product(String name, float price, String expiration, int stock) {
        this.name = name;
        this.price = price;
        this.expiration = expiration;
        this.stock = stock;
    }

    public Product() {
    }
    

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", expiration=" + expiration + ", stock=" + stock + '}';
    }

    public String toStringData() {
        return name + "," + price + "," + expiration + "," + stock;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the expiration
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * @param expiration the expiration to set
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}