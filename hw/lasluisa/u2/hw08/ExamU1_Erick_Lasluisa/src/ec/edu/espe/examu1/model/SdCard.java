
package ec.edu.espe.examu1.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class SdCard {
    private int id;
    private String brand;
    private int capacity;

    @Override
    public String toString() {
        return "SdCard{" + "id=" + getId() + ", brand=" + getBrand() + ", capacity=" + getCapacity() + '}';
    }

    public  SdCard(){
        id = 0;
        brand = "";
        capacity = 0;
    }
    
    public SdCard(int id, String brand, int capacity) {
        this.id = id;
        this.brand = brand;
        this.capacity = capacity;
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
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
}
