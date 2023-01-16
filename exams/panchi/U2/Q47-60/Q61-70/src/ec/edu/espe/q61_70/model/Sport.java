package ec.edu.espe.q61_70.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class Sport {
    private int id;
    private String name;
    private boolean isInTeam;

    @Override
    public String toString() {
        return "Sport{" + "id=" + id + ", name=" + name + ", isInTeam=" + isInTeam + '}';
    }

    public Sport(int id, String name, boolean isInTeam) {
        this.id = id;
        this.name = name;
        this.isInTeam = isInTeam;
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
     * @return the isInTeam
     */
    public boolean isIsInTeam() {
        return isInTeam;
    }

    /**
     * @param isInTeam the isInTeam to set
     */
    public void setIsInTeam(boolean isInTeam) {
        this.isInTeam = isInTeam;
    }
    
    
}
