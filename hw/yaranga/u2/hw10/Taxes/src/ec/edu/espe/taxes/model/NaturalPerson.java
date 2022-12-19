
package ec.edu.espe.taxes.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class NaturalPerson {
    private String name;
    private float salary;
    private float costs;  
    private Vehicle vehicle;

     @Override
    public String toString() {
        return "NaturalPerson{" + "name=" + name + ", salary=" + salary + ", costs=" + costs + ", vehicle=" + vehicle + '}';
    }
    
    public NaturalPerson(String name, float salary, float costs, Vehicle vehicle) {
        this.name = name;
        this.salary = salary;
        this.costs = costs;
        this.vehicle = vehicle;
    }
 
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the costs
     */
    public float getCosts() {
        return costs;
    }

    /**
     * @param costs the costs to set
     */
    public void setCosts(float costs) {
        this.costs = costs;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    
}
