
package ec.edu.espe.hw09.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Chair {
    private int id;
    private String material;
    private String color;
    
    public Chair(){
        id=0;
        material="";
        color="";
    }


    @Override
    public String toString() {
        return "Chair{" + "id=" + id + ", material=" + material + ", color=" + color + '}';
    }

    public Chair(int id, String material, String color) {
        this.id = id;
        this.material = material;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
