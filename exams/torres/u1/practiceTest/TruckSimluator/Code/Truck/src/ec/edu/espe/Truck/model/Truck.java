
package ec.edu.espe.Truck.model;

/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Truck {

    private int id;
    private String brand;
    private String color;
    
    public Truck() {
        id = 0;
        brand = "";
        color = "";
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
    
