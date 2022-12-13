
package ec.edu.espe.trashbinsimulator.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class TrashBin {
    private int id;
    private String material;
    private int capacity;

    @Override
    public String toString() {
        return "TrashBin{" + "id=" + getId() + ", material=" + getMaterial() + ", capacity=" + getCapacity() + '}';
    }

    public  TrashBin(){
        id = 0;
        material = "";
        capacity = 0;
    }
    
    public TrashBin(int id, String material, int capacity) {
        this.id = id;
        this.material = material;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param Material the material to set
     */
    public void setMaterial(String Material) {
        this.material = Material;
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
