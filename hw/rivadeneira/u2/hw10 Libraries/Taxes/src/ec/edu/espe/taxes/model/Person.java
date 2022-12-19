

package ec.edu.espe.taxes.model;

/**
 *
 * @author Ariel Rivadeneira, Search Engine Bandits, DCCO-ESPE
 */
public class Person {
    
    private String name;
    private float salary;
    private float costs;  
    private Car car;
    
     @Override
    public String toString() {
        return "Person{" + "name=" + name + ", salary=" + salary + ", costs=" + costs + ", car=" + car + '}';
    }
    
    public Person(String name, float salary, float costs, Car car) {
        this.name = name;
        this.salary = salary;
        this.costs = costs;
        this.car = car;
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
     * @return the car
     */
    public Car getCar() {
        return car;
    }

    /**
     * @param car the car to set
     */
    public void setCar(Car car) {
        this.car = car;
    }
    
    
}
