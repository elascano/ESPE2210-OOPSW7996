
package ec.edu.espe.CruiseShips.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class CruiseShip {

    private int id;
    private String model;
    private long capacity;

    public CruiseShip() {
        this.id = 0;
        this.model = "";
        this.capacity = 0;
    }

    public CruiseShip(int id, String model, long capacity) {
        this.id = id;
        this.model = model;
        this.capacity = capacity;
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the capacity
     */
    public long getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

}
