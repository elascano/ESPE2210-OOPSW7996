package ec.edu.espe.examgoalkeeper.model;

/**
 *
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class Goalkeeper {

    private String id;
    private String name;
    private float height;

    public Goalkeeper(String id, String name, float height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public Goalkeeper() {
        String id = "";
        String name = "";
        float height = 0;
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
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

}