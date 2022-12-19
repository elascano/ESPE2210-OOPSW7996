package ec.edu.espe.taxes.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class NaturalPerson {
    private String name;
    private float wage;
    private float costs;
    private Vehicle vehicle;

    @Override
    public String toString() {
        return "NaturalPerson{" + "name=" + name + ", wage=" + wage + ", costs=" + costs + ", vehicle=" + vehicle + '}';
    }

    public NaturalPerson(String name, float wage, float costs, Vehicle vehicle) {
        this.name = name;
        this.wage = wage;
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
     * @return the wage
     */
    public float getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(float wage) {
        this.wage = wage;
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
