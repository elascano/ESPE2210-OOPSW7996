package ec.edu.espe.q61_70.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Sport {
    protected String id;
    protected String name;
    protected String isInTeam;

    public Sport(String id, String name, String isInTeam) {
        this.id = id;
        this.name = name;
        this.isInTeam = isInTeam;
    }
    
   
    public Sport(){
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
     * @return the isInTeam
     */
    public String getIsInTeam() {
        return isInTeam;
    }

    /**
     * @param isInTeam the isInTeam to set
     */
    public void setIsInTeam(String isInTeam) {
        this.isInTeam = isInTeam;
    }

    
    
    
}
