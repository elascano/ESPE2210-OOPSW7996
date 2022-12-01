package ec.edu.espe.bus.model;

/**
 *
 * @author Alex Trejo, PACSTORE, DCCO-ESPE
 */
public class Bus {

    private int id;
    private String nameOfDriver;
    private String color;

    public Bus(int id, String nameOfDriver, String color) {
        this.id = id;
        this.nameOfDriver = nameOfDriver;
        this.color = color;
    }

    public Bus() {
        id = 0;
        nameOfDriver = "";
        color = "";
    }

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

    
    @Override
    public String toString() {
        return "Bus{" + "id=" + id + ", nameOfDriver=" + nameOfDriver + ", color=" + color + '}';
    }
    
    

}
