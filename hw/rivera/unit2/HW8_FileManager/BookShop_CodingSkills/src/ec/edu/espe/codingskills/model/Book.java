package ec.edu.espe.codingskills.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Book {
    
    private int id;
    private String name;
    private float price;

    @Override
    public String toString() {
        return "Screen{" + "id=" + id + ", size=" + price + ", brandName=" + name + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
