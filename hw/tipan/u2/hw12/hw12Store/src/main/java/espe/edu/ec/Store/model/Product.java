package espe.edu.ec.store.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Product {

    private int id;
    private String name;
    private float price;

    @Override
    public String toString() {
        return "Burger{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

}
