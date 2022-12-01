
package ec.edu.espe.exam.model;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class Scissors implements Comparable<Scissors> {

    private int id;
    private String brand;
    private String color;
    private int size;
 

    public Scissors() {
        this.id = 0;
        this.brand = "";
        this.color = "";
        this.size = 0;
  
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + brand + ", color=" + color + ", age=" + size + '}';
    }
    
    public Scissors(int id, String name, String color, int age) {
        this.id = id;
        this.brand = name;
        this.color = color;
        this.size = age;

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
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(Scissors o) {
        Integer newId = id;
        return newId.compareTo(o.getId());
    }

}
