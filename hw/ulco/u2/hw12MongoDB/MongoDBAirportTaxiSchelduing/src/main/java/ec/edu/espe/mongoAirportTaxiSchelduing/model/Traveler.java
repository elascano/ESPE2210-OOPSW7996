
package ec.edu.espe.mongoAirportTaxiSchelduing.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Traveler {

    private int id;
    private String name;
    private String adress;
    private float kilometesTraveler;

    @Override
    public String toString() {
        return "Traveler{" + "id=" + id + ", name=" + name + ", adress=" + adress + ", kilometesTraveler=" + kilometesTraveler + '}';
    }

    public Traveler() {
        this.id = 0;
        this.name = "";
        this.adress = "";
        this.kilometesTraveler = 0;
    }

    public Traveler(int id, String name, String adress, float kilometesTraveler) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.kilometesTraveler = kilometesTraveler;
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
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the kilometesTraveler
     */
    public float getKilometesTraveler() {
        return kilometesTraveler;
    }

    /**
     * @param kilometesTraveler the kilometesTraveler to set
     */
    public void setKilometesTraveler(float kilometesTraveler) {
        this.kilometesTraveler = kilometesTraveler;
    }
}
