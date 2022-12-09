package ec.edu.espe.candy.model;
/**
 *
 * @author Suquillo Martín, WebMasterTeam , DCCO-ESPE
 */
public class Candy {
    private int id;
    private String name;
    private String type;

    public Candy(int id, String name, String candy) {
        this.id = id;
        this.name = name;
        this.type = candy;
    }

    public Candy() {
        id = 0;
        name = "";
        type = "";
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
