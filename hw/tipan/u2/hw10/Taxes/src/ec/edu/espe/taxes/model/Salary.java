
package ec.edu.espe.taxes.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Salary {
    private String name;
    private int id;
    private float salary;
    private float rentTax;

    public Salary(String name, int id, float salary, float rentTax) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.rentTax = rentTax;
    }

    @Override
    public String toString() {
        return "Salary{" + "name=" + getName() + ", id=" + getId() + ", salary=" + getSalary() + ", rentTax=" + getRentTax() + '}';
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the rentTax
     */
    public float getRentTax() {
        return rentTax;
    }

    /**
     * @param rentTax the rentTax to set
     */
    public void setRentTax(float rentTax) {
        this.rentTax = rentTax;
    }
    
    
    
}
