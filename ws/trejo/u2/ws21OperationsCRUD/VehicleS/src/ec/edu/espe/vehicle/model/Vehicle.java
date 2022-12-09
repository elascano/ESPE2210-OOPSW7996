
package ec.edu.espe.vehicle.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Vehicle {
    private int id;
    private String nameOfDriver;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public Vehicle() {
        this.id = 0;
        this.nameOfDriver = "";
        this.color = "";
    }
    
    public Vehicle(int id, String nameOfDriver, String color) {
        this.id = id;
        this.nameOfDriver = nameOfDriver;
        this.color = color;
    }
    
    
    
    
    
    
    
}
