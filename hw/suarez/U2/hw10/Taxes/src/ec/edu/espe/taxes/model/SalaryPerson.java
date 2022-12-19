package ec.edu.espe.taxes.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class SalaryPerson {
   private float monthlySalary;
   private float rentTax;

    public SalaryPerson(float monthlySalary, float rentTax) {
        this.monthlySalary = monthlySalary;
        this.rentTax = rentTax;
    }

    @Override
    public String toString() {
        return "SalaryPerson{" + "monthlySalary=" + monthlySalary + ", rentTax=" + rentTax + '}';
    }

    /**
     * @return the salaryPerson
     */
    public float getSalaryPerson() {
        return monthlySalary;
    }

    /**
     * @param salaryPerson the salaryPerson to set
     */
    public void setSalaryPerson(float salaryPerson) {
        this.monthlySalary = salaryPerson;
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
