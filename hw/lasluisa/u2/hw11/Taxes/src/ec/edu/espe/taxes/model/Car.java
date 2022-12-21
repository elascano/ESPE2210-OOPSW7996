package ec.edu.espe.taxes.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class Car {
    private int id;
    private float cylinder;
    private int year;
    private float greenTax;

    @Override
    public String toString() {
        return "Car{" + "id=" + getId() + ", cylinder=" + getCylinder() + ", year=" + getYear() + ", greenTax=" + getGreenTax() + '}';
    }

    public Car(int id, float cylinder, int year, float greenTax) {
        this.id = id;
        this.cylinder = cylinder;
        this.year = year;
        this.greenTax = greenTax;
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
     * @return the cylinder
     */
    public float getCylinder() {
        return cylinder;
    }

    /**
     * @param cylinder the cylinder to set
     */
    public void setCylinder(float cylinder) {
        this.cylinder = cylinder;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the greenTax
     */
    public float getGreenTax() {
        return greenTax;
    }

    /**
     * @param greenTax the greenTax to set
     */
    public void setGreenTax(float greenTax) {
        this.greenTax = greenTax;
    }
    
    
    
}
