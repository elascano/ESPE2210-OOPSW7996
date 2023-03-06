package ec.edu.espe.hw15.model;

/*
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */

public class Food {
    private int amount;

    public Food(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + '}';
    }
}
