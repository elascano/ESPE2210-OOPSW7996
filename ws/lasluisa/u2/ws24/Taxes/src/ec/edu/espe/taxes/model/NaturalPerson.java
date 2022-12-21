package ec.edu.espe.taxes.model;

/**
 *
 * @author Erick Lasluisa, Pythons, DCCO-ESPE
 */
public class NaturalPerson {
    private float netIncome;
    private float bill;
    private float rentTax;

    @Override
    public String toString() {
        return "NaturalPerson{" + "income=" + getNetIncome() + ", bill=" + getBill() + ", rentTax=" + getRentTax() + '}';
    }

    public NaturalPerson(float income, float bill, float incomeTax) {
        this.netIncome = income;
        this.bill = bill;
        this.rentTax = incomeTax;
    }
    
    /**
     * @return the netIncome
     */
    public float getNetIncome() {
        return netIncome;
    }

    /**
     * @param netIncome the netIncome to set
     */
    public void setNetIncome(float netIncome) {
        this.netIncome = netIncome;
    }

    /**
     * @return the bill
     */
    public float getBill() {
        return bill;
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(float bill) {
        this.bill = bill;
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
