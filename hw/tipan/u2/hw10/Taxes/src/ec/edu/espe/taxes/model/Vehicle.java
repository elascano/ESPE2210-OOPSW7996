
package ec.edu.espe.taxes.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Vehicle {
    private String ownerName;
    private int year;
    private String type;
    private String color;
    private float cylinderCapacity;
    private float greenTax;

    public Vehicle(String ownerName, int year, String type, String color, float cylinderCapacity, float greenTax) {
        this.ownerName = ownerName;
        this.year = year;
        this.type = type;
        this.color = color;
        this.cylinderCapacity = cylinderCapacity;
        this.greenTax = greenTax;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "ownerName=" + ownerName + ", year=" + year + ", type=" + type + ", color=" + color + ", cylinderCapacity=" + cylinderCapacity + ", greenTax=" + greenTax + '}';
    }

    
    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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
     * @return the cylinderCapacity
     */
    public float getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    public void setCylinderCapacity(float cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
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
