package ec.edu.espe.exam.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Tree {
    
   private String id;
   private String color;
   private String type;
   private String size;

    public Tree(String brand, String design, String material, String price) {
        this.id = brand;
        this.color = design;
        this.type = material;
        this.size = price;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SmartWatchs{" + "brand=" + id + ", design=" + color + ", material=" + type + ", price=" + size + '}';
    }
  
}
