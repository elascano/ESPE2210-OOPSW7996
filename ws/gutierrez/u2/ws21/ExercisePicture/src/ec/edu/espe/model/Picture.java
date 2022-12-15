package ec.edu.espe.model;

/**
 *
 * @author Miguel Gutierrez, Pythons, DCCO-ESPE
 */
public class Picture {
    private int id;
    private String creator;
    private String type;

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
     * @return the tip
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param tip the tip to set
     */
    public void setCreator(String tip) {
        this.creator = tip;
    }

    /**
     * @return the color
     */
    public String getType() {
        return type;
    }

    /**
     * @param color the color to set
     */
    public void setType(String color) {
        this.type = color;
    }
    
}
