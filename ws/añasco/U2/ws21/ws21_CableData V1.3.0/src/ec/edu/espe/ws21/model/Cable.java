package ec.edu.espe.ws21.model;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public class Cable {

    private int id;
    private String color;
    private float price;

    public Cable() {
        id = 0;
        color = "";
        price = 0;
    }

    public Cable(int id, String color, float price) {
        this.id = id;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SoundMixer{" + "id=" + id + ", color=" + color + ", price=" + price + '}';
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}




