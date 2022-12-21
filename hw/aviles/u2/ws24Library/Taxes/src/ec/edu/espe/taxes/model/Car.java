package ec.edu.espe.taxes.model;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Car {
    private int id;
    private int year;
    private float cylinderCapacity;
    private String brand;
    private float greenTax;

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", year=" + year + ", cylinderCapacity=" + cylinderCapacity + ", brand=" + brand + ", greenTax=" + greenTax + '}';
    }

    public Car(int id, int year, float cylinderCapacity, String brand, float GreenTax) {
        this.id = id;
        this.year = year;
        this.cylinderCapacity = cylinderCapacity;
        this.brand = brand;
        this.greenTax = GreenTax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(float cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getGreenTax() {
        return greenTax;
    }

    public void setGreenTax(float GreenTax) {
        this.greenTax = GreenTax;
    }
}
