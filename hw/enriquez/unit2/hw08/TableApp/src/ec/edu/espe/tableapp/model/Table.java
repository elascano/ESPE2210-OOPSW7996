package ec.edu.espe.tableapp.model;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Table {
    private int id;
    private String color;
    private String material;

    public Table(int id, String color, String material) {
        this.id = id;
        this.color = color;
        this.material = material;
    }
    
    public Table() {
        int id = 0;
        String color = "";
        String material = "";
    }

    @Override
    public String toString() {
        return "Table{" + "id=" + id + ", color=" + color + ", material=" + material + '}';
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
}
