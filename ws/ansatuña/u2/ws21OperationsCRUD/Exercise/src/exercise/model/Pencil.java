package exercise.model;

/**
 *
 * @author NW USER
 */
public class Pencil {

    @Override
    public String toString() {
        return "Pencil{" + "id=" + id + ", color=" + color + ", quantity=" + quantity + '}';
    }

    private int id;
    private String color;
    private int quantity;

    public Pencil() {
        color = "";
        id = 0;
        quantity = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
