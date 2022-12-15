package ec.edu.espe.guitarshop.model;

/**
 *
 * @author Stephen Drouet, Developer Bears, DCCO-ESPE
 */
public class Guitar {
    private int id;
    private String brand;
    private String color;
    private String typeOfWood;
    
    public Guitar() {
        this.id = -1;
        this.brand = "";
        this.color = "";
        this.typeOfWood = "";
    }

    public Guitar(int id, String brand, String color, String typeOfWood) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.typeOfWood = typeOfWood;
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

    /**
     * @return the typeOfWood
     */
    public String getTypeOfWood() {
        return typeOfWood;
    }

    /**
     * @param typeOfWood the typeOfWood to set
     */
    public void setTypeOfWood(String typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    @Override
    public String toString() {
        return "id=" + id + ", brand=" + brand + ", color=" + color + ", typeOfWood=" + typeOfWood;
    }
}
