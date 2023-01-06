
package espe.edu.ec.mileageinkilometers.model;

import java.util.Date;

public class Mileage {
    private int id;
    private float kilometers;
    private Date date;

    public Mileage(int id, float kilometers, Date date) {
        this.id = id;
        this.kilometers = kilometers;
        this.date = date;
    }
    
    public Mileage() {
        this.id = 0;
        this.kilometers = 0;
        this.date = null;
    }

    @Override
    public String toString() {
        return "Mileage{" + "id=" + id + ", kilometers=" + kilometers + ", date=" + date + '}';
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
     * @return the kilometers
     */
    public float getKilometers() {
        return kilometers;
    }

    /**
     * @param kilometers the kilometers to set
     */
    public void setKilometers(float kilometers) {
        this.kilometers = kilometers;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
