
package ec.edu.espe.cellphone.model;

/**
 *
 * @author Barrionuevo Lindsay, DeltaTeam, DCCO-ESPE
 */
public class Cellphone {
    private String brand;
    private String model;
    private String color;

    public Cellphone(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cellphone{" + "Brand=" + brand + ", Model=" + model + ", Color=" + color + '}';
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
