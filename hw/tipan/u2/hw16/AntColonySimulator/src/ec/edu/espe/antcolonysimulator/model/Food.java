
package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class Food {
    private float amount;

    @Override
    public String toString() {
        return "Food{" + "amount=" + getAmount() + '}';
    }

    public Food(float amount) {
        this.amount = amount;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
}
