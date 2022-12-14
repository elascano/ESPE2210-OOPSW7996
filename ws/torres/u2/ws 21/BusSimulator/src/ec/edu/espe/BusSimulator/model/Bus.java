package ec.edu.espe.BusSimulator.model;
/**
 *
 * @author Carlos Torres, T09_PACSTORE, DCCO-ESPE
 */
public class Bus {
    
    private int id;
    private String color;
    private int capacity;

    public Bus(int id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
    }
    
    public Bus(){
        id=0;
        color="";
        capacity=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bus{" + "id=" + id + ", color=" + color + ", capacity=" + capacity + '}';
    }
    
    
    
}
