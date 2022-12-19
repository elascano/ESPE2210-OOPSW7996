package ec.edu.espe.taxes.model;

import java.text.DecimalFormat;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Salary {

    private float salary;
    private float rentTax;

    public Salary(float salary, float rentTax) {
        this.salary = salary;
        this.rentTax = rentTax;
    }

    DecimalFormat formatTax = new DecimalFormat("#.00");

    @Override
    public String toString() {
        return "Salary{" + "salary = " + "$" + formatTax.format(salary) + ",Rent Tax = " + "$" + formatTax.format(rentTax) + '}';
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
