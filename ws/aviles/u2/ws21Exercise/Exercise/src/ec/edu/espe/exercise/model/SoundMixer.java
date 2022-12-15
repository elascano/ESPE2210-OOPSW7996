package ec.edu.espe.exercise.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class SoundMixer {
    int id;
    float price;
    String brand;

    public SoundMixer() {
        id = 0;
        price=0;
        brand="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
