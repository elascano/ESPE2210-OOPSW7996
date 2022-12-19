package ec.edu.espe.taxes.model;
/**
 *
 * @author Alejandro Cuadrado, DCCO-ESPE
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
        return "Salary{" + "salary=" + salary + ", rentTax=" + rentTax + '}';
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public float getRentTax() {
        return rentTax;
    }
    public void setRentTax(float rentTax) {
        this.rentTax = rentTax;
    }
}
