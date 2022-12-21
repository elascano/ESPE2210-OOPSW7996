package ec.edu.espe.taxes.model;

import java.text.DecimalFormat;

/**
 *
 * @author NW USER
 */
public class Car {

    private String owner;
    private String brand;
    private String model;
    private String color;
    private int carYear;
    private int cilynder;
    private float greenTax;
    DecimalFormat formato2 = new DecimalFormat("#.##");
    @Override
    public String toString() {
        return "Car{" + "owner=" + owner + ", brand=" + brand + ", model=" + model + ", color=" + color + ", carYear=" + carYear + ", cylinder=" + cilynder + ", greenTax=" + formato2.format(greenTax) + '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public int getCilynder() {
        return cilynder;
    }

    public void setCilynder(int cilynder) {
        this.cilynder = cilynder;
    }

    public float getGreenTax() {
        return greenTax;
    }

    public void setGreenTax(float greenTax) {
        this.greenTax = greenTax;
    }

    public Car(String owner, String brand, String model, String color, int carYear, int cilynder, float greenTax) {
        this.owner = owner;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.carYear = carYear;
        this.cilynder = cilynder;
        this.greenTax = greenTax;
    }

}
