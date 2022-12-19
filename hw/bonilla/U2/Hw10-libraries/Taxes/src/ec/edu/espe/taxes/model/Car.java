
package ec.edu.espe.taxes.model;

public class Car 
{
    private int id;
    private String carBrand;
    private float cylinderCapacity;
    private int antiquity;
    private Float computerGreenTax;

    public Car(int id, String carBrand, float cylinderCapacity, int antiquity, Float computerGreenTax) {
        this.id = id;
        this.carBrand = carBrand;
        this.cylinderCapacity = cylinderCapacity;
        this.antiquity = antiquity;
        this.computerGreenTax = computerGreenTax;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public float getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(float cilindraje) {
        this.cylinderCapacity = cilindraje;
    }

    public float getAntiquity() {
        return antiquity;
    }

    public void setAntiquity(int antiquity) {
        this.antiquity = antiquity;
    }

    public float getComputerGreenTax() {
        return computerGreenTax;
    }

    public void setComputerGreenTax(float computerGreenTax) {
        this.computerGreenTax = computerGreenTax;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", carBrand=" + carBrand + ", cilindraje=" + cylinderCapacity + ", antiquity=" + antiquity + ", computerGreenTax=" + computerGreenTax + '}';
    }
    

}
