package ec.edu.espe.urbanizationtreasury.model;

/**
 *
 * @author Rivera Joel, WebMasterTeam, DCCO-ESPE
 */
public class Resident {

    private String id;
    private String batch;
    private String name;

    public Resident(String id, String batch, String name) {
        this.id = id;
        this.batch = batch;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Resident{" + "id=" + id + ", batch=" + batch + ", name=" + name + '}';
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
     * @return the batch
     */
    public String getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(String batch) {
        this.batch = batch;
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
