package ec.edu.espe.truck.model;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class Truck {
    int id;
    String carBrand;
    String color;

    public Truck() {
    }
    
    public Truck(int id, String carBrand, String color) {
        this.id = id;
        this.carBrand = carBrand;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Truck{" + "id=" + id + ", carBrand=" + carBrand + ", color=" + color + '}';
    }
    
}
