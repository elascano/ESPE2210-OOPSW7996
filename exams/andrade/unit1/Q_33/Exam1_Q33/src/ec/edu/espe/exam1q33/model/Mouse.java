
package ec.edu.espe.exam1q33.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class Mouse {
    private int id;
    private String name;
    private boolean rgb;
    
    public Mouse() {
        id = 0;
        name = "";
        rgb = false;
    }

    @Override
    public String toString() {
        return "mouse{" + "id=" + id + ", name=" + name + ", rgb=" + rgb + '}';
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
     * @return the rgb
     */
    public boolean isRgb() {
        return rgb;
    }

    /**
     * @param rgb the rgb to set
     */
    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    
        
    
}
