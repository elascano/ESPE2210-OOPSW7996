package ec.edu.espe.main.model;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Microphone {
    private int id;
    private String brand;
    private String model;

    public Microphone(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Microphone() {
    }

    @Override
    public String toString() {
        return "Microphone{" + "id=" + id + ", brand=" + brand + ", model=" + model + '}';
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
    
}
