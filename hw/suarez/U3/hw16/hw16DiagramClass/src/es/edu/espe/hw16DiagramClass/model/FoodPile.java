package es.edu.espe.hw16DiagramClass.model;

/**
 *
 * @author Matias Suarez,WebMasterTeam,DCCO-ESPE
 */
public class FoodPile {

    private float pileAmount;
    private Cell position;

    public static Food yieldFood(float amount) {
        Food food = new Food(amount);
        System.out.println("yieldFood" + food);
        return (food);
    }

    public FoodPile(float pileAmount, Cell position) {
        this.pileAmount = pileAmount;
        this.position = position;
    }

    public float getPileAmount() {
        return pileAmount;
    }

    public void setPileAmount(float pileAmount) {
        this.pileAmount = pileAmount;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "FoodPile{" + "pileAmount=" + pileAmount + ", position=" + position + '}';
    }

}
