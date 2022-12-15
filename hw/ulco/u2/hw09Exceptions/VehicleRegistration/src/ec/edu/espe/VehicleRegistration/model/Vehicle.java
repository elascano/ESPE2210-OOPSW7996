
package ec.edu.espe.VehicleRegistration.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class Vehicle {
    
    private int id;
    private String color;
    private long Kilometre;
    
    public Vehicle() {
        this.id = 0;
        this.color = "";
        this.Kilometre = 0;
    }
    
    public Vehicle(int id, String color, long Kilometre) {
        this.id = id;
        this.color = color;
        this.Kilometre = Kilometre;
    }

    @Override
    public String toString() {
        return "vehicle{" + "id=" + id + ", color=" + color + ", Kilometre=" + Kilometre + '}';
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the Kilometres
     */
    public long getKilometre() {
        return Kilometre;
    }

    /**
     * @param Kilometre the Kilometre to set
     */
    public void setKilometre(long Kilometre) {
        this.Kilometre = Kilometre;
    }

}
