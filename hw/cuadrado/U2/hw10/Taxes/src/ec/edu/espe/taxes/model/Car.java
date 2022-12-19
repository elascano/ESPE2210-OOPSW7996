package ec.edu.espe.taxes.model;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
 */
public class Car {
    private float cylinderCapacity;
    private int year;
    private String type;
    private float greenTax;
    public Car(float cylinderCapacity, int year, String type, float greenTax) {
        this.cylinderCapacity = cylinderCapacity;
        this.year = year;
        this.type = type;
        this.greenTax = greenTax;
    }
    @Override
    public String toString() {
        return "Car{" + "cylinderCapacity=" + cylinderCapacity + ", year=" + year + ", type=" + type + ", greenTax=" + greenTax + '}';
    }
    public float getCylinderCapacity() {
        return cylinderCapacity;
    }
    public void setCylinderCapacity(float cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public float getGreenTax() {
        return greenTax;
    }
    public void setGreenTax(float greenTax) {
        this.greenTax = greenTax;
    }
    
}
