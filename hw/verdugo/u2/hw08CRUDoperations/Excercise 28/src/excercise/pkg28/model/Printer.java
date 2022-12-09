
package excercise.pkg28.model;

/**
 *
 * @author Sebastian Verdugo, ProgressTeam, DCOO-ESPE
 */
public class Printer {
    private String name;
    private int id;
    private String type;
    
    public Printer(String name, int id, String type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }
    
    public Printer() {
        this.name = "";
        this.id = 0;
        this.type = "";
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}