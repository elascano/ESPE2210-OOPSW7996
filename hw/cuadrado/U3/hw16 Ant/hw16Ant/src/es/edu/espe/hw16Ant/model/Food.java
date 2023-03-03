package es.edu.espe.hw16Ant.model;
/**
 *
 * @author Alejandro Cuadrado, Developer Bears,DCCO-ESPE
 */
public class Food {
    private float amount;
    public Food(float amount) {
        this.amount = amount;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + '}';
    }
}