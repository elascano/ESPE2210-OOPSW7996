
package ec.edu.espe.antcolonysimulator.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class FoodPile{
    
    private int pileAmount;
    private Cell position;
    
    public static Food yieldFood(int amount){
        Food food = new Food();
        return food;
    }
    
    public void createFood(){}

    public FoodPile() {
        this.pileAmount = 0;
        this.position = null;
    }
    
    public FoodPile(int pileAmount, Cell position) {
        this.pileAmount = pileAmount;
        this.position = position;
    }

    @Override
    public String toString() {
        return "FoodPile{" + "pileAmount=" + getPileAmount() + ", position=" + getPosition() + '}';
    }

    /**
     * @return the pileAmount
     */
    public int getPileAmount() {
        return pileAmount;
    }

    /**
     * @param pileAmount the pileAmount to set
     */
    public void setPileAmount(int pileAmount) {
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
