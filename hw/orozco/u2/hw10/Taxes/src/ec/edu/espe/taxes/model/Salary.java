package ec.edu.espe.taxes.model;

/**
 *
 * @author Luis Orozco, Pythons, DCCO-ESPE
 */
public class Salary {
    private float salary;
    private float rentTax;

    public Salary(float salary, float rentTax) {
        this.salary = salary;
        this.rentTax = rentTax;
    }

    @Override
    public String toString() {
        return "Salary{" + "salary = " + salary + ", rentTax = " + rentTax + '}';
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
