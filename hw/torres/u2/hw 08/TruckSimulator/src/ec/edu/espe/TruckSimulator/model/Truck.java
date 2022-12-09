package ec.edu.espe.TruckSimulator.model;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Truck {
    
    private int id;
    private String color;
    private String brand;

    public Truck(int id, String color, String brand) {
        this.id = id;
        this.color = color;
        this.brand = brand;
    }
    
    public Truck(){
        id=0;
        color="";
        brand="";
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + id + ", color=" + color + ", brand=" + brand + '}';
    }
    
    
    
}
