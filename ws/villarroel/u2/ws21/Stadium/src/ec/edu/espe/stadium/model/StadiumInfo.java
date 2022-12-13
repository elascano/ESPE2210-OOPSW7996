
package ec.edu.espe.stadium.model;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class StadiumInfo {
    private String id;
    private String stadiumName;
    private String capacity;

    public StadiumInfo(String id, String stadiumName, String capacity) {
        this.id = id;
        this.stadiumName = stadiumName;
        this.capacity = capacity;
    }
    
    public StadiumInfo() {
        this.id = "";
        this.stadiumName = "";
        this.capacity = "";
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
     * @return the stadiumName
     */
    public String getStadiumName() {
        return stadiumName;
    }

    /**
     * @param stadiumName the stadiumName to set
     */
    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    /**
     * @return the capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setCapcity(String stadiumCapacityChange) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    
    
}
