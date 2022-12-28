package ec.edu.espe.taxes.model;

/**
 *
 * @author David Toapanta, Pacstore, DCCO-ESPE
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getCosts() {
        return costs;
    }

    public void setCosts(float costs) {
        this.costs = costs;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
