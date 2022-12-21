package ec.edu.espe.taxes.model;

import java.text.DecimalFormat;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Vehicle {

    private float cylinderSize;
    private int year;
    private String type;
    private float greenTax;

    public Vehicle(float cylinderCapacity, int year, String type, float greenTax) {
        this.cylinderSize = cylinderCapacity;
        this.year = year;
        this.type = type;
        this.greenTax = greenTax;
    }

    DecimalFormat formatTax = new DecimalFormat("#.00");

    @Override
    public String toString() {
        return "Vehicle{" + "CylinderSize = " + cylinderSize + ", year = " + year + ", type = " + type + ", greenTax = " + "$" + formatTax.format(greenTax) + '}';
    }

    /**
     * @return the cylinderSize
     */
    public float getCylinderSize() {
        return cylinderSize;
    }

    /**
     * @param cylinderSize the cylinderSize to set
     */
    public void setCylinderSize(float cylinderSize) {
        this.cylinderSize = cylinderSize;
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
