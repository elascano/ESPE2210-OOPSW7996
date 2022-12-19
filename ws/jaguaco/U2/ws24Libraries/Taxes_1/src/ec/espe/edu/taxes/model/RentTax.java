package ec.espe.edu.taxes.model;
/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-ESPE
 */
public class RentTax {
    private float personalsalary;
    private float cost;
    private float expense;
    private float basicfraction;
    private float fractiontax;
    private float basicfractiontax;
    private float renttax;

    @Override
    public String toString() {
        return "RentTax{" + "personalsalary=" + personalsalary + ", cost=" + cost + ", expense=" + expense + ", basicfraction=" + basicfraction + ", fractiontax=" + fractiontax + ", basicfractiontax=" + basicfractiontax + ", renttax=" + renttax + '}';
    }

    public RentTax(float personalsalary, float cost, float expense, float basicfraction, float fractiontax, float basicfractiontax) {
        this.personalsalary = personalsalary;
        this.cost = cost;
        this.expense = expense;
        this.basicfraction = basicfraction;
        this.fractiontax = fractiontax;
        this.basicfractiontax = basicfractiontax;
        this.renttax = renttax;
    }

    /**
     * @return the personalsalary
     */
    public float getPersonalsalary() {
        return personalsalary;
    }

    /**
     * @param personalsalary the personalsalary to set
     */
    public void setPersonalsalary(float personalsalary) {
        this.personalsalary = personalsalary;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the expense
     */
    public float getExpense() {
        return expense;
    }

    /**
     * @param expense the expense to set
     */
    public void setExpense(float expense) {
        this.expense = expense;
    }

    /**
     * @return the basicfraction
     */
    public float getBasicfraction() {
        return basicfraction;
    }

    /**
     * @param basicfraction the basicfraction to set
     */
    public void setBasicfraction(float basicfraction) {
        this.basicfraction = basicfraction;
    }

    /**
     * @return the fractiontax
     */
    public float getFractiontax() {
        return fractiontax;
    }

    /**
     * @param fractiontax the fractiontax to set
     */
    public void setFractiontax(float fractiontax) {
        this.fractiontax = fractiontax;
    }

    /**
     * @return the basicfractiontax
     */
    public float getBasicfractiontax() {
        return basicfractiontax;
    }

    /**
     * @param basicfractiontax the basicfractiontax to set
     */
    public void setBasicfractiontax(float basicfractiontax) {
        this.basicfractiontax = basicfractiontax;
    }

    /**
     * @return the renttax
     */
    public float getRenttax() {
        return renttax;
    }

    /**
     * @param renttax the renttax to set
     */
    public void setRenttax(float renttax) {
        this.renttax = renttax;
    }
    
    
}
