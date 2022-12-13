package ec.edu.espe.goalkeeperapp.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Goalkeeper {
    private String id;
    private String name;
    private Float height;

    public Goalkeeper(String id, String name, Float height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }
    
    public Goalkeeper() {
        String id = "";
        String name = "";
        Float height = 0F;
    }

    @Override
    public String toString() {
        return "Goalkeeper{" + "id=" + id + ", name=" + name + ", height=" + height + '}';
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the height
     */
    public Float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Float height) {
        this.height = height;
    }
}
