package ec.edu.espe.taxes.model;

/**
 *
 * @author Nicolay Chillo, Gaman GeekLords at DCOO-ESPE
 */
public class Vehicle {
    private String vehicleBrand;
    private int cylinderCapacity;
    private int yearsOfTheVehicle;
    private boolean hybrid;
    private float greenTax;

    public Vehicle(String vehicleBrand, int cylinderCapacity, int yearsOfTheVehicle, boolean hybrid, float greenTax) {
        this.vehicleBrand = vehicleBrand;
        this.cylinderCapacity = cylinderCapacity;
        this.yearsOfTheVehicle = yearsOfTheVehicle;
        this.hybrid = hybrid;
        this.greenTax = greenTax;
    }

    @Override
    public String toString() {
        return "Vehicle{" 
                + "vehicleBrand = " + vehicleBrand 
                + ", cylinderCapacity = " + cylinderCapacity + " cc"
                + ", yearsOfTheVehicle = " + yearsOfTheVehicle + " years"
                + ", hybrid = " + hybrid 
                + ", greenTax = " + greenTax + " $" + '}';
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getYearsOfTheVehicle() {
        return yearsOfTheVehicle;
    }

    public void setYearsOfTheVehicle(int yearsOfTheVehicle) {
        this.yearsOfTheVehicle = yearsOfTheVehicle;
    }

    public boolean isHybrid() {
        return hybrid;
    }

    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }

    public float getGreenTax() {
        return greenTax;
    }

    public void setGreenTax(float greenTax) {
        this.greenTax = greenTax;
    }

   
}
