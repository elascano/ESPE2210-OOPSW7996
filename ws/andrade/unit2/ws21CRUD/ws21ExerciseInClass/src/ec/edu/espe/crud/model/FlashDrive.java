
package ec.edu.espe.crud.model;

/**
 *
 * @author Alejandro Andrade, Scriptal, DCCO_ESPE
 */
public class FlashDrive {
    private int id;
    private String name;
    private int size;
    
    public FlashDrive() {
        id = 0;
        name = "";
        size = 0;
    }

    @Override
    public String toString() {
        return "mouse{" + "id=" + id + ", name=" + name + ", size=" + size + '}';
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
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
        
    
}
