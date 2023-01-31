
package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public class FoodPile {
    private float pileAmount;
    private Cell position;

    @Override
    public String toString() {
        return "FoodPile{" + "pileAmount=" + getPileAmount() + ", position=" + getPosition() + '}';
    }

    public FoodPile(float pileAmount, Cell position) {
        this.pileAmount = pileAmount;
        this.position = position;
    }
    
    public Food yieldFood(float amount){
        Food food;
        food=new Food(amount);
        
        System.out.println("Food pile is yielding -> " + food);
        
        return food;
    }

    /**
     * @return the pileAmount
     */
    public float getPileAmount() {
        return pileAmount;
    }

    /**
     * @param pileAmount the pileAmount to set
     */
    public void setPileAmount(float pileAmount) {
        this.pileAmount = pileAmount;
    }

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }
    
    
    
}
