package ec.edu.espe.hw.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class FoodPile {
     private int pileAmount;
    private Cell position;

    public FoodPile(int pileAmount, Cell position) {
        this.pileAmount = pileAmount;
        this.position = position;
    }

    @Override
    public String toString() {
        return "FoodPile{" + "pileAmount=" + pileAmount + ", position=" + position + '}';
    }
    
    public Food yieldFood(int amount){
        Food food;
        food = new Food(amount);
        return food;
    }

    public int getPileAmount() {
        return pileAmount;
    }

    public void setPileAmount(int pileAmount) {
        this.pileAmount = pileAmount;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }
    
}
