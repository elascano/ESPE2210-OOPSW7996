package ec.edu.espe.taxes.model;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class NaturalPerson {
    private float annualSalary;
    private float personalExpenses;
    private float withholdings;
    private float rentTax;

    public NaturalPerson(float annualSalary, float personalExpenses, float withholdings, float rentTax) {
        this.annualSalary = annualSalary;
        this.personalExpenses = personalExpenses;
        this.withholdings = withholdings;
        this.rentTax = rentTax;
    }

    /**
     * @return the annualSalary
     */
    public float getAnnualSalary() {
        return annualSalary;
    }

    /**
     * @param annualSalary the annualSalary to set
     */
    public void setAnnualSalary(float annualSalary) {
        this.annualSalary = annualSalary;
    }

    /**
     * @return the personalExpenses
     */
    public float getPersonalExpenses() {
        return personalExpenses;
    }

    /**
     * @param personalExpenses the personalExpenses to set
     */
    public void setPersonalExpenses(float personalExpenses) {
        this.personalExpenses = personalExpenses;
    }

    /**
     * @return the withholdings
     */
    public float getWithholdings() {
        return withholdings;
    }

    /**
     * @param withholdings the withholdings to set
     */
    public void setWithholdings(float withholdings) {
        this.withholdings = withholdings;
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
