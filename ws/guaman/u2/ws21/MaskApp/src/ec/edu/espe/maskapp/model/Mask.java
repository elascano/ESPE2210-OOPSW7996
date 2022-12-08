package ec.edu.espe.maskapp.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Mask {
    private String id;
    private String color;
    private String kind;

    
    public Mask() {
        String id = "";
        String color = "";
        String kind = "";
    }
    
    public Mask(String id, String color, String kind) {
        this.id = id;
        this.color = color;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Mask{" + "id=" + id + ", color=" + color + ", kind=" + kind + '}';
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
     * @return the kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * @param kind the kind to set
     */
    public void setKind(String kind) {
        this.kind = kind;
    }
    
    
}
