
package ec.edu.espe.trashbinsimulator.model;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class TrashBin {
    private int id;
    private String material;
    private String color;

    @Override
    public String toString() {
        return "TrashBin{" + "id=" + getId() + ", material=" + getMaterial() + ", capacity=" + getColor() + '}';
    }

    public  TrashBin(){
        id = 0;
        material = "";
        color = "";
    }
    
    public TrashBin(int id, String material, String color) {
        this.id = id;
        this.material = material;
        this.color = color;
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
    public String getColor() {
        return color;
    }

    /**
     * @param color the capacity to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
