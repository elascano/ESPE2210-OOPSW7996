package espe.edu.ec.Shoes.model;
/**
 *
 * @author Alejandro Cuadrado,DCCO-ESPE
 */
public class Shoes {
    private int id;
    private String name;
    private float price;
    @Override
    public String toString() {
        return "Shoes{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
    public Shoes(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
