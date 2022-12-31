package ec.edu.espe.restaurant.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Product {
    private int id;
    private int price;
    private String name;

    
    public Product(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.price = age;
    }

     @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + price + '}';
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
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
