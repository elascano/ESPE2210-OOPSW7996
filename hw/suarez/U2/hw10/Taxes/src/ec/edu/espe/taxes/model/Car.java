package ec.edu.espe.taxes.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class Car {
    
    private float cylinderCapacity;
    private String typeCar;
    private int year;
    private float greenTax;

    public Car(float cylinderCapacity, String type, int year, float greenTax) {
        this.cylinderCapacity = cylinderCapacity;
        this.typeCar = type;
        this.year = year;
        this.greenTax = greenTax;
    }

    @Override
    public String toString() {
        return "Car{" + "cylinderCapacity=" + cylinderCapacity + ", type=" + typeCar + ", year=" + year + ", greenTax=" + greenTax + '}';
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
     * @return the type
     */
    public String getType() {
        return typeCar;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.typeCar = type;
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
