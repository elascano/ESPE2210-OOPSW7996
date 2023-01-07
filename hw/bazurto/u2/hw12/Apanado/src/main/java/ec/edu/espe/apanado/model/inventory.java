
package ec.edu.espe.apanado.model;

/**
 *
 * @author bazur
 */
public class inventory {
    private int id;
    private boolean isAvailable;
    private String name;

    public inventory(int id, boolean isAvailable, String name) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.name = name;
    }

    @Override
    public String toString() {
        return "inventory{" + "id=" + id + ", isAvailable=" + isAvailable + ", name=" + name + '}';
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
     * @return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
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
    
}
