package exam01.model;

/**
 *
 * @author Karla Ansatuña
 */
public class FlashDrive {

    @Override
    public String toString() {
        return "FlashDrive{" + "color=" + color + ", id=" + id + ", quantity=" + quantity + '}';
    }
    private String color;
    private int id;
    private int quantity;
    
public FlashDrive(){
    color="";
    id=0;
    quantity=0;
}
    public FlashDrive(String color, int id, int quantity) {
        this.color = color;
        this.id = id;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

