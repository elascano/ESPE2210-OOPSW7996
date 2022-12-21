package ec.edu.espe.taxes.model;

/**
 *
 * @author Nicolay Chillo, Gaman GeekLords at DCOO-ESPE
 */
public class Salary {
    private float monthlySalary;
    private float annualSalary;
    private float rentTax;

    public Salary(float monthlySalary, float annualSalary, float rentTax) {
        this.monthlySalary = monthlySalary;
        this.annualSalary = annualSalary;
        this.rentTax = rentTax;
    }

    @Override
    public String toString() {
        return "Salary{" 
                + "monthlySalary = " + monthlySalary + " $"
                + ", annualSalary = " + annualSalary + " $"
                + ", rentTax = " + rentTax + " $" + '}';
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public float getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(float annualSalary) {
        this.annualSalary = annualSalary;
    }

    public float getRentTax() {
        return rentTax;
    }

    public void setRentTax(float rentTax) {
        this.rentTax = rentTax;
    }

    
}
